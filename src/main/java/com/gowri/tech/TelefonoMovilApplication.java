package com.gowri.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelefonoMovilApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelefonoMovilApplication.class, args);
		System.out.println("Java Version: " + System.getProperty("java.version"));

	}

}
