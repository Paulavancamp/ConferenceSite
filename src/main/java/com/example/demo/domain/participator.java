package com.example.demo.domain;

public class participator {
	
	private String email;
	private String firstname;
	private String minit;
	private String lastname;
	private String phone;
	private String affiliaiton;
	private String password;


	public participator(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	public void setMInit(String minit) {
		this.minit = minit;
	}
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAffiliation(String affiliaiton) {
		this.affiliaiton = affiliaiton;
	}
}
