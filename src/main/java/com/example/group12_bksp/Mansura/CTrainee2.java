package com.example.group12_bksp.Mansura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class CTrainee2 {

    @FXML
    private TableView<CTraineemodel2> eventsTable;

    @FXML
    private TableColumn<CTraineemodel2, String> eventNameColumn;

    @FXML
    private TableColumn<CTraineemodel2, LocalDate> eventDateColumn;

    @FXML
    private TableColumn<CTraineemodel2, String> eventLocationColumn;

    @FXML
    private TableColumn<CTraineemodel2, String> eventStatusColumn;

    @FXML
    private Label statusLabel;

    @FXML
    public void initialize() {

        eventNameColumn.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        eventDateColumn.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
        eventLocationColumn.setCellValueFactory(new PropertyValueFactory<>("eventLocation"));
        eventStatusColumn.setCellValueFactory(new PropertyValueFactory<>("eventStatus"));

        // Sample data
        eventsTable.getItems().addAll(
                new CTraineemodel2("Yoga Workshop", LocalDate.of(2025, 8, 20), "Room 1", "Open"),
                new CTraineemodel2("Strength Training", LocalDate.of(2025, 8, 21), "Gym Hall", "Full"),
                new CTraineemodel2("Cardio Challenge", LocalDate.of(2025, 8, 22), "Outdoor Field", "Open")
        );

        statusLabel.setText(""); // Clear status label on load
    }

    @FXML
    private void handleLoadEvents(ActionEvent event) throws IOException {
        System.out.println("Load Events button clicked");
        // You can add logic to reload events from a file or database
    }

    @FXML
    private void handleRegisterEvent(ActionEvent event) throws IOException {
        System.out.println("Register Event button clicked");
        // You can add logic to register selected event
    }
}

