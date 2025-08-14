package com.example.group12_bksp;

import java.time.LocalDate;

public class user {
    private String name,id,phoneno,email,address,gender,password;
    private LocalDate dateofbirth;

    public user(String address, LocalDate dateofbirth, String email, String gender, String id, String name, String password, String phoneno) {
        this.address = address;
        this.dateofbirth = dateofbirth;
        this.email = email;
        this.gender = gender;
        this.id = id;
        this.name = name;
        this.password = password;
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    @Override
    public String toString() {
        return "user{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", phoneno='" + phoneno + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", dateofbirth=" + dateofbirth +
                '}';
    }
}
