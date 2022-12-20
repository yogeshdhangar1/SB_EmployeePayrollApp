package com.example.sb_employeepayrollapp.repository;

import com.example.sb_employeepayrollapp.Model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeePayrollData,Integer> {
}
