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
    public void UpdateScheduleButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoach2.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ViewPlayerStatsButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoach3.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ManageProfileButton(ActionEvent  actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoach4.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void EvaluateFitnessButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoach5.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void CommunicateWithTraineeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoach6.fxml", actionEvent);
    }


    @javafx.fxml.FXML
    public void TrackTeamAttendanceButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoach7.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void SubmitFeedbackButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoach8.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void LogOutButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Login.fxml", actionEvent);
    }
}