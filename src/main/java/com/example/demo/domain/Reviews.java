package com.example.demo.domain;

public class Reviews {

	private String revemail;
	private String paperID;
	private String techMerit;
	private String readability;
	private String originality;
	private String relevance;
	private String overallrecomm;
	private String commentForCommittee;
	private String commentForAuthor;
	
	public Reviews(String revemail, String paperID, String techMerit, String readability, String originality, String relevance, String overallRecomm, String commentForAuthor, String commentForCommittee)
	{
		super();
		this.setRevemail(revemail);
		this.setPaperID(paperID);
		this.setTechMerit(techMerit);
		this.setReadability(readability);
		this.setOriginality(originality);
		this.setRelevance(relevance);
		this.setOverallrecomm(overallRecomm);
		this.setCommentForCommittee(commentForCommittee);
		this.setCommentForAuthor(commentForAuthor);
	}

	public String getRevemail() {
		return revemail;
	}

	public void setRevemail(String revemail) {
		this.revemail = revemail;
	}

	public String getPaperID() {
		return paperID;
	}

	public void setPaperID(String paperID) {
		this.paperID = paperID;
	}

	public String getTechMerit() {
		return techMerit;
	}

	public void setTechMerit(String techMerit) {
		this.techMerit = techMerit;
	}

	public String getReadability() {
		return readability;
	}

	public void setReadability(String readability) {
		this.readability = readability;
	}

	public String getOriginality() {
		return originality;
	}

	public void setOriginality(String originality) {
		this.originality = originality;
	}

	public String getRelevance() {
		return relevance;
	}

	public void setRelevance(String relevance) {
		this.relevance = relevance;
	}

	public String getOverallrecomm() {
		return overallrecomm;
	}

	public void setOverallrecomm(String overallrecomm) {
		this.overallrecomm = overallrecomm;
	}

	public String getCommentForCommittee() {
		return commentForCommittee;
	}

	public void setCommentForCommittee(String commentForCommittee) {
		this.commentForCommittee = commentForCommittee;
	}

	public String getCommentForAuthor() {
		return commentForAuthor;
	}

	public void setCommentForAuthor(String commentForAuthor) {
		this.commentForAuthor = commentForAuthor;
	}
	
	
}
