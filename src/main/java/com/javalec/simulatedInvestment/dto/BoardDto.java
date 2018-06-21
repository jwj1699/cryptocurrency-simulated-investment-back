package com.javalec.simulatedInvestment.dto;

import java.sql.Timestamp;

public class BoardDto {
	int bNo;
	String bCategory;
	String bTitle;
	String bContent;
	String bUserId;
	Timestamp bDate;
	int bHit;
	
	public BoardDto() {
		// TODO Auto-generated constructor stub
	}
	
	public BoardDto(int bNo, String bCategory, String bTitle, String bContent, String bUserId, Timestamp bDate, int bHit) {
		this.bNo = bNo;
		this.bCategory = bCategory;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bUserId = bUserId;
		this.bDate = bDate;
		this.bHit = bHit;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbCategory() {
		return bCategory;
	}

	public void setbCategory(String bCategory) {
		this.bCategory = bCategory;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public String getbUserId() {
		return bUserId;
	}

	public void setbUserId(String bUserId) {
		this.bUserId = bUserId;
	}

	public Timestamp getbDate() {
		return bDate;
	}

	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}

	public int getbHit() {
		return bHit;
	}

	public void setbHit(int bHit) {
		this.bHit = bHit;
	}
	
	
}
