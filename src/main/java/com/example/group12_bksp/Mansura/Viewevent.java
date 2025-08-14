package com.example.group12_bksp.Mansura;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Viewevent {

    @FXML
    private TableView<EventCmodel5> eventTable;

    @FXML
    private TableColumn<EventCmodel5, String> colEventName;

    @FXML
    private TableColumn<EventCmodel5, String> colEventDate;

    @FXML
    private TableColumn<EventCmodel5, String> colEventTime;

    @FXML
    private TableColumn<EventCmodel5, String> colVenue;

    @FXML
    private Button onRefreshEvents, onBack;

    private ObservableList<EventCmodel5> eventsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Map table columns to model properties
        colEventName.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        colEventDate.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
        colEventTime.setCellValueFactory(new PropertyValueFactory<>("eventTime"));
        colVenue.setCellValueFactory(new PropertyValueFactory<>("eventVenue"));

        // Load initial sample data
        loadSampleEvents();
    }

    private void loadSampleEvents() {
        eventsList.clear();
        eventsList.add(new EventCmodel5("Tech Talk", "2025-08-20", "10:00 AM", "Auditorium"));
        eventsList.add(new EventCmodel5("Workshop", "2025-08-22", "2:00 PM", "Lab 5"));
        eventsList.add(new EventCmodel5("Seminar", "2025-08-25", "11:00 AM", "Conference Hall"));
        eventTable.setItems(eventsList);
    }

    @FXML
    private void onRefreshEvents() {
        // Normally reload from database, here reload sample data
        loadSampleEvents();
    }

    @FXML
    private void onBack() {
        // Implement back navigation logic
        System.out.println("Back button pressed");
    }
}


