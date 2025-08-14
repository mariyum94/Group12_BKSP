package com.example.group12_bksp.Mansura;

import java.time.LocalDate;

public class EventCmodel1 {

    private String eventName;
    private int eventId;
    private LocalDate eventDate;
    private String eventTime;
    private String eventVenue;

    // Constructor
    public EventCmodel1(String eventName, int eventId, LocalDate eventDate, String eventTime, String eventVenue) {
        this.eventName = eventName;
        this.eventId = eventId;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventVenue = eventVenue;
    }

    // Getters and Setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    // toString
    @Override
    public String toString() {
        return "EventCmodel1{" +
                "eventName='" + eventName + '\'' +
                ", eventId=" + eventId +
                ", eventDate=" + eventDate +
                ", eventTime='" + eventTime + '\'' +
                ", eventVenue='" + eventVenue + '\'' +
                '}';
    }
}
