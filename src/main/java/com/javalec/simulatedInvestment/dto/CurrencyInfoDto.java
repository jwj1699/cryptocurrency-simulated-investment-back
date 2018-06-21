package com.javalec.simulatedInvestment.dto;

public class CurrencyInfoDto {
	
	String currency;
	int nowPrice;
	int closingPrice;
	int maxPrice;
	int minPrice;
	int volume;
	
	public CurrencyInfoDto() {
		// TODO Auto-generated constructor stub
	}
	
	public CurrencyInfoDto(String currency, int nowPrice, int closingPrice, int maxPrice, int minPrice, int volume) {
		this.currency = currency;
		this.nowPrice = nowPrice;
		this.closingPrice = closingPrice;
		this.maxPrice = maxPrice;
		this.minPrice = minPrice;
		this.volume = volume;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getNowPrice() {
		return nowPrice;
	}

	public void setNowPrice(int nowPrice) {
		this.nowPrice = nowPrice;
	}

	public int getClosingPrice() {
		return closingPrice;
	}

	public void setClosingPrice(int closingPrice) {
		this.closingPrice = closingPrice;
	}

	public int getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(int maxPrice) {
		this.maxPrice = maxPrice;
	}

	public int getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(int minPrice) {
		this.minPrice = minPrice;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	

}
