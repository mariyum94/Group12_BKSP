package com.example.group12_bksp.Samayra;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class SwimmingTrainee6
{
    @javafx.fxml.FXML
    private TextField HoldTimeTextField;
    @javafx.fxml.FXML
    private Label St6OutputLabel;
    @javafx.fxml.FXML
    private TextField HoldTimeTextField1;
    @javafx.fxml.FXML
    private RadioButton NoRadioButton;
    @javafx.fxml.FXML
    private RadioButton yesRadioButton;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SubmitHoldTimeButtonOnAction(ActionEvent actionEvent) {
        String holdTime= HoldTimeTextField.getText();
        String pulseRate= HoldTimeTextField1.getText();
        if (holdTime.isEmpty() || pulseRate.isEmpty()){
            St6OutputLabel.setText("Please fill all fields");
        }
        String disease;
        if (yesRadioButton.isSelected()) {
            St6OutputLabel.setText("No medical history");
        }else if( NoRadioButton.isSelected()) {
            St6OutputLabel.setText("You should consult with our professionals first");
        }else{
            St6OutputLabel.setText("Please select yes or no");
        }
        int hold = Integer.parseInt(holdTime);
        int pulse = Integer.parseInt(pulseRate);

        // Safety validation: example threshold
        if (hold > 130) {
            St6OutputLabel.setText("Warning: Hold time exceeds safety limit!");

        } else if (pulse > 100) {
            St6OutputLabel.setText("Warning: Pulse rate too high!");

        }else if (pulse <90){
            St6OutputLabel.setText("Warning: Pulse rate too high!");
        }
        else {
            St6OutputLabel.setText("Progress saved successfully!");

    }

}




    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent) {
    }
}