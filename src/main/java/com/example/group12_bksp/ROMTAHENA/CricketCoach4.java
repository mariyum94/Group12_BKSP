package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CricketCoach4
{
    @javafx.fxml.FXML
    private TableColumn colDuration;
    @javafx.fxml.FXML
    private TextField drillNameField;
    @javafx.fxml.FXML
    private ComboBox drillTypeComboBox;
    @javafx.fxml.FXML
    private TextField durationField;
    @javafx.fxml.FXML
    private TableColumn colDrillName;
    @javafx.fxml.FXML
    private TableColumn colDrillType;
    @javafx.fxml.FXML
    private TableView drillTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AddDrillButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DeleteDrillButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoachDashboard.fxml", actionEvent);
    }
}