package com.validation.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Form {

	
	private String username;
	
	@NotBlank(message = "Password can not be empty !!")
	@Size(min = 3, max = 15, message = "Password must be between 3 - 15 characters !!")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Form(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Form() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Form [username=" + username + ", password=" + password + "]";
	}

}
