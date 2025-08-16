package com.example.group12_bksp.Mansura;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Createevent {

    @FXML
    private TextField NameTextField;

    @FXML
    private TextField TimeTextField;

    @FXML
    private TextField VenueTextField;

    @FXML
    private DatePicker eventDatePicker;

    @FXML
    private Label statuslabel;

    private List<EventCmodel5> eventsList = new ArrayList<>();

    @FXML
    public void initialize() {
        eventDatePicker.setValue(LocalDate.now());
        statuslabel.setText("");
    }

    @FXML
    private void addhandleonaction(ActionEvent actionEvent) {
        String name = NameTextField.getText();
        String time = TimeTextField.getText();
        String venue = VenueTextField.getText();
        LocalDate date = eventDatePicker.getValue();

        if (name.isEmpty() || time.isEmpty() || venue.isEmpty() || date == null) {
            statuslabel.setText("Please fill all fields!");
            return;
        }

        EventCmodel5 newEvent = new EventCmodel5(name, date.toString(), time, venue);
        eventsList.add(newEvent);

        statuslabel.setText("Event created successfully!");

        // Clear fields
        NameTextField.clear();
        TimeTextField.clear();
        VenueTextField.clear();
        eventDatePicker.setValue(LocalDate.now());
    }

    @FXML
    private void onBack(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("EventCdashboard.fxml", actionEvent);
    }
}

