package com.StarkIndustries.SpringSecurityMark2.Controller;

import com.StarkIndustries.SpringSecurityMark2.Model.Employee;
import com.StarkIndustries.SpringSecurityMark2.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @PreAuthorize("hasRole('Web-Developer')")
    @GetMapping("/students")
    public List<Employee> getEmployees(){
       return employeeService.getEmployees();
    }

    @GetMapping("/student/{empId}")
    public Employee getStudent(@PathVariable("empId") int empId){
        return employeeService.getEmployee(empId);
    }

    @PostMapping("/insert")
    public String addStudent(@RequestBody Employee employee){
        if(employeeService.addEmployee(employee))
            return "Employee added Successfully";
        return "Failed to add Employee";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userEndpoint(){
     return "Welcome!! User";
    }

    @PreAuthorize("hasRole('ADMIN')")
    public String adminEndpoint(){
        return "Welcome!! Admin";
    }

}
