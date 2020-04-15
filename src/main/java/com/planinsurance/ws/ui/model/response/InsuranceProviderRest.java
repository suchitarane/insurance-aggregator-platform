package com.planinsurance.ws.ui.model.response;

public class InsuranceProviderRest {
	private Integer ipContactNo, ipNetworkHospitals, ipIncurredClaimRatio, ipGrievancesSettledRatio;
	private String ipId, ipName, ipAddress;
	private String ipemail;

	public String getIpId() {
		return ipId;
	}

	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public Integer getIpContactNo() {
		return ipContactNo;
	}

	public void setIpContactNo(Integer ipContactNo) {
		this.ipContactNo = ipContactNo;
	}

	public Integer getIpNetworkHospitals() {
		return ipNetworkHospitals;
	}

	public void setIpNetworkHospitals(Integer ipNetworkHospitals) {
		this.ipNetworkHospitals = ipNetworkHospitals;
	}

	public Integer getIpIncurredClaimRatio() {
		return ipIncurredClaimRatio;
	}

	public void setIpIncurredClaimRatio(Integer ipIncurredClaimRatio) {
		this.ipIncurredClaimRatio = ipIncurredClaimRatio;
	}

	public Integer getIpGrievancesSettledRatio() {
		return ipGrievancesSettledRatio;
	}

	public void setIpGrievancesSettledRatio(Integer ipGrievancesSettledRatio) {
		this.ipGrievancesSettledRatio = ipGrievancesSettledRatio;
	}

	public String getIpName() {
		return ipName;
	}

	public void setIpName(String ipName) {
		this.ipName = ipName;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getIpemail() {
		return ipemail;
	}

	public void setIpemail(String ipemail) {
		this.ipemail = ipemail;
	}


}
