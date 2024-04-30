package com.project.emp.management.backend;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class employeedetailsimple implements employeeservice{
    employeedetailsrepo repo;
    public employeedetailsimple(employeedetailsrepo repo){
        this.repo = repo;
    }

    @Override
    public String createemployee(employeedetails employee){
        repo.save(employee);
        return "Successfully saved the employee details";
    }

    @Override
    public String updateemployee(employeedetails employee){
        repo.save(employee);
        return "Successfully updated the employee details";
    }

    @Override
    public String getemployee(String employeeid){
        repo.findById(employeeid).get();
        return "Successfully fetched the employee details";
    }

    @Override
    public String deleteemployee(String employeeid){
        repo.deleteById(employeeid);
        return "Successfully deleted the employee details";
    }

    @Override
    public List<employeedetails> getallemployeedetails(){
        return repo.findAll();
    }
}
