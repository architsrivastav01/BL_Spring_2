package com.example.MySecondSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Project2Application {

	public static void main(String[] args) {
		// Start the Spring Boot application and get the ApplicationContext
		ApplicationContext context = SpringApplication.run(Project2Application.class, args);

		// Retrieve the EmployeeBean from the ApplicationContext
		EmployeeBean employee = context.getBean(EmployeeBean.class);

		// Display Employee and Department details
		employee.displayEmployeeDetails();
	}
}