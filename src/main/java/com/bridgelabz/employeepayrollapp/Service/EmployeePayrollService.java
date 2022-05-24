package com.bridgelabz.employeepayrollapp.Service;

import com.bridgelabz.employeepayrollapp.Exceptions.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService
{
    @Autowired
    private EmployeePayrollRepository employeePayrollRepository;
    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();


    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return employeePayrollList.stream().filter(empData -> empData.getEmpId() == empId).findFirst()
                .orElseThrow(() -> new EmployeePayrollException("Employee ID Not found"));
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(empPayrollDTO);
        employeePayrollList.add(empData);
        log.debug("Emp Data: " +empData.toString());
        employeePayrollList.add(empData);
        return employeePayrollRepository.save(empData);
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
        empData.setName(empPayrollDTO.name);
        empData.setSalary(empPayrollDTO.salary);
        employeePayrollList.set(empId-1, empData);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {

        employeePayrollList.remove(empId-1);
    }
}
