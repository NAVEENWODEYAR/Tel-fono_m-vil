package com.gowri.tech;

import com.gowri.tech.controller.EmployeeController;
import com.gowri.tech.entity.Employee;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author Naveen Wodeyar
 * @date 13-Jan-2025
 */

@SpringBootApplication(scanBasePackages = "com.gowri.tech")
@EnableScheduling
public class TelefonoMovilApplication {
	private static final Logger log = LoggerFactory.getLogger(TelefonoMovilApplication.class);
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a");

	@Autowired
	private EmployeeController employeeController;

	public static void main(String[] args) {
		SpringApplication.run(TelefonoMovilApplication.class, args);
		log.info("####\nJava Version:{} ", System.getProperty("java.version"));
	}

	@Scheduled(cron = "0 0/4 * * * ?", initialDelay = 5000)
	public void scheduledCron() {
		try {
			log.info("Accessing EndPoint using CRON:: {}",
					LocalDateTime.now().format(DATE_FORMATTER));
			List<Employee> employees = employeeController.employeeList();

			if (employees != null && !employees.isEmpty()) {
				log.info("Number of Employees: {}", employees.size());
			} else {
				log.info("No employees found.");
			}

		} catch (Exception e) {
			log.error("Error occurred while fetching employee data", e);
		}
	}
}
