package com.planinsurance.ws.ui.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.planinsurance.ws.io.entity.MaternityHeath;
import com.planinsurance.ws.shared.dto.MaternityDto;
import com.planinsurance.ws.ui.model.response.MaternityRest;
import com.planinsurance.ws.ui.repository.MaternityRepository;
import com.planinsurance.ws.ui.service.MaternityService;

@Service
public class MaternityServiceImpl implements MaternityService {

	@Autowired
	MaternityRepository maternityRepository;
	
	ModelMapper model = new ModelMapper();

	public MaternityRest createMaternityPlan( MaternityDto maternityDto) {
		
		
		MaternityHeath maternityHeathEntityValue = model.map(maternityDto, MaternityHeath.class);
		
	
		MaternityHeath storedMaternityHeathEntity = maternityRepository.save(maternityHeathEntityValue);

		//till here data is stored:fk issue its null in db
		MaternityRest maternityDtoReturnValue = model.map(storedMaternityHeathEntity, MaternityRest.class);
		
		return maternityDtoReturnValue;
	}

}
