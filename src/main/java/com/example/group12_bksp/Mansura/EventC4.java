package com.example.group12_bksp.Mansura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EventC4 {

    @FXML
    private TableView<EventCmodel2> participantstable;
    @FXML
    private TableColumn<EventCmodel2, Integer> idColumn;
    @FXML
    private TableColumn<EventCmodel2, String> nameColumn;
    @FXML
    private TableColumn<EventCmodel2, String> emailColumn;
    @FXML
    private TableColumn<EventCmodel2, String> statusColumn;

    @FXML
    public void initialize() {
        // Bind columns to EventCmodel2 properties
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

    }

    @FXML
    public void approveParticipant(ActionEvent actionEvent) {
        EventCmodel2 selected = participantstable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Approved");
            participantstable.refresh();
        }
    }

    @FXML
    public void removeParticipant(ActionEvent actionEvent) {
        EventCmodel2 selected = participantstable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            participantstable.getItems().remove(selected);
        }
    }

    @FXML
    public void backToDashboard(ActionEvent actionEvent) {
        // Implement scene switch if needed
        System.out.println("Back button clicked");
    }
}
