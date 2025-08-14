package com.example.group12_bksp.Mansura;

import java.time.LocalDate;

public class CTraineemodel6 {

    private LocalDate date;
    private String time;
    private String coach;
    private String notes;

    // Constructor
    public CTraineemodel6(LocalDate date, String time, String coach, String notes) {
        this.date = date;
        this.time = time;
        this.coach = coach;
        this.notes = notes;
    }

    // Getters and Setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "CTraineemodel6{" +
                "date=" + date +
                ", time='" + time + '\'' +
                ", coach='" + coach + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}

