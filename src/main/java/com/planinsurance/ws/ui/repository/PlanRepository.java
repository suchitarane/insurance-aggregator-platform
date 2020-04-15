package com.planinsurance.ws.ui.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.planinsurance.ws.io.entity.Plan;

@Repository
public interface PlanRepository extends CrudRepository<Plan, String> 
{
	Plan findByplanId(String planId);
}
