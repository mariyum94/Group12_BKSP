package com.example.group12_bksp.Mansura;


import java.time.LocalDate;

public class CTraineemodel5 {

    private LocalDate date;
    private String time;
    private String coach;
    private String type;
    private boolean available;

    // Constructor
    public CTraineemodel5(LocalDate date, String time, String coach, String type, boolean available) {
        this.date = date;
        this.time = time;
        this.coach = coach;
        this.type = type;
        this.available = available;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // toString
    @Override
    public String toString() {
        return "CTraineemodel5{" +
                "date=" + date +
                ", time='" + time + '\'' +
                ", coach='" + coach + '\'' +
                ", type='" + type + '\'' +
                ", available=" + available +
                '}';
    }
}
