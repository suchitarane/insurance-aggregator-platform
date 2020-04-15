package com.planinsurance.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="insuranceprovider")
public class InsuranceProviderEntity implements Serializable
{
		/**
	 * 
	 */
	private static final long serialVersionUID = -4130155211449149529L;

		//value from db
		@Id
		@GeneratedValue
		private long id;
		
		//public userid 
		@Column(nullable = false)
		private String ipId;
		
		@Column(nullable = false, length= 20)
		private String ipName;
		
		@Column(nullable = false, length= 50, unique = true)
		private String ipemail;
		
		@Column(nullable = false, length= 20)
		private String ipUserName;
		
		@Column(nullable = false, length= 20)
		private String ipAddress;
		
		@Column(nullable = false, length= 20)
		private String ipPassword;
		
		@Column(nullable = false)
		private Integer ipContactNo;
		
		@Column(nullable = false)
		private String ipPanNo;
		
		@Column(nullable = false)
		private Integer ipNetworkHospitals;
		
		@Column(nullable = false)
		private Integer ipIncurredClaimRatio;
		
		@Column(nullable = false)
		private Integer ipGrievancesSettledRatio; 
		
		@Column(nullable = false)
		private String encryptedPassword;
		
		
		private String emailVertificationToken;
		
		@Column(nullable = false)
		private Boolean emailverificationStatus =false;
		
		

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

		public String getIpName() {
			return ipName;
		}

		public void setIpName(String ipName) {
			this.ipName = ipName;
		}

		public String getIpemail() {
			return ipemail;
		}

		public void setIpemail(String ipemail) {
			this.ipemail = ipemail;
		}

		public String getIpUserName() {
			return ipUserName;
		}

		public void setIpUserName(String ipUserName) {
			this.ipUserName = ipUserName;
		}

		public String getIpAddress() {
			return ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getIpPassword() {
			return ipPassword;
		}

		public void setIpPassword(String ipPassword) {
			this.ipPassword = ipPassword;
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
		
		

}
