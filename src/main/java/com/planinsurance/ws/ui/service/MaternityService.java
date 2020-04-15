package com.planinsurance.ws.ui.service;

import com.planinsurance.ws.shared.dto.MaternityDto;
import com.planinsurance.ws.ui.model.response.MaternityRest;

public interface MaternityService {
	
	public MaternityRest createMaternityPlan( MaternityDto maternityDto);

}
