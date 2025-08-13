package com.example.group12_bksp.Mariyum;


import java.io.Serializable;

public class HRManagerModelClass3 implements Serializable {
    private String name;
    private String role;
    private String status;
    private String perfomance;

    public HRManagerModelClass3(String status, String name, String role) {
        this.name = name;
        this.role = role;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPerfomance() {
        return perfomance;
    }

    public void setPerfomance(String perfomance) {
        this.perfomance = perfomance;
    }

    @Override
    public String toString() {
        return "HRManagerModelClass3{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", status='" + status + '\'' +
                ", perfomance='" + perfomance + '\'' +
                '}';
    }
}