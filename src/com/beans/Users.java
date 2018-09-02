package com.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Users {

	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String passWord;
	public Users() {
	}

	



	public Users(String firstName, String lastName, String email, String userName, String passWord) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.passWord = passWord;
	}





	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}





	public String getUserName() {
		return userName;
	}





	public void setUserName(String userName) {
		this.userName = userName;
	}





	public String getPassWord() {
		return passWord;
	}





	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	


	
	
}
