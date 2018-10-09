package com.javalec.simulatedInvestment.mapper;

import java.util.ArrayList;

import com.javalec.simulatedInvestment.dto.CurrencyInfoDto;

public interface CurrencyInfoMapper {
	
	public ArrayList<CurrencyInfoDto> list();
	public CurrencyInfoDto BTC();
	public CurrencyInfoDto ETH();
	public CurrencyInfoDto ETC();
	public CurrencyInfoDto XRP();
	public CurrencyInfoDto LTC();
}
