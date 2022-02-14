package com.chris.learning.employee_compare;

public class Employee implements Comparable<Employee> {
    private String employeeName;
    private int employeeSalary;
    private int employeeCode;
    private int employeeRating;

    public Employee() {

    }

    public Employee(String employeeName, int employeeSalary, int employeeCode, int employeeRating) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeCode = employeeCode;
        this.employeeRating = employeeRating;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public int getEmployeeRating() {
        return employeeRating;
    }

    public void setEmployeeRating(int employeeRating) {
        this.employeeRating = employeeRating;
    }

    @Override
    public int compareTo(Employee o) {
        int res = Integer.compare(this.employeeRating, o.employeeRating);
        if (res == 0) {
            return this.employeeName.compareTo(o.employeeName);
        } else {
            return res;
        }


    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeCode=" + employeeCode +
                ", employeeRating=" + employeeRating +
                '}';
    }
}
