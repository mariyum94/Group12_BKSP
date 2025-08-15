package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class SwimmingTrainee2
{
    @javafx.fxml.FXML
    private DatePicker SessionDatePicker;
    @javafx.fxml.FXML
    private TextField LapTimeTextField;
    @javafx.fxml.FXML
    private TextField RestDurationTextField;
    @javafx.fxml.FXML
    private Label St2OutputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SaveTrainingOnAction(ActionEvent actionEvent) {
        String LapTime= LapTimeTextField.getText();
        String RestDuration= RestDurationTextField.getText();
        LocalDate sessionDate= SessionDatePicker.getValue();

        if (sessionDate == null || LapTime.isEmpty() || RestDuration.isEmpty()) {
            St2OutputLabel.setText("Please complete all fields before saving.");
            return;
        }


        St2OutputLabel.setText("Your session has been saved successfully for" + sessionDate );



    }

    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTraineeDashboardController.fxml", actionEvent);
    }
}