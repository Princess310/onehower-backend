package com.onehower;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnehowerApplication {
	private static final Logger logger = LogManager
			.getLogger(OnehowerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OnehowerApplication.class, args);
	}
}
