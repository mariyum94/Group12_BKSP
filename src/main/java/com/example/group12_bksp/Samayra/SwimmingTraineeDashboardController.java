package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class SwimmingTraineeDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ButterflyStrokeButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTrainee5.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void BackstrokeBasicsButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTrainee3.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void FlipTurnPracticeButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTrainee4.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void SwimMeetPrepButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTrainee8.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void FreestyleTechniqueButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTrainee1.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void StaminaTrainingButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTrainee2.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void BreathControlDrillsButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTrainee6.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void LogOutOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/Login.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void TreadWaterButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTrainee7.fxml", actionEvent);
    }
}