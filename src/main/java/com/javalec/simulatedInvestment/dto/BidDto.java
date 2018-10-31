package com.javalec.simulatedInvestment.dto;

public class BidDto {
	
	int price;
	double quantity;
	
	public BidDto() {
		// TODO Auto-generated constructor stub
	}
	
	public BidDto(int price, double quantity) {
		this.price = price;
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
}
