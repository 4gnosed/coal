package com.guet.gdcoal.model;

public class CheckedInfo {
	Integer checkId;
	Integer userId;
	Integer purId;
	String time;
	String opinion;
	String operate;

	public Integer getCheckId() {
		return checkId;
	}

	public void setCheckId(Integer checkId) {
		this.checkId = checkId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPurId() {
		return purId;
	}

	public void setPurId(Integer purId) {
		this.purId = purId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}

	public String getOperate() {
		return operate;
	}

	public void setOperate(String operate) {
		this.operate = operate;
	}

	@Override
	public String toString() {
		return "CheckedInfo [checkId=" + checkId + ", userId=" + userId + ", purId=" + purId + ", time=" + time
				+ ", opinion=" + opinion + ", operate=" + operate + "]";
	}
}
