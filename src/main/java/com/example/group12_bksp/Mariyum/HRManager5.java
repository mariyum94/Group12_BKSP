package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class HRManager5 {

    @FXML
    private ComboBox<String> employeeComboBox;

    @FXML
    private Label massagelabel;

    @javafx.fxml.FXML
    public void initialize() {
        employeeComboBox.getItems().addAll("Cricket Coach ", "trainee", "Event Coordinator", "Cricket Trainee");
    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }
    @FXML
    void sendnotificationButton(ActionEvent event) {
        String Employee = employeeComboBox.getValue();

        if (Employee == null) {
            massagelabel.setText("Please select an employee to notify.");
        } else {
            // You can add actual notification logic here
            massagelabel.setText("Notification sent to " + Employee + ".");
        }

}}
