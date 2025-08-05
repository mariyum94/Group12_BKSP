package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class CricketCoachDashboardController
{

    @javafx.fxml.FXML
    public void AddPlayerButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoach1.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void EvaluteFitnessButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UpdateScheduleButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CommunicateWithTraineeButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ViewPlayerButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void TrackTeamAttendanceButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ManageProfileButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SubmitFeedbackButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LogOutButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Login.fxml", actionEvent);
    }

}