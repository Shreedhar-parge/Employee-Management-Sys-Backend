package com.project.emp.management.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "employee_details_info")
public class employeedetails {
    @Id
    private String employeeid;
    private String employeename;
    private String employeeaddress;
    private String employeephonenumber;
    private String salary;
    public employeedetails() {
    }
    public employeedetails(String employeeid, String employeename, String employeeaddress, String employeephonenumber,
            String salary) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.employeeaddress = employeeaddress;
        this.employeephonenumber = employeephonenumber;
        this.salary = salary;
    }
    public String getEmployeeid() {
        return employeeid;
    }
    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }
    public String getEmployeename() {
        return employeename;
    }
    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }
    public String getEmployeeaddress() {
        return employeeaddress;
    }
    public void setEmployeeaddress(String employeeaddress) {
        this.employeeaddress = employeeaddress;
    }
    public String getEmployeephonenumber() {
        return employeephonenumber;
    }
    public void setEmployeephonenumber(String employeephonenumber) {
        this.employeephonenumber = employeephonenumber;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }

    
}
