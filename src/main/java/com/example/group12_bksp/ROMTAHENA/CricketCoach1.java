package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CricketCoach1
{
    @javafx.fxml.FXML
    private TextField ageField;
    @javafx.fxml.FXML
    private TextField roleField;
    @javafx.fxml.FXML
    private TextField nameField;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {
        System.out.print("submited ");
    }



    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);
    }

}
