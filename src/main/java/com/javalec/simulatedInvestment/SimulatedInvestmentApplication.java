package com.javalec.simulatedInvestment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SimulatedInvestmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimulatedInvestmentApplication.class, args);
		
	}
}
