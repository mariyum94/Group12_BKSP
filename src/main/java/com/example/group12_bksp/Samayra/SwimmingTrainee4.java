package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import javax.imageio.IIOException;
import java.io.IOException;
import java.time.LocalDate;

public class SwimmingTrainee4
{

    @javafx.fxml.FXML
    private Label St4OutputLabel;
    @javafx.fxml.FXML
    private DatePicker FlipTurnDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> coachCombo;
    @javafx.fxml.FXML
    private ComboBox<String> flipTurnTimeCombo;

    @javafx.fxml.FXML
    public void initialize() {
        coachCombo.getItems().addAll("Coach Alex", "Coach Janet", "Coach Jaden");
        flipTurnTimeCombo.getItems().addAll("8 am", "12 pm", "6 pm");
    }


    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTraineeDashboardController.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ReqbuttonOnAction(ActionEvent actionEvent) {
        String CoachComboBox = coachCombo.getValue();
        String TimeCombo= flipTurnTimeCombo.getValue();
        LocalDate FlipDate= FlipTurnDatePicker.getValue();

        if (FlipDate ==null || CoachComboBox ==null ||TimeCombo ==null) {

            St4OutputLabel.setText("Please make sure you have selected all of the options above.");
        }
         else {
            St4OutputLabel.setText("Flip turn practice submitted successfully!");
        }


    }
}