package com.example.group12_bksp.Mansura;

import java.time.LocalDate;

public class CTraineemodel3 {

    private LocalDate date;
    private String status; // "Present" or "Absent"

    // Constructor
    public CTraineemodel3(LocalDate date, String status) {
        this.date = date;
        this.status = status;
    }

    // Getters and Setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString
    @Override
    public String toString() {
        return "CTraineemodel3{" +
                "date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
