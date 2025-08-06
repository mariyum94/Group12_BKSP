package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HRManager3 {

    @FXML
    private TextField NameTF;

    @FXML
    private ComboBox<?> RoleCB;

    @FXML
    private TableView<?> applicationsTable;

    @FXML
    private Label messageLabel;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TableColumn<?, ?> roleColumn;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void approveButton(ActionEvent event) {

    }

    @FXML
    void rejectButton(ActionEvent event) {

    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }

}

