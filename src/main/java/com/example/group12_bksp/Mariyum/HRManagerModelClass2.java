package com.example.group12_bksp.Mariyum;


import java.io.Serializable;

public class HRManagerModelClass2 implements Serializable {

    private String name;
    private String present;

    public HRManagerModelClass2(String name, String present) {
        this.name = name;
        this.present = present;
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HRManagerModelClass2{" +
                "name='" + name + '\'' +
                ", present='" + present + '\'' +
                '}';
    }
}