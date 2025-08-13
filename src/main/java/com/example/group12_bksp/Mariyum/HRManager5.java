package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class HRManager5 {

    @FXML
    private ComboBox<?> employeeComboBox;

    @FXML
    private Label massagelabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }
    @FXML
    void sendnotificationButton(ActionEvent event) {

    }

}
