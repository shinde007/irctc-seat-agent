package com.aditya.irctc_seat_agent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(
		exclude = {
				DataSourceAutoConfiguration.class
		}
)
public class IrctcSeatAgentApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrctcSeatAgentApplication.class, args);
	}

}
