package com.planinsurance.ws.io.exceptions;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = { Exception.class })
	protected ResponseEntity<Object> handleExceptions (Exception ex, WebRequest request) 
	{
		String bodyOfResponse = "Check input values or contact customer care";
		//String bodyOfRespons = ex.getLocalizedMessage();
		
		//if(bodyOfRespons==null) bodyOfRespons = ex.toString();
				
		ExceptionResponse response = new ExceptionResponse();
		response.setMessage(bodyOfResponse);
		response.setTimestamp(new Date());
				
		return handleExceptionInternal(ex, response,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	}
/*
	@ExceptionHandler(value = { NullPointerException.class })
	protected ResponseEntity<Object> handleNullPointerException (NullPointerException ex, WebRequest request) 
	{
		String bodyOfResponse = "Null values not allowed";
		//String bodyOfRespons = ex.getLocalizedMessage();
		//	if(bodyOfRespons==null) bodyOfRespons = ex.toString();
				
		ExceptionResponse response = new ExceptionResponse();
		response.setMessage(bodyOfResponse);
		response.setTimestamp(new Date());
		
		return handleExceptionInternal(ex, response,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	}
	*/
	
	@ExceptionHandler(value = {RecordNotFoundException.class })
	protected ResponseEntity<Object> handleUserServiceException (RecordNotFoundException ex, WebRequest request) 
	{
		//generate msg
		String bodyOfRespons = ex.getLocalizedMessage();
		if(bodyOfRespons==null) bodyOfRespons = ex.toString();
		
		//storing and printing
		ExceptionResponse response = new ExceptionResponse();
		response.setMessage(bodyOfRespons);
		response.setTimestamp(new Date());
		
		return handleExceptionInternal(ex, response,new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	}

	@Override
	  protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,HttpHeaders headers, HttpStatus status, WebRequest request) {

	
		//ExceptionResponse errorDetails = new ExceptionResponse(new Date(), "Validation Failed",ex.getLocalizedMessage().toString());
		ExceptionResponse errorDetails = new ExceptionResponse(new Date(), "Validation Failed, Please check your inputs");
			    return new ResponseEntity(errorDetails, HttpStatus.BAD_GATEWAY);
		
		
		
	  }
	 
	
}
