package com.nt.DTO;

public class UserDTO {
	private String username;
	private String pwd;
	
	public UserDTO() {
		System.out.println("UserDTO===>Instantiation");
	}
	
	public String getUsername() {
		return username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "UserBO [username=" + username + ", pwd=" + pwd + "]";
	}
}
