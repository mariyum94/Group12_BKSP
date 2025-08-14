package com.example.group12_bksp.Mansura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class CTrainee4 {

    @FXML
    private TableView<CTraineemodel4> feedbackTable;

    @FXML
    private TableColumn<CTraineemodel4, LocalDate> dateColumn;

    @FXML
    private TableColumn<CTraineemodel4, String> coachColumn;

    @FXML
    private TableColumn<CTraineemodel4, String> commentColumn;

    @FXML
    public void initialize() {
        // Bind table columns to model properties
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        coachColumn.setCellValueFactory(new PropertyValueFactory<>("coach"));
        commentColumn.setCellValueFactory(new PropertyValueFactory<>("comment"));

        // Sample data to display in the table
        feedbackTable.getItems().addAll(
                new CTraineemodel4(LocalDate.of(2025, 8, 10), "Coach A", "Good progress."),
                new CTraineemodel4(LocalDate.of(2025, 8, 11), "Coach B", "Needs improvement."),
                new CTraineemodel4(LocalDate.of(2025, 8, 12), "Coach A", "Excellent performance.")
        );
    }

    @FXML
    private void handleLoadFeedback(ActionEvent event) {
        System.out.println("Load Feedback button clicked");
        // You can replace this with logic to load feedback from a database or file
    }
}

