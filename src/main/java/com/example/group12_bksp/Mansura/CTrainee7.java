package com.example.group12_bksp.Mansura;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

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

    // ArrayList to store team members
    static ArrayList<CTraineemodel7> teamList = new ArrayList<>();

    @FXML
    public void initialize() {
        // Column bindings using PropertyValueFactory
        playerNameColumn.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<>("role"));
        jerseyColumn.setCellValueFactory(new PropertyValueFactory<>("jerseyNumber"));
        positionColumn.setCellValueFactory(new PropertyValueFactory<>("position"));

        // Load existing data from ArrayList if any
        ObservableList<CTraineemodel7> observableTeam = FXCollections.observableArrayList(teamList);
        teamTable.setItems(observableTeam);
    }

    @FXML
    public void handleLoadTeam(ActionEvent event) {
        // Clear previous data
        teamList.clear();

        // Add team members to ArrayList
        teamList.add(new CTraineemodel7("Alice", "Captain", 10, "Forward"));
        teamList.add(new CTraineemodel7("Bob", "Player", 7, "Midfielder"));
        teamList.add(new CTraineemodel7("Charlie", "Player", 5, "Defender"));

        // Update TableView
        ObservableList<CTraineemodel7> teamMembers = FXCollections.observableArrayList(teamList);
        teamTable.setItems(teamMembers);
    }
}
