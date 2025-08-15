package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class SwimmingTrainee8
{
    @javafx.fxml.FXML
    private Label St8OutputLabel;
    @javafx.fxml.FXML
    private ComboBox<String> SwimMeetCB;

    @javafx.fxml.FXML
    public void initialize() {
        SwimMeetCB.getItems().addAll("Olympics", "Regional Championship", "Nationals");
    }


    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/SwimmingTraineeDashboardController.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void ApplyMeetButton(ActionEvent actionEvent) {
        String MeetCombo= SwimMeetCB.getValue();

        if (MeetCombo==null){
            St8OutputLabel.setText("Please select Meet type");
            return;
        }
        St8OutputLabel.setText("Application Submitted You Will be contacted soon");
    }

}