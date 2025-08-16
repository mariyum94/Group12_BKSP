package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class PhysiotherapistDashboard
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void InjuryDatabaseOnActionButton(ActionEvent actionEvent) throws IOException {

    }

    @javafx.fxml.FXML
    public void RecoveryProgressOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/Physiotherapist3.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void TherapyPlanOnActionButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/Physiotherapist2.fxml", actionEvent);
    }


    @javafx.fxml.FXML
    public void MessageTeamOnActionButton(ActionEvent actionEvent) throws IOException{
    }

    @javafx.fxml.FXML
    public void ScheduleFollowupOnActionButton(ActionEvent actionEvent) throws IOException {
    }

    @javafx.fxml.FXML
    public void LogOutOnActionButton(ActionEvent actionEvent) throws IOException {
    }

    @javafx.fxml.FXML
    public void ExerciseRoutineOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/Physiotherapist4.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void AssessInjuryOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/Physiotherapist1.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void RehabilitationReportOnActionButton(ActionEvent actionEvent) throws IOException {
    }
}