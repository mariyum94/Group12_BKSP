package com.example.group12_bksp.Mansura;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.format.DateTimeFormatter;

public class CTrainee5 {

    @FXML
    private DatePicker datePicker;

    @FXML
    private ComboBox<String> coachComboBox;

    @FXML
    private RadioButton morningRadio, afternoonRadio, eveningRadio;

    @FXML
    private CheckBox battingCheckBox, bowlingCheckBox, fitnessCheckBox;

    @FXML
    private TextField filterField;

    @FXML
    private TableView<CTraineemodel5> sessionTable;

    @FXML
    private TableColumn<CTraineemodel5, String> sessionDateColumn;
    @FXML
    private TableColumn<CTraineemodel5, String> sessionTimeColumn;
    @FXML
    private TableColumn<CTraineemodel5, String> sessionCoachColumn;
    @FXML
    private TableColumn<CTraineemodel5, String> sessionTypeColumn;
    @FXML
    private TableColumn<CTraineemodel5, String> availabilityColumn;

    @FXML
    private Label confirmationLabel;

    private final ObservableList<CTraineemodel5> allSessions = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        coachComboBox.setItems(FXCollections.observableArrayList("Coach A", "Coach B", "Coach C"));


        sessionDateColumn.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(
                        data.getValue().getDate().format(DateTimeFormatter.ISO_DATE)
                )
        );
        sessionTimeColumn.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getTime())
        );
        sessionCoachColumn.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getCoach())
        );
        sessionTypeColumn.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getType())
        );
        availabilityColumn.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().isAvailable() ? "Yes" : "No")
        );

        // Sample data
        allSessions.addAll(
                new CTraineemodel5(java.time.LocalDate.of(2025,8,20), "Morning", "Coach A", "Batting", true),
                new CTraineemodel5(java.time.LocalDate.of(2025,8,21), "Evening", "Coach B", "Bowling", false)
        );

        sessionTable.setItems(allSessions);
    }

    @FXML
    private void handleFilterSessions() {
        String filter = filterField.getText().toLowerCase();
        if (filter.isEmpty()) {
            sessionTable.setItems(allSessions);
        } else {
            sessionTable.setItems(allSessions.filtered(s ->
                    s.getCoach().toLowerCase().contains(filter) ||
                            s.getDate().toString().contains(filter) ||
                            s.getType().toLowerCase().contains(filter)
            ));
        }
    }

    @FXML
    private void handleRequestSession(ActionEvent event) {
        confirmationLabel.setText("Session request submitted!");
    }
}
