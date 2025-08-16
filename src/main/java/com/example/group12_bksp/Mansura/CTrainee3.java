package com.example.group12_bksp.Mansura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class CTrainee3 {

    @FXML
    private TableView<CTraineemodel3> attendanceTable;

    @FXML
    private TableColumn<CTraineemodel3, LocalDate> dateColumn;

    @FXML
    private TableColumn<CTraineemodel3, String> statusColumn;

    // Static ArrayList to store attendance records
    static ArrayList<CTraineemodel3> CTraineemodel3list = new ArrayList<>();

    @FXML
    public void initialize() {
        // Map columns to model properties
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Load any existing records
        attendanceTable.getItems().addAll(CTraineemodel3list);
    }

    @FXML
    private void handleLoadAttendance(ActionEvent event) {
        // If the list is empty, add sample attendance records
        if (CTraineemodel3list.isEmpty()) {
            CTraineemodel3list.add(new CTraineemodel3(LocalDate.of(2025, 8, 1), "Present"));
            CTraineemodel3list.add(new CTraineemodel3(LocalDate.of(2025, 8, 2), "Absent"));
            CTraineemodel3list.add(new CTraineemodel3(LocalDate.of(2025, 8, 3), "Present"));
            CTraineemodel3list.add(new CTraineemodel3(LocalDate.of(2025, 8, 4), "Present"));
        }

        // Refresh TableView
        attendanceTable.getItems().setAll(CTraineemodel3list);
    }
}
