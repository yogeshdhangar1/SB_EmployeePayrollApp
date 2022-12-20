package com.example.sb_employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run
                (EmployeePayrollAppApplication.class, args);
        log.info("Employee PayRoll App Started");
        System.out.println("Welcome To Employee Payroll App");
    }
}
