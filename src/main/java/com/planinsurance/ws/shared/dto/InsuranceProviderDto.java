package com.planinsurance.ws.shared.dto;

import java.io.Serializable;

public class InsuranceProviderDto implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7920137452795816129L;

	//value from db
	private long id;
	//public userid 
	private String ipId;
	private Integer ipContactNo,ipNetworkHospitals, ipIncurredClaimRatio, ipGrievancesSettledRatio; 
	private String ipName, ipUserName, ipPassword, ipAddress;
	private String encryptedPassword,ipPanNo;
	private String emailVertificationToken;
	private Boolean emailverificationStatus=false;
	private String ipemail;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public String getIpPanNo() {
		return ipPanNo;
	}
	public void setIpPanNo(String ipPanNo) {
		this.ipPanNo = ipPanNo;
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
	public String getIpUserName() {
		return ipUserName;
	}
	public void setIpUserName(String ipUserName) {
		this.ipUserName = ipUserName;
	}
	public String getIpPassword() {
		return ipPassword;
	}
	public void setIpPassword(String ipPassword) {
		this.ipPassword = ipPassword;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public String getEmailVertificationToken() {
		return emailVertificationToken;
	}
	public void setEmailVertificationToken(String emailVertificationToken) {
		this.emailVertificationToken = emailVertificationToken;
	}
	public Boolean getEmailverificationStatus() {
		return emailverificationStatus;
	}
	public void setEmailverificationStatus(Boolean emailverificationStatus) {
		this.emailverificationStatus = emailverificationStatus;
	}
	public String getIpemail() {
		return ipemail;
	}
	public void setIpemail(String ipemail) {
		this.ipemail = ipemail;
	}
	
	
}
