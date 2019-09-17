package com.nt.Command;

import javax.validation.constraints.NotBlank;

public class UserCommand {
	@NotBlank(message = "UserName Should Not be Empty")
	private String username;
	@NotBlank(message = "Password Should Not Be Empty")
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
