package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class CricketCoach6
{
    @javafx.fxml.FXML
    private TableView communicationTable;
    @javafx.fxml.FXML
    private TableColumn colRecipient;
    @javafx.fxml.FXML
    private TableColumn colMessage;
    @javafx.fxml.FXML
    private TableColumn colDateTime;
    @javafx.fxml.FXML
    private TextArea messageArea;
    @javafx.fxml.FXML
    private ComboBox traineeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SendButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoachDashboard.fxml", actionEvent);
    }
}