package com.planinsurance.ws.ui.service.impl;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.planinsurance.ws.io.entity.Plan;
import com.planinsurance.ws.io.exceptions.RecordNotFoundException;
import com.planinsurance.ws.shared.dto.PlanDto;
import com.planinsurance.ws.ui.repository.PlanRepository;
import com.planinsurance.ws.ui.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {
	@Autowired
	PlanRepository planrepository;
	
	ModelMapper model = new ModelMapper();

	public PlanDto createPlan(@Valid PlanDto plandto) {

		Plan check = planrepository.findByplanId(plandto.getPlanId());

		if (check != null)
			throw new RecordNotFoundException("Record already exist");

		Plan planValue = model.map(plandto, Plan.class);

		Plan storedplanDetails = planrepository.save(planValue);

		PlanDto planDtoValue = model.map(storedplanDetails, PlanDto.class);
		
		return planDtoValue;
	}

	public List<PlanDto> getAllPlans() {

		List<PlanDto> planList = new ArrayList<>(); //empty
		
		List<Plan> plandetails =  (List<Plan>) planrepository.findAll();
	
		for(Plan entity:plandetails ) {
			PlanDto planDtoValue = model.map(entity, PlanDto.class);
			planList.add(planDtoValue);
		}
	
		if (plandetails != null) {
			return planList;
		} 
		else
			throw new RecordNotFoundException("Records does not exist");
	}

	public PlanDto getPlanById(String planId) {

		Plan storedplanDetails = planrepository.findByplanId(planId);

		if (storedplanDetails != null) {

			PlanDto planDtoValue = model.map(storedplanDetails, PlanDto.class);
			
			return planDtoValue;
		} 
		else {
			throw new RecordNotFoundException("Record does not exist for given Plan Id");
		}

	}

	public PlanDto updatePlan(PlanDto plandto, String planId) {

		Plan check = planrepository.findByplanId(planId);
		if (check != null) {
			// push input to entity
			Plan planValue = model.map(plandto, Plan.class);
		
			//plan.setPlanMargineToAggregator(10.5);

			// save in db
			Plan updatedplanDetails = planrepository.save(planValue);

			PlanDto planDtoValue = model.map(updatedplanDetails, PlanDto.class);
		
			return planDtoValue;
		} else
			throw new RecordNotFoundException("Record does not exist for given Plan Id, Please check your Plan Id");

	}

	public void deletePlanById(String planId) {
		Plan plan = planrepository.findByplanId(planId);
		if (plan!=null) {
			planrepository.deleteById(planId);
		} 
		else {
			throw new RecordNotFoundException("Record does not exist for given Plan Id, Please check your Plan Id to delete the record");
		}

	}
}
