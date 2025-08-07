package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HRManager6 {

    @FXML
    private TextField NameTF;

    @FXML
    private TextField RoleTF;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TextField perfomanceTFTF;

    @FXML
    private TableView<?> performanceTable;

    @FXML
    private TextArea remarksArea;

    @FXML
    private TableColumn<?, ?> roleColumn;

    @FXML
    private TableColumn<?, ?> scoreColumn;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @FXML
    void evaluateButton(ActionEvent event) {

    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }

    @FXML
    void saveButton(ActionEvent event) {

    }

}
