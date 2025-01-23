package com.StarkIndustries.SpringSecurityMark2.Service;

import com.StarkIndustries.SpringSecurityMark2.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> employeeList = new ArrayList<>(List.of(
            new Employee(101,"Aditya Kelaskar","Android-Devloper",100000.00)
            ,new Employee(102,"Mayur Khatal","Web Devloper",200000.00)
            ,new Employee(103,"Sandesh Jadhav","Web Devloper",300000.00)
    ));

    public List<Employee> getEmployees(){
        return employeeList;
    }

    public Employee getEmployee(int empId){
        return employeeList.stream()
                .filter(employee->
                        employee.getEmpId()==empId)
                .findFirst()
                .orElse(new Employee());
    }

    public boolean addEmployee(Employee employee){
        employeeList.add(employee);
        return true;
    }

}
