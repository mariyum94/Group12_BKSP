package com.example.group12_bksp.Mariyum;

import java.io.Serializable;
import java.time.LocalDate;


public class FinanceOfficerModelClass1 implements Serializable {
    private String category;
    private double amount;
    private int budget;
    private LocalDate date;

    public FinanceOfficerModelClass1(String category, double amount,int budget, LocalDate date) {
        this.category = category;
        this.amount = amount;
        this.budget = budget;
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FinanceOfficerModelClass1{" +
                "category='" + category + '\'' +
                ", amount=" + amount +
                ", budget=" + budget +
                ", date=" + date +
                '}';
    }
}
