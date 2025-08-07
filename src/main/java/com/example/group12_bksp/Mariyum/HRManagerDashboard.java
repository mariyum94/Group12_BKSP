package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class HRManagerDashboard
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ManageAthleteStaffRecordOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManager1.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void NotifyEmployeeOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManager5.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void RecruitNewStafforTrainerOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManager3.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void EvaluatePerformanceReportOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManager1.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void TrackAttendanceOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManager2.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void GenerateHRReportOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManager1.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void LogOutOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Login.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ManageHealthFitnessRecordOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManager1.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ScheduleTrainingSessionOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManager4.fxml", actionEvent);
    }
}