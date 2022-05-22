package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

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
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int employeeId) {
        this.empId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
}
