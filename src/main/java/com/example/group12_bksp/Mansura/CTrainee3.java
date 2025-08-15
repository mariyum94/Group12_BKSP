package com.example.group12_bksp.Mansura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class CTrainee3 {

    @FXML
    private TableView<CTraineemodel3> attendanceTable;

    @FXML
    private TableColumn<CTraineemodel3, LocalDate> dateColumn;

    @FXML
    private TableColumn<CTraineemodel3, String> statusColumn;

    @FXML
    public void initialize() {
        // Bind columns to model properties
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Sample data for testing
        attendanceTable.getItems().addAll(
                new CTraineemodel3(LocalDate.of(2025, 8, 10), "Present"),
                new CTraineemodel3(LocalDate.of(2025, 8, 11), "Absent"),
                new CTraineemodel3(LocalDate.of(2025, 8, 12), "Present")
        );
    }

    @FXML
    private void handleLoadAttendance(ActionEvent event) {
        System.out.println("Load Attendance button clicked");
        // Here you can implement logic to reload attendance from a database or file
    }
}
