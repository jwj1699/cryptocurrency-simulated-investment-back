package com.javalec.simulatedInvestment.dto;

public class UserWalletDto {
	
	String userId;
	int BTC_purchasePrice;
	double BTC_amount;
	int ETH_purchasePrice;
	double ETH_amount;
	int ETC_purchasePrice;
	double ETC_amount;
	int XRP_purchasePrice;
	double XRP_amount;
	int LTC_purchasePrice;
	double LTC_amount;
	
	public UserWalletDto() {
		// TODO Auto-generated constructor stub
	}
	
	public UserWalletDto(String userId, int BTC_purchasePrice, double BTC_amount, int ETH_purchasePrice, double ETH_amount, int ETC_purchasePrice, double ETC_amount, int XRP_purchasePrice, double XRP_amount, int LTC_purchasePrice, double LTC_amount) {
		this.userId = userId;
		this.BTC_purchasePrice = BTC_purchasePrice;
		this.BTC_amount = BTC_amount;
		this.ETH_purchasePrice = ETH_purchasePrice;
		this.ETH_amount = ETH_amount;
		this.ETC_purchasePrice = ETC_purchasePrice;
		this.ETC_amount = ETC_amount;
		this.XRP_purchasePrice = XRP_purchasePrice;
		this.XRP_amount = XRP_amount;
		this.LTC_purchasePrice = LTC_purchasePrice;
		this.LTC_amount = LTC_amount;
		
	}
	
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getBTC_purchasePrice() {
		return BTC_purchasePrice;
	}
	public void setBTC_purchasePrice(int bTC_purchasePrice) {
		BTC_purchasePrice = bTC_purchasePrice;
	}
	public double getBTC_amount() {
		return BTC_amount;
	}
	public void setBTC_amount(double bTC_amount) {
		BTC_amount = bTC_amount;
	}
	public int getETH_purchasePrice() {
		return ETH_purchasePrice;
	}
	public void setETH_purchasePrice(int eTH_purchasePrice) {
		ETH_purchasePrice = eTH_purchasePrice;
	}
	public double getETH_amount() {
		return ETH_amount;
	}
	public void setETH_amount(double eTH_amount) {
		ETH_amount = eTH_amount;
	}
	public int getETC_purchasePrice() {
		return ETC_purchasePrice;
	}
	public void setETC_purchasePrice(int eTC_purchasePrice) {
		ETC_purchasePrice = eTC_purchasePrice;
	}
	public double getETC_amount() {
		return ETC_amount;
	}
	public void setETC_amount(double eTC_amount) {
		ETC_amount = eTC_amount;
	}
	public int getXRP_purchasePrice() {
		return XRP_purchasePrice;
	}
	public void setXRP_purchasePrice(int xRP_purchasePrice) {
		XRP_purchasePrice = xRP_purchasePrice;
	}
	public double getXRP_amount() {
		return XRP_amount;
	}
	public void setXRP_amount(double xRP_amount) {
		XRP_amount = xRP_amount;
	}
	public int getLTC_purchasePrice() {
		return LTC_purchasePrice;
	}
	public void setLTC_purchasePrice(int lTC_purchasePrice) {
		LTC_purchasePrice = lTC_purchasePrice;
	}
	public double getLTC_amount() {
		return LTC_amount;
	}
	public void setLTC_amount(double lTC_amount) {
		LTC_amount = lTC_amount;
	}
	
	
}
