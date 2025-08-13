package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HRManager8 {

    @FXML
    private TableView<?> healthTable;

    @FXML
    private TableColumn<?, ?> injuryCol;

    @FXML
    private TextField injuryField;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private TextField nameField;

    @FXML
    private TextField textarea;

    @FXML
    private TableColumn<?, ?> weightCol;

    @FXML
    private TextField weightField;


    @javafx.fxml.FXML
    public void initialize() {
    }
    @FXML
    void addRecordButton(ActionEvent event) {

    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }

}
