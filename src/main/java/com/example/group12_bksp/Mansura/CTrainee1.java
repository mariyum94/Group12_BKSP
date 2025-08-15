package com.example.group12_bksp.Mansura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
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

    @FXML
    public void initialize() {
        // Bind table columns to model properties
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        sessionTypeColumn.setCellValueFactory(new PropertyValueFactory<>("sessionType"));
        coachColumn.setCellValueFactory(new PropertyValueFactory<>("coach"));
        locationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));

        // Sample data
        scheduleTable.getItems().addAll(
                new CTraineemodel1(LocalDate.of(2025, 8, 15), "10:00 AM", "Yoga", "John", "Room 1"),
                new CTraineemodel1(LocalDate.of(2025, 8, 16), "2:00 PM", "Strength Training", "Sara", "Gym Hall"),
                new CTraineemodel1(LocalDate.of(2025, 8, 17), "11:00 AM", "Cardio", "Mike", "Outdoor Field")
        );
    }

    @FXML
    private void handleMySchedule(ActionEvent event) throws IOException {
        System.out.println("My schedule button clicked");
        // You can add SceneSwitcher logic here if needed
        // SceneSwitcher.switchTo("myschedule.fxml", event);
    }
}
