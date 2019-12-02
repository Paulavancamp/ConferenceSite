package com.example.demo.domain;

public class TopicsOfInterest {

	private String revemail;
	private String topic;
	
	public TopicsOfInterest(String revemail, String topic)
	{
		super();
		this.revemail = revemail;
		this.topic = topic;
	}
	
	public String getTopic()
	{
		return this.topic;
	}
	
	public String getemail()
	{
		return this.revemail;
	}
}
