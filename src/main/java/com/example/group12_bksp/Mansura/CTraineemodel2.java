package com.example.group12_bksp.Mansura;

import java.time.LocalDate;

public class CTraineemodel2 {

    private String eventName;
    private LocalDate eventDate;
    private String eventLocation;
    private String eventStatus;

    // Constructor
    public CTraineemodel2(String eventName, LocalDate eventDate, String eventLocation, String eventStatus) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.eventStatus = eventStatus;
    }

    // Getters and Setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    // toString() method
    @Override
    public String toString() {
        return "CTraineemodel2{" +
                "eventName='" + eventName + '\'' +
                ", eventDate=" + eventDate +
                ", eventLocation='" + eventLocation + '\'' +
                ", eventStatus='" + eventStatus + '\'' +
                '}';
    }
}
