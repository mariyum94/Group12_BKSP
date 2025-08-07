package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HRManager1 {

    @FXML
    private TextField ContactTF;

    @FXML
    private TextField NameTF;

    @FXML
    private TextField RoleTF;

    @FXML
    private TableView<?> StaffRecordsTV;

    @FXML
    private TableColumn<?, ?> colContact;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colRole;

    @FXML
    private Label messageLabel;

    @FXML
    private Label messageLabel1;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void addButton(ActionEvent event) {

    }

    @FXML
    void deleteButton(ActionEvent event) {

    }

    @FXML
    void editButton(ActionEvent event) {

    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }

}
