package com.example.group12_bksp.Mansura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class CTrainee4 {

    @FXML
    private TableView<CTraineemodel4> feedbackTable;

    @FXML
    private TableColumn<CTraineemodel4, LocalDate> dateColumn;

    @FXML
    private TableColumn<CTraineemodel4, String> coachColumn;

    @FXML
    private TableColumn<CTraineemodel4, String> commentColumn;

    // Static ArrayList to store feedback
    static ArrayList<CTraineemodel4> CTraineemodel4list = new ArrayList<>();

    @FXML
    public void initialize() {
        // Map TableView columns to model properties
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        coachColumn.setCellValueFactory(new PropertyValueFactory<>("coach"));
        commentColumn.setCellValueFactory(new PropertyValueFactory<>("comment"));

        // Load existing feedback
        feedbackTable.getItems().addAll(CTraineemodel4list);
    }

    @FXML
    private void handleLoadFeedback(ActionEvent event) {
        // If list is empty, add sample feedback
        if (CTraineemodel4list.isEmpty()) {
            CTraineemodel4list.add(new CTraineemodel4(LocalDate.of(2025, 8, 1), "Coach A", "Good effort"));
            CTraineemodel4list.add(new CTraineemodel4(LocalDate.of(2025, 8, 2), "Coach B", "Needs improvement"));
            CTraineemodel4list.add(new CTraineemodel4(LocalDate.of(2025, 8, 3), "Coach A", "Excellent performance"));
        }

        // Refresh TableView
        feedbackTable.getItems().setAll(CTraineemodel4list);
    }
}


