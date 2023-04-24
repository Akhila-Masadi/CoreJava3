package com.examples.oops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Employee {
    private String empName;

    private Double Salary;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return Salary;
    }

    public Employee(String empName, Double salary) {
        this.empName = empName;
        Salary = salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empName.equals(employee.empName) && Salary.equals(employee.Salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, Salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Sample",123.1);
        Employee emp1 = new Employee("Sample",123.1);
        List emplist = new ArrayList<>();
        emplist.add(emp);
        emplist.add(emp1);
        System.out.println(emplist);
        HashSet empset = new HashSet<>();
        empset.add(emp);
        empset.add(emp1);
        System.out.println(empset);

    }
}
