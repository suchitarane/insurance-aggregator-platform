package com.planinsurance.ws.io.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Plan")
public class Plan {
	
	@OneToOne
	@JoinColumn(name="maternityHeathId")
	private MaternityHeath maternityHeath; //creates fk
	
	@Id
	@Column(nullable = false, unique = true)
	private String planId;

	@Column(nullable = false, length = 50)
	private String planName;

	@Column(nullable = false, length = 50)
	private String planType;

	@Column(nullable = false, length = 100)
	private String planDetails;

	@Column(nullable = false)
	private Double minSumInsured;

	@Column(nullable = false)
	private Double maxSumInsured;

	@Column(nullable = false)
	private String minPoliyTenure;

	@Column(nullable = false)
	private String maxPoliyTenure;

	@Column(nullable = false)
	private Integer minAge;

	@Column(nullable = false)
	private Integer maxAge;

	@Column(nullable = false, length = 20)
	private String availabilityOfRenewal;

	@Column(nullable = false, length = 50)
	private String planAddOns;

	public MaternityHeath getMaternityHeath() {
		return maternityHeath;
	}

	public void setMaternityHeath(MaternityHeath maternityHeath) {
		this.maternityHeath = maternityHeath;
	}

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
