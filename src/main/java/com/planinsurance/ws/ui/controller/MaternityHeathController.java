package com.planinsurance.ws.ui.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.planinsurance.ws.shared.dto.MaternityDto;
import com.planinsurance.ws.ui.model.request.MaternityRequestModel;
import com.planinsurance.ws.ui.model.response.MaternityRest;
import com.planinsurance.ws.ui.service.MaternityService;

@RestController
@RequestMapping("/maternityplans")
public class MaternityHeathController {

	@Autowired
	MaternityService maternityService;

	ModelMapper model = new ModelMapper();

	@PostMapping(consumes = { "application/json", "application/xml" }, produces = { "application/json",
			"application/xml" })
	public MaternityRest createMaternityPlan(@RequestBody MaternityRequestModel maternityRequestModel) {
		
		MaternityDto maternitydto = model.map(maternityRequestModel, MaternityDto.class);

		MaternityRest createdMaternityPlan = maternityService.createMaternityPlan(maternitydto);

		return createdMaternityPlan;
	}

	
	@GetMapping(consumes = { "application/json", "application/xml" }, produces = { "application/json",
			"application/xml" })
	public String display() {
		return "inside get method";
	}

}
