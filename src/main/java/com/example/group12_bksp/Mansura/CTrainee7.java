package com.example.group12_bksp.Mansura;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CTrainee7 {

    @FXML
    private TableView<CTraineemodel7> teamTable;

    @FXML
    private TableColumn<CTraineemodel7, String> playerNameColumn;

    @FXML
    private TableColumn<CTraineemodel7, String> roleColumn;

    @FXML
    private TableColumn<CTraineemodel7, Integer> jerseyColumn;

    @FXML
    private TableColumn<CTraineemodel7, String> positionColumn;

    @FXML
    public void initialize() {
        // Column bindings using PropertyValueFactory
        playerNameColumn.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<>("role"));
        jerseyColumn.setCellValueFactory(new PropertyValueFactory<>("jerseyNumber"));
        positionColumn.setCellValueFactory(new PropertyValueFactory<>("position"));
    }

    @FXML
    public void handleLoadTeam(ActionEvent event) {
        // Use the model class CTraineemodel7
        ObservableList<CTraineemodel7> teamMembers = FXCollections.observableArrayList(
                new CTraineemodel7("Alice", "Captain", 10, "Forward"),
                new CTraineemodel7("Bob", "Player", 7, "Midfielder"),
                new CTraineemodel7("Charlie", "Player", 5, "Defender")
        );
        teamTable.setItems(teamMembers);
    }
}
