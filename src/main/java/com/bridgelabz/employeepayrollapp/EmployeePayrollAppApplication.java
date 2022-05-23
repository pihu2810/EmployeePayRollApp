package com.bridgelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Payroll App");
        ApplicationContext context = SpringApplication.run(EmployeePayrollAppApplication.class, args);
        log.info("Employee Payroll App Started in {} Environment",
                context.getEnvironment().getProperty("environment"));

    }
}
