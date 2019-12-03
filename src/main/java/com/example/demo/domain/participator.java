package com.example.demo.domain;

public class participator {
	
	private String email;
	private String firstname;
	private String minit;
	private String lastname;
	private String phone;
	private String affiliation;
	private String password;


	public participator(String email, String password, String firstname, String minit, String lastname, String phone, String affiliation) {
		super();
		this.email = email;
		this.firstname = firstname;
		this.minit = minit;
		this.lastname = lastname;
		this.phone = phone;
		this.affiliation = affiliation;
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setMinit(String minit) {
		this.minit = minit;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAffiliation(String affiliaiton) {
		this.affiliation = affiliaiton;
	}
	
	/*GET METHODS*/
	public String getEmail( ) {
		return email;
	}
	
	public String getPassword( ) {
		return password;
	}
	
	public String getFirstname( ) {
		return firstname;
	}
	
	public String getMinit() {
		return minit;
	}
	
	public String getLastname( ) {
		return lastname;
	}
	
	public String getPhone( ) {
		return phone;
	}
	
	public String getAffiliation( ) {
		return affiliation;
	}
	
}
