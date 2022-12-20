package com.example.sb_employeepayrollapp.service;
import com.example.sb_employeepayrollapp.Dto.EmployeePayrollDTO;
import com.example.sb_employeepayrollapp.Model.EmployeePayrollData;
import com.example.sb_employeepayrollapp.exception.EmpPayRollException;
import com.example.sb_employeepayrollapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService  implements IEmployeePayrollService{
    @Autowired
    private EmployeeRepo employeeRepo;
    private List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData()
    {
        List<EmployeePayrollData> empData = employeeRepo.findAll();
        return empData;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId)
    {
      EmployeePayrollData empData = employeeRepo.findById(empId).get();
       return empData;
    }
    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = new EmployeePayrollData(empPayrollDTO);
        employeeRepo.save(empData);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO employeePayrollDTO) {
       EmployeePayrollData empData = new EmployeePayrollData(empId,employeePayrollDTO);
       employeeRepo.save(empData);
        return empData;
    }
    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeePayrollDataList.remove(empId-1);

    }
}
