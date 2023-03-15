package com.validation.entity;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Form {

	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Invalid Email Address !!")
	private String username;

	@NotBlank(message = "Password can not be empty !!")
	@Size(min = 3, max = 15, message = "Password must be between 3 - 15 characters !!")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{3,15}$", message = "Password must contain at least one lowercase letter, one uppercase letter, one digit, and one special character.")
	private String password;

	@AssertTrue(message = "You must agree terms and conditions first !!")
	private boolean agreed;

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

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	public Form(String username, String password, boolean agreed) {
		super();
		this.username = username;
		this.password = password;
		this.agreed = agreed;
	}

	public Form() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Form [username=" + username + ", password=" + password + ", agreed=" + agreed + "]";
	}

}
