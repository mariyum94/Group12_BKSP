package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;


public class SwimmingTrainee1
{
    @javafx.fxml.FXML
    private ComboBox<String> difficultyComboBox;
    @javafx.fxml.FXML
    private TextField breathCountField;
    @javafx.fxml.FXML
    private TextField strokeCountField;
    @javafx.fxml.FXML
    private Label St1OutputLabel;

    @javafx.fxml.FXML
    public void initialize() {
        difficultyComboBox.getItems().addAll("Beginner", "Intermediate", "Advanced");
    }


    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTraineeDashboardController.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void submitButton1OnAction(ActionEvent actionEvent) {
        String difficultyLevel= difficultyComboBox.getValue();
        String breathCount= breathCountField.getText();
        String strokeCount= strokeCountField.getText();


        if (difficultyLevel == null || breathCount.isEmpty() || strokeCount.isEmpty()) {
            St1OutputLabel.setText("Please complete all fields.");
            }
        else {
            St1OutputLabel.setText("Free Style Training Data Submitted Successfully");
        }
    }
}