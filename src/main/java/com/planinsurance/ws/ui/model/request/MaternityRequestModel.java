package com.planinsurance.ws.ui.model.request;

public class MaternityRequestModel {

	private PlanRequestModel planRequestModel;

	private String maternityHeathId;

	private String waitingPeriod;

	private String newBornBabyCoverDetails;

	private Integer sumAssuredForNewBorn;

	public PlanRequestModel getPlanRequestModel() {
		return planRequestModel;
	}

	public void setPlanRequestModel(PlanRequestModel planRequestModel) {
		this.planRequestModel = planRequestModel;
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
