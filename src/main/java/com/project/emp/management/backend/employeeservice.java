package com.project.emp.management.backend;

import java.util.List;

public interface employeeservice {
    public String createemployee(employeedetails employee);
    public String updateemployee(employeedetails employee);
    public String getemployee(String employee);
    public String deleteemployee(String employee);
    public List<employeedetails> getallemployeedetails();
}
