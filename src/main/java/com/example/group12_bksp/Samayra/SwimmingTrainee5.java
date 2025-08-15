package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class SwimmingTrainee5
{
    @javafx.fxml.FXML
    private CheckBox Drill2CheckBox;
    @javafx.fxml.FXML
    private CheckBox Drill3CheckBox;
    @javafx.fxml.FXML
    private CheckBox Drill1CheckBox;
    @javafx.fxml.FXML
    private Label St5OutputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SaveDrillOnActionButton(ActionEvent actionEvent) {
        boolean drill1 = Drill1CheckBox.isSelected();
        boolean drill2 = Drill2CheckBox.isSelected();
        boolean drill3 = Drill3CheckBox.isSelected();
        if (!drill1 && !drill2 && !drill3) {
            St5OutputLabel.setText("Please mark at least one drill as completed.");
            return;
        }
        St5OutputLabel.setText("Practice log saved successfully!");
    }



    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTraineeDashboardController.fxml", actionEvent);
    }
}