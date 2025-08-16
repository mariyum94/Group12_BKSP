package com.example.group12_bksp.Mansura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

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

    // Static ArrayList to store events
    static ArrayList<CTraineemodel2> CTraineemodel2list = new ArrayList<>();

    @FXML
    public void initialize() {
        // Map columns to model properties
        eventNameColumn.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        eventDateColumn.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
        eventLocationColumn.setCellValueFactory(new PropertyValueFactory<>("eventLocation"));
        eventStatusColumn.setCellValueFactory(new PropertyValueFactory<>("eventStatus"));

        // Load existing events from ArrayList
        eventsTable.getItems().addAll(CTraineemodel2list);
    }

    @FXML
    private void handleLoadEvents(ActionEvent event) {
        // Sample events if list is empty
        if (CTraineemodel2list.isEmpty()) {
            CTraineemodel2list.add(new CTraineemodel2("Music Festival", LocalDate.of(2025, 8, 25), "Auditorium", "Open"));
            CTraineemodel2list.add(new CTraineemodel2("Workshop on AI", LocalDate.of(2025, 8, 28), "Lab 3", "Open"));
            CTraineemodel2list.add(new CTraineemodel2("Sports Day", LocalDate.of(2025, 9, 2), "Playground", "Closed"));
        }

        // Refresh TableView
        eventsTable.getItems().setAll(CTraineemodel2list);
        statusLabel.setText("Events loaded successfully.");
    }

    @FXML
    private void handleRegisterEvent(ActionEvent event) {
        CTraineemodel2 selectedEvent = eventsTable.getSelectionModel().getSelectedItem();
        if (selectedEvent == null) {
            statusLabel.setText("Please select an event to register.");
            return;
        }

        // Demo registration logic
        statusLabel.setText("Registered for: " + selectedEvent.getEventName());
    }
}


