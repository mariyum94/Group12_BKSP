package com.example.group12_bksp.Mansura;

import java.time.LocalDate;

public class CTraineemodel1 {

    private LocalDate date;
    private String time;
    private String sessionType;
    private String coach;
    private String location;

    // Constructor
    public CTraineemodel1(LocalDate date, String time, String sessionType, String coach, String location) {
        this.date = date;
        this.time = time;
        this.sessionType = sessionType;
        this.coach = coach;
        this.location = location;
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

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // toString() method
    @Override
    public String toString() {
        return "CTraineemodel1{" +
                "date=" + date +
                ", time='" + time + '\'' +
                ", sessionType='" + sessionType + '\'' +
                ", coach='" + coach + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
