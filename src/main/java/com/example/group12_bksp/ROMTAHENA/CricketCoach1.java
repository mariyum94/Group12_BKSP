package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class CricketCoach1 {

    @FXML
    private TextField ageField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField roleField;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @FXML
    public void submitButton(ActionEvent event) {

    }

    @FXML
    public void returnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoachDashboard.fxml", actionEvent);
    }

}
