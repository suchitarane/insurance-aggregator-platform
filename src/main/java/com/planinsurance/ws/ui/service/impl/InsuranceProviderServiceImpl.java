package com.planinsurance.ws.ui.service.impl;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planinsurance.ws.io.entity.InsuranceProviderEntity;
import com.planinsurance.ws.shared.dto.InsuranceProviderDto;
import com.planinsurance.ws.ui.repository.InsuranceProviderRepository;
import com.planinsurance.ws.ui.service.InsuranceProviderService;


@Service
public class InsuranceProviderServiceImpl implements InsuranceProviderService
{
	@Autowired
	InsuranceProviderRepository insuranceProviderRepository;
	
	@Autowired
	com.planinsurance.ws.shared.Utils utils;
	
	
	@Override
	public InsuranceProviderDto createIp(@Valid InsuranceProviderDto ipdto) 
	{
		
		InsuranceProviderEntity insuranceProviderEntity = new InsuranceProviderEntity();
		
		//check if user exist in db
		InsuranceProviderEntity check = insuranceProviderRepository.findByipId(ipdto.getIpId());
		if(check!=null) throw new RuntimeException("record exist");
		
		//copy requested data obj  to entity
		BeanUtils.copyProperties(ipdto, insuranceProviderEntity);
		
		
		// create ipId
				String ipIdvalue = utils.generateid(5);
				insuranceProviderEntity.setIpId(ipIdvalue);

		insuranceProviderEntity.setEncryptedPassword("abc");
		
			//save to db -> pass to entity
		InsuranceProviderEntity storedIpDetails=insuranceProviderRepository.save(insuranceProviderEntity);
		
		
		
		//entity->dto->return
		InsuranceProviderDto returnValue = new InsuranceProviderDto();
		BeanUtils.copyProperties(storedIpDetails, returnValue);
		
		
		return returnValue;
	}

}
