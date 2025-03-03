package com.example.MySecondSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String employeeName = "John Doe";

    @Autowired
    private DepartmentBean department;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public DepartmentBean getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentBean department) {
        this.department = department;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department.getDepartmentName());
    }
}