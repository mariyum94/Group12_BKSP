package com.example.group12_bksp.Mansura;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class CTrainee8 {

    @FXML
    private TextField opponentTextField;
    @FXML
    private RadioButton homeRadio;
    @FXML
    private RadioButton awayRadio;
    @FXML
    private DatePicker matchDatePicker;
    @FXML
    private TableView<CTraineemodel8> matchResultsTable;
    @FXML
    private TableColumn<CTraineemodel8, LocalDate> matchDateColumn;
    @FXML
    private TableColumn<CTraineemodel8, String> opponentColumn;
    @FXML
    private TableColumn<CTraineemodel8, String> matchTypeColumn;
    @FXML
    private TableColumn<CTraineemodel8, String> resultColumn;
    @FXML
    private TableColumn<CTraineemodel8, String> scoreColumn;
    @FXML
    private TableColumn<CTraineemodel8, String> summaryColumn;

    private ObservableList<CTraineemodel8> matchResultsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        matchDateColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("matchDate"));
        opponentColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("opponent"));
        matchTypeColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("matchType"));
        resultColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("result"));
        scoreColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("score"));
        summaryColumn.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("summary"));

        // Add example data
        matchResultsList.addAll(
                new CTraineemodel8(LocalDate.of(2025, 8, 14), "Team A", "Home", "Win", "3-1", "Good performance"),
                new CTraineemodel8(LocalDate.of(2025, 8, 10), "Team B", "Away", "Lose", "0-2", "Poor defense")
        );

        matchResultsTable.setItems(matchResultsList);
    }

    @FXML
    public void loadResults(ActionEvent actionEvent) {
        // Refresh TableView if needed
        matchResultsTable.refresh();
    }
}
