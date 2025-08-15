package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class DirectorGdashboardController
{

    @javafx.fxml.FXML
    public void MonitorAthleteProgressButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGeneral1.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ApproveFacilityRequestButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGeneral2.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void AssignBudgetButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGeneral3.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void GenerateReportButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGeneral4.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void RecruitCoachesButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGeneral5.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ApproveTournamentButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGeneral6.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void EvaluatePerformanceButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGeneral7.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void CommunicateWithCoachesButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGeneral8.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void LogOutButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Login.fxml", actionEvent);
    }

}