package com.example.demo.domain;

public class Writes {

	private int paperID;
	private String email;
	
	public Writes(int paperID, String email)
	{
		super();
		this.paperID = paperID;
		this.email = email; 
	}
	
	public int getpaperID()
	{
		return paperID;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setPaperID(int paperID)
	{
		this.paperID = paperID;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
}
