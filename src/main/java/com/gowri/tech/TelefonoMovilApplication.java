package com.gowri.tech;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelefonoMovilApplication {

	private static final Logger log = LoggerFactory.getLogger(TelefonoMovilApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TelefonoMovilApplication.class, args);
		log.info("####\nJava Version: " + System.getProperty("java.version"));

	}
}
