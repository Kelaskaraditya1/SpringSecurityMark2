package com.StarkIndustries.SpringSecurityMark2.Model;

public class Employee {

    private int empId;
    private String empName;
    private String department;
    private double salery;

    public Employee(int empId,String empName,String department,double saslery){
        this.empId=empId;
        this.empName=empName;
        this.department=department;
        this.salery=saslery;
    }

    public Employee(String empName,String department,double salery){
        this.empName=empName;
        this.department=department;
        this.salery=salery;
    }

    public Employee(String empName){
        this.empName=empName;
    }

    public Employee(){

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalery() {
        return salery;
    }

    public void setSalery(double salery) {
        this.salery = salery;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                ", salery=" + salery +
                '}';
    }
}
