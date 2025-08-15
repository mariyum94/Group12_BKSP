package com.example.group12_bksp.Mansura;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class Createevent {

    @FXML
    private Label statuslabel;

    @FXML
    private TextField eventNameField;

    @FXML
    private TextField eventTimeField;

    @FXML
    private TextField venueField;

    @FXML
    private DatePicker eventDatePicker;

    @FXML
    public void initialize() {
        eventDatePicker.setValue(LocalDate.now()); // default date
        statuslabel.setText(""); // clear status
    }

    @FXML
    public void handleCreateEvent(ActionEvent actionEvent) {
        String name = eventNameField.getText();
        String time = eventTimeField.getText();
        String venue = venueField.getText();
        LocalDate date = eventDatePicker.getValue();

        if (name.isEmpty() || time.isEmpty() || venue.isEmpty() || date == null) {
            statuslabel.setText("Please fill all fields!");
            return;
        }

        // Saving logic to DB or file
        statuslabel.setText("Event created successfully!");
    }

    @FXML
    public void goBack(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("EventCdashboard.fxml", actionEvent);
    }

    @FXML
    public void logOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login.fxml", actionEvent);
    }
}

