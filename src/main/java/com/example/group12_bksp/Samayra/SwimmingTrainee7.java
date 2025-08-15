package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SwimmingTrainee7
{
    @javafx.fxml.FXML
    private TextField TreadTimeTextField;
    @javafx.fxml.FXML
    private Label St7OutputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTraineeDashboardController.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void SubmitTimeButtonOnAction(ActionEvent actionEvent) {
        String timeTaken= TreadTimeTextField.getText();

        if (timeTaken.isEmpty()){

            St7OutputLabel.setText("Please input your time taken");
            return;
        }
        int Timetaken=Integer.parseInt(timeTaken);
        if (Timetaken<5){
            St7OutputLabel.setText("Sorry participate again later to record 5 minutes");
        }else{
            St7OutputLabel.setText("Congratulations!Your new record has been stored successfully");
        }
    }
}