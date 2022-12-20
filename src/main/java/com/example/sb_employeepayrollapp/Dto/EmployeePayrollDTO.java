package com.example.sb_employeepayrollapp.Dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {
    @NotEmpty(message = "Please Enter your firstName")
    @Pattern(regexp = "^[A-Z]{1}[a-z]{2,}\\s{0,}$",message = "Please enter valid name")
    public String name;
    @Min(value = 500,message = "Minimum salary should be 500")
    @NotNull(message = "salary field cannot be empty")
    public long salary;
    public String gender;
    public String note;

    public EmployeePayrollDTO(String name, long salary,String gender,String note) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.note = note;
    }

    @Override
    public String toString() {
        return "EmployeePayrollDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
