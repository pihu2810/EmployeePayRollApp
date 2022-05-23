package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;

@Data
public class EmployeePayrollData
{
    private int empId;
    private String name;
    private long salary;

    public EmployeePayrollData() {
        // TODO Auto-generated constructor stub
    }
    public EmployeePayrollData(int empId, String name, long salary) {
        super();
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        super();
        this.empId = empId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
    }


}
