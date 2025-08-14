package com.example.group12_bksp.Mansura;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class Editevent {

    @FXML
    private TableView<EventCmodel1> eventtable;
    @FXML
    private TableColumn<EventCmodel1, String> colEventname;
    @FXML
    private TableColumn<EventCmodel1, Integer> colEventId;
    @FXML
    private TableColumn<EventCmodel1, LocalDate> coleeventdate;
    @FXML
    private TableColumn<EventCmodel1, String> coleventtime;
    @FXML
    private TableColumn<EventCmodel1, String> coleventvenue;

    @FXML
    private TextField eventnameTF;
    @FXML
    private TextField eventtimeTF;
    @FXML
    private TextField eventvenueTF;
    @FXML
    private DatePicker eventdateDP;

    private ObservableList<EventCmodel1> eventList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Column bindings
        colEventname.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        colEventId.setCellValueFactory(new PropertyValueFactory<>("eventId"));
        coleeventdate.setCellValueFactory(new PropertyValueFactory<>("eventDate"));
        coleventtime.setCellValueFactory(new PropertyValueFactory<>("eventTime"));
        coleventvenue.setCellValueFactory(new PropertyValueFactory<>("eventVenue"));

        // Sample data
        eventList.addAll(
                new EventCmodel1("Event1", 1, LocalDate.of(2025, 8, 15), "10:00", "Hall A"),
                new EventCmodel1("Event2", 2, LocalDate.of(2025, 8, 16), "12:00", "Hall B")
        );

        eventtable.setItems(eventList);
    }

    @FXML
    public void editonaction(ActionEvent actionEvent) {
        EventCmodel1 selected = eventtable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            eventnameTF.setText(selected.getEventName());
            eventtimeTF.setText(selected.getEventTime());
            eventvenueTF.setText(selected.getEventVenue());
            eventdateDP.setValue(selected.getEventDate());
        }
    }

    @FXML
    public void updateonaction(ActionEvent actionEvent) {
        EventCmodel1 selected = eventtable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setEventName(eventnameTF.getText());
            selected.setEventTime(eventtimeTF.getText());
            selected.setEventVenue(eventvenueTF.getText());
            selected.setEventDate(eventdateDP.getValue());
            eventtable.refresh();
        }
    }

    @FXML
    public void cancelonaction(ActionEvent actionEvent) {
        eventnameTF.clear();
        eventtimeTF.clear();
        eventvenueTF.clear();
        eventdateDP.setValue(null);
        eventtable.getSelectionModel().clearSelection();
    }
}

