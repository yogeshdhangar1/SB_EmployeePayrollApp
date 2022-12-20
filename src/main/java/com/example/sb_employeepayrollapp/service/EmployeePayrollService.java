package com.example.sb_employeepayrollapp.service;

import com.example.sb_employeepayrollapp.Dto.EmployeePayrollDTO;
import com.example.sb_employeepayrollapp.Model.EmployeePayrollData;
import com.example.sb_employeepayrollapp.repository.EmployeePayrollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollService  implements IEmployeePayrollService{
    private List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return employeePayrollDataList.get(empId-1);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(employeePayrollDataList.size()+1,empPayrollDTO);
        employeePayrollDataList.add(empData);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
        empData.setName(employeePayrollDTO.name);
        empData.setSalary(employeePayrollDTO.salary);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        employeePayrollDataList.remove(empId-1);

    }
}
