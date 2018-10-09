package com.javalec.simulatedInvestment.dto;

import java.sql.Timestamp;

public class TransactionHistoryDto {
	int contNo;
	Timestamp transactionDate;
	String type;
	double unitsTraded;
	int price;
	int total;
}
