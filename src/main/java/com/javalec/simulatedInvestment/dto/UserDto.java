package com.javalec.simulatedInvestment.dto;

public class UserDto {
	String userId;
	String userPw;
	String userName;
	String userEMail;
	int userCashAmonut;

	public UserDto() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDto(String userId, String userPw, String userName, String userEMail, int userCashAmonut) {
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userEMail = userEMail;
		this.userCashAmonut = userCashAmonut;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEMail() {
		return userEMail;
	}

	public void setUserEMail(String userEMail) {
		this.userEMail = userEMail;
	}

	public int getUserCashAmonut() {
		return userCashAmonut;
	}

	public void setUserCashAmonut(int userCashAmonut) {
		this.userCashAmonut = userCashAmonut;
	}
	
	
	
	
}
