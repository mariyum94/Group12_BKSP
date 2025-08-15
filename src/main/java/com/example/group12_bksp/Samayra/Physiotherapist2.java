package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class Physiotherapist2
{
    @javafx.fxml.FXML
    private TextArea recommendTextArea;
    @javafx.fxml.FXML
    private Label therapyOutput;
    @javafx.fxml.FXML
    private ComboBox<String> ComboBox2;

    @javafx.fxml.FXML
    public void initialize() {
        ComboBox2.getItems().addAll("Athlete 1","Athlete 2", "Athlete 3");
    }

    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/PhysiotherapistDashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void AssignPlanButton(ActionEvent actionEvent) {
        String instructionTextArea= recommendTextArea.getText();
        String nameRecCB= ComboBox2.getValue();
        if (nameRecCB==null || instructionTextArea.isEmpty()){
            therapyOutput.setText("Please fill in details");
            return;

        }
        therapyOutput.setText("Therapy plan submitted");
    }
}