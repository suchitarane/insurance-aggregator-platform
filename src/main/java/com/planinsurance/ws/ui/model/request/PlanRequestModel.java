package com.planinsurance.ws.ui.model.request;


public class PlanRequestModel 
{

	private String planId;
	private String planName;
	private String planType;
	private String planDetails;
	private Double minSumInsured; 
	private Double maxSumInsured; 
	private String minPoliyTenure; 
	private String maxPoliyTenure; 
	private Integer minAge; 
	private Integer maxAge;  
	private String availabilityOfRenewal; 
	private String planAddOns;
	

	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getPlanDetails() {
		return planDetails;
	}
	public void setPlanDetails(String planDetails) {
		this.planDetails = planDetails;
	}
	public Double getMinSumInsured() {
		return minSumInsured;
	}
	public void setMinSumInsured(Double minSumInsured) {
		this.minSumInsured = minSumInsured;
	}
	public Double getMaxSumInsured() {
		return maxSumInsured;
	}
	public void setMaxSumInsured(Double maxSumInsured) {
		this.maxSumInsured = maxSumInsured;
	}
	public String getMinPoliyTenure() {
		return minPoliyTenure;
	}
	public void setMinPoliyTenure(String minPoliyTenure) {
		this.minPoliyTenure = minPoliyTenure;
	}
	public String getMaxPoliyTenure() {
		return maxPoliyTenure;
	}
	public void setMaxPoliyTenure(String maxPoliyTenure) {
		this.maxPoliyTenure = maxPoliyTenure;
	}
	public Integer getMinAge() {
		return minAge;
	}
	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}
	public Integer getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}
	public String getAvailabilityOfRenewal() {
		return availabilityOfRenewal;
	}
	public void setAvailabilityOfRenewal(String availabilityOfRenewal) {
		this.availabilityOfRenewal = availabilityOfRenewal;
	}
	public String getPlanAddOns() {
		return planAddOns;
	}
	public void setPlanAddOns(String planAddOns) {
		this.planAddOns = planAddOns;
	}
	
}
