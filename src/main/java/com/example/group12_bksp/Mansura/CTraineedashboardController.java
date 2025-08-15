package com.example.group12_bksp.Mansura;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import java.io.IOException;

public class CTraineedashboardController {



    @javafx.fxml.FXML
    public void viewmonthlyattendancebutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("monthlyAttendance.fxml", actionEvent);
    }//CTrainee3

    @javafx.fxml.FXML
    public void requestcoachingsessionbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("coachingSessionRequest.fxml", actionEvent);
    }//CTrainee5

    @javafx.fxml.FXML
    public void downloadcertificatebutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("downloadCertificate.fxml", actionEvent);
    }//CTrainee6

    @javafx.fxml.FXML
    public void checkteamassignmentbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("teamAssignment.fxml", actionEvent);
    }//CTrainee7

    @javafx.fxml.FXML
    public void viewtrainingschedulebutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("trainingSchedule.fxml", actionEvent);
    }//CTrainee1

    @javafx.fxml.FXML
    public void viewcoachfeedbackbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("coachFeedback.fxml", actionEvent);
    }//CTrainee4

    @javafx.fxml.FXML
    public void viewmatchresultsbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("matchResults.fxml", actionEvent);
    }//CTrainee8

    @javafx.fxml.FXML
    public void logoutbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void registerbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("register.fxml", actionEvent);
    }//CTrainee2

}
