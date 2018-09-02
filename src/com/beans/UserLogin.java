package com.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

@ManagedBean(name = "userLogin")
@RequestScoped
public class UserLogin {
	private String message = "Enter username and password.";
	private String username;
	private String password;

	public String login() {

		UserLogin u1 = new UserLogin("123", "123");

		if ("123".equalsIgnoreCase(username) && "123".equalsIgnoreCase(password)) {
			message = "Successfully logged-in.";
			return "sucsess";
		} else {
			message = "Wrong credentials.";
			return "login";
		}

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public UserLogin(String username, String password) {

		this.username = username;
		this.password = password;
	}

	public UserLogin() {

	}

}
