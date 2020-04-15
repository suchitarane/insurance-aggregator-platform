package com.planinsurance.ws.ui.controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.planinsurance.ws.shared.dto.PlanDto;
import com.planinsurance.ws.ui.model.request.PlanRequestModel;
import com.planinsurance.ws.ui.model.response.PlanRest;
import com.planinsurance.ws.ui.service.PlanService;

@RestController
@RequestMapping("/plans")
public class PlanController {
	@Autowired
	PlanService planService;

	ModelMapper model = new ModelMapper();

	@PostMapping(consumes = { "application/json", "application/xml" }, produces = { "application/json",
			"application/xml" })
	public PlanRest createPlan(@RequestBody @Valid PlanRequestModel planRequestModel) {

		PlanDto planDtoValue = model.map(planRequestModel, PlanDto.class);

		PlanDto createdPlan = planService.createPlan(planDtoValue);

		PlanRest planRestValue = model.map(createdPlan, PlanRest.class);
	
		return planRestValue;
	}

	@GetMapping(path = "/{planId}", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<PlanRest> getPlanById(@Valid @PathVariable String planId)
	{

		PlanDto storedplanDto = planService.getPlanById(planId);

		PlanRest planRestValue = model.map(storedplanDto, PlanRest.class);
	
		return new ResponseEntity<>(planRestValue, HttpStatus.ACCEPTED);

	}

	@GetMapping(consumes = { "application/json", "application/xml" }, produces = { "application/json",
			"application/xml" })
	public ResponseEntity<List<PlanRest>> getAllPlan() {

		List<PlanRest> allPlans = new ArrayList<>();

		List<PlanDto> listDto = planService.getAllPlans();

		for (PlanDto dto : listDto) {
			PlanRest planRestValue = model.map(dto, PlanRest.class);
			allPlans.add(planRestValue);
		}

		return new ResponseEntity<List<PlanRest>>(allPlans, HttpStatus.OK);

	}

	@PutMapping(path = "/{planId}", consumes = { "application/json", "application/xml" }, produces = {
			"application/json", "application/xml" })
	public ResponseEntity<PlanRest> updatePlan(@Valid @RequestBody PlanRequestModel planRequestModel,
			@PathVariable String planId) {

		PlanDto planDtoValue = model.map(planRequestModel, PlanDto.class);
		
		PlanDto updatedPlan = planService.updatePlan(planDtoValue, planId);

		PlanRest planRestValue = model.map(updatedPlan, PlanRest.class);

		return new ResponseEntity<>(planRestValue, HttpStatus.ACCEPTED);

	}

	@DeleteMapping(path = "/{planId}", consumes = { "application/json", "application/xml" })
	public HttpStatus deletePlan(@Valid @PathVariable String planId) {

		planService.deletePlanById(planId);

		return HttpStatus.ACCEPTED;
	}

}
