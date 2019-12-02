package com.example.demo.domain;

public class Paper {

	private int paperID;
	private String title;
	private String filename;
	private String contactAuthorEmail;
	private String Abstract;
	
	public Paper(int paperID, String title, String filename, String contactAuthorEmail, String Abstract)
	{
		super();
		this.paperID = paperID;
		this.title = title;
		this.filename = filename;
		this.contactAuthorEmail = contactAuthorEmail;
		this.Abstract = Abstract;	
	}
	
	public String getContactAuthorEmail()
	{
		return this.contactAuthorEmail;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public int getPaperID()
	{
		return this.paperID;
	}
	
	public String getFileName()
	{
		return this.filename;
	}
	
	public String getAbstract()
	{
		return this.Abstract;
	}
	
}
