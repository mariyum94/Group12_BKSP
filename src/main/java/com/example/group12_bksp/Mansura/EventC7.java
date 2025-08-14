package com.example.group12_bksp.Mansura;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class EventC7 {

    @FXML
    private TableView<EventCmodel3> volunteerTable;

    @FXML
    private TableColumn<EventCmodel3, Integer> idColumn;

    @FXML
    private TableColumn<EventCmodel3, String> nameColumn;

    @FXML
    private TableColumn<EventCmodel3, String> roleColumn;

    @FXML
    private Label statusLabel;

    private ObservableList<EventCmodel3> volunteers = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Column bindings
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<>("role"));

        // Sample data
        volunteers.add(new EventCmodel3(1, "Alice", "Helper"));
        volunteers.add(new EventCmodel3(2, "Bob", "Coordinator"));
        volunteers.add(new EventCmodel3(3, "Charlie", "Helper"));

        volunteerTable.setItems(volunteers);
    }

    @FXML
    public void handleAssignButton(ActionEvent event) {
        EventCmodel3 selected = volunteerTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setRole("Assigned");
            volunteerTable.refresh();
            statusLabel.setText("Volunteer " + selected.getName() + " assigned!");
        } else {
            statusLabel.setText("No volunteer selected!");
        }
    }
}
