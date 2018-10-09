package com.javalec.simulatedInvestment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.javalec.simulatedInvestment.dto.OrderbookDto;

@Configuration
public class TestConfig {
	
	@Bean
	//@Scope("globalSession")
	public OrderbookDto orderbookDto() {
		OrderbookDto orderbookDto = new OrderbookDto();
		
		return orderbookDto;
	}
}
