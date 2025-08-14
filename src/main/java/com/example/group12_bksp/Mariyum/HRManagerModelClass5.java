package com.example.group12_bksp.Mariyum;

import java.io.Serializable;

public class HRManagerModelClass5 implements Serializable {
    private String name;
    private double weight;
    private String injury;

    public HRManagerModelClass5(String name, double weight, String injury) {
        this.name = name;
        this.weight = weight;
        this.injury = injury;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getInjury() {
        return injury;
    }

    public void setInjury(String injury) {
        this.injury = injury;
    }

    @Override
    public String toString() {
        return "HRManagerModelClass5{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", injury='" + injury + '\'' +
                '}';
    }
}
