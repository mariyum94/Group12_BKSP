package com.example.group12_bksp.Mansura;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class Viewevent {

    @FXML
    private TableView<EventCmodel5> eventTable;
    @FXML
    private TableColumn<EventCmodel5, String> coleventname;
    @FXML
    private TableColumn<EventCmodel5, String> coleventdate;
    @FXML
    private TableColumn<EventCmodel5, String> coleventtime;
    @FXML
    private TableColumn<EventCmodel5, String> colvenue;

    // ArrayList to hold events
    private static ArrayList<EventCmodel5> eventList = new ArrayList<>();

    // Initialize method to set up the table
    @FXML
    public void initialize() {
        coleventname.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        coleventdate.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
        coleventtime.setCellValueFactory(new PropertyValueFactory<>("eventTime"));
        colvenue.setCellValueFactory(new PropertyValueFactory<>("eventVenue"));

        // Load data from ArrayList
        eventTable.getItems().addAll(eventList);
    }

    // Refresh button action
    @FXML
    public void onRefreshEvents(ActionEvent actionEvent) {
        eventTable.getItems().clear();
        eventTable.getItems().addAll(eventList);
    }

    // Back button action
    @FXML
    public void onBack(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/EventCdashboard.fxml", actionEvent);
    }
}



