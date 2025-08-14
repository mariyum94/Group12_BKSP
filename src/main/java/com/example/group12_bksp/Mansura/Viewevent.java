package com.example.group12_bksp.Mansura;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class Viewevent {

    @FXML
    private TableView<EventCmodel5> eventtable;

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

    // Static list to persist events
    static ArrayList<EventCmodel5> eventsArrayList = new ArrayList<>();

    @FXML
    public void initialize() {
        colEventName.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        colEventDate.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
        colEventTime.setCellValueFactory(new PropertyValueFactory<>("eventTime"));
        colVenue.setCellValueFactory(new PropertyValueFactory<>("eventVenue"));

        loadEventsToTable();
    }

    private void loadEventsToTable() {
        ObservableList<EventCmodel5> eventsList = FXCollections.observableArrayList(eventsArrayList);
        eventtable.setItems(eventsList);
    }

    @FXML
    private void onRefreshEvents() {
        loadEventsToTable();
    }

    @FXML
    private void onBack() {
        System.out.println("Back button pressed");
    }
}
