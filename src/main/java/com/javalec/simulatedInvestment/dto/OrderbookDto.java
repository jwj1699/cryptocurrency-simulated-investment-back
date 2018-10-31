package com.javalec.simulatedInvestment.dto;

public class OrderbookDto {
	
	private AskDto[] asks;
	private BidDto[] bids;
	
	public OrderbookDto() {
		// TODO Auto-generated constructor stub
	}
	public OrderbookDto(AskDto[] asks, BidDto[] bids) {
		this.asks = asks;
		this.bids = bids;
	}	
	
	public AskDto[] getAsks() {
		return asks;
	}
	public void setAsks(AskDto[] asks) {
		this.asks = asks;
	}
	public BidDto[] getBids() {
		return bids;
	}
	public void setBids(BidDto[] bids) {
		this.bids = bids;
	}
	
	
}
