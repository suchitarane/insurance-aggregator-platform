package com.planinsurance.ws.ui.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.planinsurance.ws.io.entity.InsuranceProviderEntity;

@Repository
public interface InsuranceProviderRepository extends CrudRepository<InsuranceProviderEntity, Long>
{
	InsuranceProviderEntity findByipId(String ipId);

}
