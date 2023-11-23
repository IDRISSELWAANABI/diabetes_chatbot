package com.Teenspirit.Teenspirit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TeenspiritApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeenspiritApplication.class, args);
	}


}
