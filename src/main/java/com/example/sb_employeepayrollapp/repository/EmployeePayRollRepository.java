package com.example.sb_employeepayrollapp.repository;

import com.example.sb_employeepayrollapp.Model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayRollRepository extends JpaRepository<EmployeePayrollData,Integer> {
}
