package com.javalec.simulatedInvestment.mapper;

import com.javalec.simulatedInvestment.dto.BidDto;

public interface OrderbookMapper {
	public BidDto check(int price);
	public void insert(int price, double quantity);
	public void update(int price, double quantity);
}
