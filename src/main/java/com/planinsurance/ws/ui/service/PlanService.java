package com.planinsurance.ws.ui.service;


import java.util.Iterator;
import java.util.List;

import com.planinsurance.ws.io.entity.Plan;
import com.planinsurance.ws.shared.dto.PlanDto;
import com.planinsurance.ws.ui.model.response.PlanRest;

public interface PlanService 
{
	public PlanDto createPlan(PlanDto plandto);
	public PlanDto getPlanById(String planId);
	public List<PlanDto> getAllPlans();
	public PlanDto updatePlan(PlanDto plandto, String planId);
	public void deletePlanById(String planId);
}
