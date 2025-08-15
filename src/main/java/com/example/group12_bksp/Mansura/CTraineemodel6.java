package com.example.group12_bksp.Mansura;

import javafx.scene.control.Button;
import java.time.LocalDate;

public class CTraineemodel6 {

    private LocalDate date;
    private String time;
    private String coach;
    private String notes;
    private Button downloadButton; // Download button field

    public CTraineemodel6(LocalDate date, String time, String coach, String notes) {
        this.date = date;
        this.time = time;
        this.coach = coach;
        this.notes = notes;
        this.downloadButton = new Button("Download"); // Button initialization
    }

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

    public Button getDownloadButton() {
        return downloadButton;
    }

    public void setDownloadButton(Button downloadButton) {
        this.downloadButton = downloadButton;
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

