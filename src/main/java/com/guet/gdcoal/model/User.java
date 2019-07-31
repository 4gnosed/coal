package com.guet.gdcoal.model;

public class User {

	private Integer userId;
	private String userName;
	private String userEnName;
	private String userPassword;
	private String userPhone;
	private String userAddress;
	private String userEmail;
	private Integer companyId;
	private Integer roleId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEnName() {
		return userEnName;
	}

	public void setUserEnName(String userEnName) {
		this.userEnName = userEnName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEnName=" + userEnName + ", userPassword="
				+ userPassword + ", userPhone=" + userPhone + ", userAddress=" + userAddress + ", userEmail="
				+ userEmail + ", companyId=" + companyId + ", roleId=" + roleId + "]";
	}
}
