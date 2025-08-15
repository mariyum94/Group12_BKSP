package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class SwimmingTrainee3
{
    @javafx.fxml.FXML
    private TextArea FeedbackTextArea;
    @javafx.fxml.FXML
    private Label St3OutputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void SaveProgressButtonOnAction(ActionEvent actionEvent) {
        String feedback = FeedbackTextArea.getText();

        if (feedback.isEmpty()) {
            St3OutputLabel.setText("Please enter your feedback before saving.");

        } else {
            St3OutputLabel.setText("Progress saved successfully!");

    }


}

    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTraineeDashboardController.fxml", actionEvent);
    }
    }