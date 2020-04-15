package com.planinsurance.ws.ui.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planinsurance.ws.shared.dto.InsuranceProviderDto;
import com.planinsurance.ws.ui.model.request.InsuranceProviderRequestModel;
import com.planinsurance.ws.ui.model.response.InsuranceProviderRest;
import com.planinsurance.ws.ui.service.InsuranceProviderService;
import com.planinsurance.ws.ui.service.impl.InsuranceProviderServiceImpl;

@RestController
@RequestMapping("/insurance-providers")
public class InsuranceProviderController 
{
	@Autowired
	InsuranceProviderService InsuranceProviderService;
	
	@PostMapping(produces={ "application/json","application/xml"  })
	public InsuranceProviderRest createInsuranceProvider(@RequestBody @Valid InsuranceProviderRequestModel insuranceProviderDetails)
	{
		//data(json)->method(converted to java obj)->dto->service->dto->return result
		
		InsuranceProviderRest returnValue = new InsuranceProviderRest();
		InsuranceProviderDto ipdto = new InsuranceProviderDto();
		
		//copy requested data obj  to dto- why????
		BeanUtils.copyProperties(insuranceProviderDetails, ipdto);
		
		//from dto pass to service layer and store in dto layer
		InsuranceProviderDto createdIp = InsuranceProviderService.createIp(ipdto);
		
		//copy response data to return obj
		BeanUtils.copyProperties(createdIp, returnValue);
		
		return returnValue;
	}
	
	@GetMapping
	public String getInsuranceProvider()
	{
		return "0get";
	}
	
	@PutMapping
	public String updateInsuranceProvider()
	{
		return "0";
	}
	
	@DeleteMapping
	public String deleteInsuranceProvider()
	{
		return "0";
	}
}
