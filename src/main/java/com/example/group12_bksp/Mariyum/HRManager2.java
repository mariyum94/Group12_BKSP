package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HRManager2 {

    @FXML
    private TextField EmployeeNameTF;

    @FXML
    private ComboBox<?> atendanceCB;

    @FXML
    private DatePicker attendanceDatePicker;

    @FXML
    private TableView<?> attendanceTV;

    @FXML
    private Label messageLabel1;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TableColumn<?, ?> presentColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void generateReportButton(ActionEvent event) {

    }

    @FXML
    void markPresentButton(ActionEvent event) {

    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }


}
