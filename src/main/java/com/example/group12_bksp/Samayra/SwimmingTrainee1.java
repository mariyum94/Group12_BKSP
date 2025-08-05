package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SwimmingTrainee1
{
    @javafx.fxml.FXML
    private ComboBox difficultyComboBox;
    @javafx.fxml.FXML
    private TextField breathCountField;
    @javafx.fxml.FXML
    private TextField strokeCountField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTraineeDashboard.fxml", actionEvent);

    }
}