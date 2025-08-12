package com.example.group12_bksp.Mariyum;

import java.io.Serializable;

public class FinanceOfficerModelClass2 implements Serializable {
    private String employeeName;
    private double salary;

    public FinanceOfficerModelClass2(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FinanceOfficerModelClass2{" +
                "employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
