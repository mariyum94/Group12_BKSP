package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class DirectorGeneral8
{
    @javafx.fxml.FXML
    private TableColumn colMessage;
    @javafx.fxml.FXML
    private TableView messageHistoryTable;
    @javafx.fxml.FXML
    private TextArea messageArea;
    @javafx.fxml.FXML
    private TableColumn colDate;
    @javafx.fxml.FXML
    private TableColumn colCoach;
    @javafx.fxml.FXML
    private ComboBox coachComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void DeleteButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SendButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGdashboard.fxml", actionEvent);
    }
}