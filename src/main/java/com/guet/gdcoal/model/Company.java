package com.guet.gdcoal.model;

public class Company {

	private Integer companyId;
	private String companyName;
	private String companyLeader;
	private String companyPhone;
	private String companyAddress;
	private String companyEmail;

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyLeader() {
		return companyLeader;
	}

	public void setCompanyLeader(String companyLeader) {
		this.companyLeader = companyLeader;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyLeader=" + companyLeader
				+ ", companyPhone=" + companyPhone + ", companyAddress=" + companyAddress + ", companyEmail="
				+ companyEmail + "]";
	}

}
