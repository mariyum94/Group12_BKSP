package com.example.group12_bksp.Mansura;

import java.time.LocalDate;

public class CTraineemodel4 {

    private LocalDate date;
    private String coach;
    private String comment;

    // Constructor
    public CTraineemodel4(LocalDate date, String coach, String comment) {
        this.date = date;
        this.coach = coach;
        this.comment = comment;
    }

    // Getters and Setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // toString
    @Override
    public String toString() {
        return "CTraineemodel4{" +
                "date=" + date +
                ", coach='" + coach + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
