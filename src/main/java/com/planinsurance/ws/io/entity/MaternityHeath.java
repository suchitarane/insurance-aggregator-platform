package com.planinsurance.ws.io.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Maternity")
public class MaternityHeath {

	// owns the relationship
	@OneToOne(mappedBy = "maternityHeath", cascade = CascadeType.ALL)
	private Plan plan;

	@Id
	@Column(nullable = false, unique = true)
	private String maternityHeathId;

	@Column(nullable = false, length = 50)
	private String waitingPeriod;

	@Column(nullable = false, length = 50)
	private String newBornBabyCoverDetails;

	@Column(nullable = false, length = 50)
	private Integer sumAssuredForNewBorn;

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public String getMaternityHeathId() {
		return maternityHeathId;
	}

	public void setMaternityHeathId(String maternityHeathId) {
		this.maternityHeathId = maternityHeathId;
	}

	public String getWaitingPeriod() {
		return waitingPeriod;
	}

	public void setWaitingPeriod(String waitingPeriod) {
		this.waitingPeriod = waitingPeriod;
	}

	public String getNewBornBabyCoverDetails() {
		return newBornBabyCoverDetails;
	}

	public void setNewBornBabyCoverDetails(String newBornBabyCoverDetails) {
		this.newBornBabyCoverDetails = newBornBabyCoverDetails;
	}

	public Integer getSumAssuredForNewBorn() {
		return sumAssuredForNewBorn;
	}

	public void setSumAssuredForNewBorn(Integer sumAssuredForNewBorn) {
		this.sumAssuredForNewBorn = sumAssuredForNewBorn;
	}

}
