package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class HRManager7 {

    @FXML
    private TextArea reportTextArea;

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void generateReportButton(ActionEvent event) {

    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }

}
