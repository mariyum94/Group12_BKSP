package com.example.group12_bksp.Mariyum;

import java.io.Serializable;

public class FinanceOfficerModelClass4 implements Serializable {
    private String department;
    private int budget;
    private double amount;
    private String sponsorName;
    private String purpose;
    private String item;

    public FinanceOfficerModelClass4(String department, int budget, double amount, String sponsorName, String purpose, String item) {
        this.department = department;
        this.budget = budget;
        this.amount = amount;
        this.sponsorName = sponsorName;
        this.purpose = purpose;
        this.item = item;
    }

    public FinanceOfficerModelClass4(String sponsorName, String purpose, double amount) {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "FinanceOfficerModelClass4{" +
                "department='" + department + '\'' +
                ", budget=" + budget +
                ", amount=" + amount +
                ", sponsorName='" + sponsorName + '\'' +
                ", purpose='" + purpose + '\'' +
                ", item='" + item + '\'' +
                '}';
    }
}