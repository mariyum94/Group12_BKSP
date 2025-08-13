package com.example.group12_bksp.Mariyum;


import java.io.Serializable;

public class HRManagerModelClass1 implements Serializable {
    private String name;
    private String role;
    private String contact;

    public HRManagerModelClass1(String name, String contact, String role) {
        this.name = name;
        this.contact = contact;
        this.role = role;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "HRManagerModelClass1{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

}
