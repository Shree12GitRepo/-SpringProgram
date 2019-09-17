package com.nt.Command;

public class UserCommand {
	private String username;
	private String pwd;
	
	public UserCommand() {
		System.out.println("UserCommand===>Instantiation");
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
