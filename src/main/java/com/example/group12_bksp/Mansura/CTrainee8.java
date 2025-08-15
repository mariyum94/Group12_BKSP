package com.example.group12_bksp.Mansura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

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

    // Use ArrayList instead of ObservableList
    private ArrayList<CTraineemodel8> matchResultsList = new ArrayList<>();

    @FXML
    public void initialize() {
        matchDateColumn.setCellValueFactory(new PropertyValueFactory<>("matchDate"));
        opponentColumn.setCellValueFactory(new PropertyValueFactory<>("opponent"));
        matchTypeColumn.setCellValueFactory(new PropertyValueFactory<>("matchType"));
        resultColumn.setCellValueFactory(new PropertyValueFactory<>("result"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<>("score"));
        summaryColumn.setCellValueFactory(new PropertyValueFactory<>("summary"));

        // Add example data
        matchResultsList.add(new CTraineemodel8(LocalDate.of(2025, 8, 14), "Team A", "Home", "Win", "3-1", "Good performance"));
        matchResultsList.add(new CTraineemodel8(LocalDate.of(2025, 8, 10), "Team B", "Away", "Lose", "0-2", "Poor defense"));

        // Populate TableView from ArrayList
        matchResultsTable.getItems().addAll(matchResultsList);
    }

    @Deprecated
    public void loadResults(ActionEvent actionEvent) {
        // Clear and reload TableView from ArrayList
        matchResultsTable.getItems().clear();
        matchResultsTable.getItems().addAll(matchResultsList);
        matchResultsTable.refresh();
    }

    // Optional: add method to add new match result to ArrayList
    @Deprecated
    public void addMatchResult(ActionEvent actionEvent) {
        if (matchDatePicker.getValue() != null && !opponentTextField.getText().isEmpty()) {
            String matchType = homeRadio.isSelected() ? "Home" : "Away";
            // Default placeholders for result, score, summary
            CTraineemodel8 newMatch = new CTraineemodel8(
                    matchDatePicker.getValue(),
                    opponentTextField.getText(),
                    matchType,
                    "Pending",
                    "-",
                    "-"
            );
            matchResultsList.add(newMatch);
            matchResultsTable.getItems().add(newMatch);

            // Clear input fields
            matchDatePicker.setValue(null);
            opponentTextField.clear();
            homeRadio.setSelected(false);
            awayRadio.setSelected(false);
        }
    }

    @FXML
    public void handleLoadResults(ActionEvent actionEvent) {
    }
}
