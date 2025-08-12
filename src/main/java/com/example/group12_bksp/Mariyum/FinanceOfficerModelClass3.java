package com.example.group12_bksp.Mariyum;


import java.io.Serializable;

public class FinanceOfficerModelClass3 implements Serializable {
    private String item;
    private double cost;
    private int quantity;
    private String status;

    public FinanceOfficerModelClass3(String item, double cost, int quantity, String status) {
        this.item = item;
        this.cost = cost;
        this.quantity = quantity;
        this.status = status;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FinanceOfficerModelClass3{" +
                "item='" + item + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                '}';
    }
}
