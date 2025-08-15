package com.example.group12_bksp.Mansura;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class CTrainee1 {

    @FXML
    private TableView<CTraineemodel1> scheduleTable;

    @FXML
    private TableColumn<CTraineemodel1, LocalDate> dateColumn;
    @FXML
    private TableColumn<CTraineemodel1, String> timeColumn;
    @FXML
    private TableColumn<CTraineemodel1, String> sessionTypeColumn;
    @FXML
    private TableColumn<CTraineemodel1, String> coachColumn;
    @FXML
    private TableColumn<CTraineemodel1, String> locationColumn;

    private ObservableList<CTraineemodel1> scheduleList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Map columns to model properties
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        sessionTypeColumn.setCellValueFactory(new PropertyValueFactory<>("sessionType"));
        coachColumn.setCellValueFactory(new PropertyValueFactory<>("coach"));
        locationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));

        // Bind the list to the table
        scheduleTable.setItems(scheduleList);
    }

    @FXML
    private void handleMySchedule(ActionEvent event) {
        // Example data for demonstration
        CTraineemodel1 newEntry = new CTraineemodel1(
                LocalDate.of(2025, 8, 20),
                "10:00 AM",
                "Yoga",
                "Coach John",
                "Hall 1"
        );

        scheduleList.add(newEntry);
        scheduleTable.refresh();
    }
}
