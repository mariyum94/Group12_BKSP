package com.example.group12_bksp.Mariyum;

import java.io.Serializable;
import java.time.LocalDate;

public class HRManagerModelClass4 implements Serializable {

    private String sport;
    private String coach;
    private LocalDate date;

    public HRManagerModelClass4(String sport, String coach) {
        this.sport = sport;
        this.coach = coach;
        this.date = date;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "HRManagerModelClass4{" +
                "sport='" + sport + '\'' +
                ", coach='" + coach + '\'' +
                ", date=" + date +
                '}';
    }
}