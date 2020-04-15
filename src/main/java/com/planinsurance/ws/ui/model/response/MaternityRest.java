package com.planinsurance.ws.ui.model.response;

import org.springframework.stereotype.Component;

import com.planinsurance.ws.io.entity.Plan;


@Component
public class MaternityRest {

	private Plan plan;
	
	private String maternityHeathId;

	private String waitingPeriod;

	private String newBornBabyCoverDetails;

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
