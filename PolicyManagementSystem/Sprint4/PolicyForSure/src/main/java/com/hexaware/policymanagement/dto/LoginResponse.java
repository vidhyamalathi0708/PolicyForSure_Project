package com.hexaware.policymanagement.dto;

public class LoginResponse
{
	
	public String userId;
	public String userType;
	public String token;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public LoginResponse(String userId, String userType, String token) {
		super();
		this.userId = userId;
		this.userType = userType;
		this.token = token;
	}
	public LoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoginResponse [userId=" + userId + ", userType=" + userType + ", token=" + token + "]";
	}
	
	

}
