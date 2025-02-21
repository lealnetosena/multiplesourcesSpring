package com.estudo.multiplesource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MultiplesourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplesourceApplication.class, args);
	}

}
