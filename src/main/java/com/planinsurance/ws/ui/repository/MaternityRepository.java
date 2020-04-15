package com.planinsurance.ws.ui.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.planinsurance.ws.io.entity.MaternityHeath;

@Repository
public interface MaternityRepository extends CrudRepository<MaternityHeath, String> {
	
	
}
