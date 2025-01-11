package com.gowri.tech;

import com.gowri.tech.controller.EmployeeController;
import com.gowri.tech.entity.Employee;
import com.gowri.tech.utils.CronExpDemo;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootApplication
@EnableScheduling
public class TelefonoMovilApplication {
	private static final Logger log = LoggerFactory.getLogger(TelefonoMovilApplication.class);
	@Autowired
	private EmployeeController employeeController;
	@Autowired
	private CronExpDemo cronExpDemo;

	public static void main(String[] args) {
		SpringApplication.run(TelefonoMovilApplication.class, args);
		log.info("####\nJava Version:{} ", System.getProperty("java.version"));
	}

	@Scheduled(cron = "0 0/5 * * * ?")
	public void scheduledCron(){
		log.info("Accessing EndPoint using CRON:: {}",
				LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm a")));
		List<Employee> employees = employeeController.employeeList();
		log.info("Employees:: {} ",employees);
		System.out.println("Employees: " + employees);
	}

}
