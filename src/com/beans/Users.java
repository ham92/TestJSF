package com.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Users {

	private String firstName;
	private String lastName;

	public Users() {
	}

	
	
	public Users(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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

}
