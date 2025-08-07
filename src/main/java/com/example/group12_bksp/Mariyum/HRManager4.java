package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class HRManager4 {

    @FXML
    private TableColumn<?, ?> coachColumn;

    @FXML
    private ComboBox<?> coachComboBox;

    @FXML
    private TableColumn<?, ?> dateColumn;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label messageLabel;

    @FXML
    private TableView<?> scheduleTableView;

    @FXML
    private TableColumn<?, ?> sportColumn;

    @FXML
    private ComboBox<?> sportComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void addScheduleButton(ActionEvent event) {

    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);

    }

}
