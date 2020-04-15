package com.planinsurance.ws.shared;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class Utils 
{
public String generateid(int length)
{
	return generateRandomString(length);
}

private String generateRandomString(int length)
{
	return UUID.randomUUID().toString();
}

}
