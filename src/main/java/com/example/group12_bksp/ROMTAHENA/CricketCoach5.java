package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class CricketCoach5
{
    @javafx.fxml.FXML
    private TableColumn colEndurance;
    @javafx.fxml.FXML
    private TableColumn colNotes;
    @javafx.fxml.FXML
    private TextArea notesArea;
    @javafx.fxml.FXML
    private TableView fitnessTable;
    @javafx.fxml.FXML
    private TableColumn colStrength;
    @javafx.fxml.FXML
    private TextField speedField;
    @javafx.fxml.FXML
    private TextField enduranceField;
    @javafx.fxml.FXML
    private TextField strengthField;
    @javafx.fxml.FXML
    private ComboBox playerComboBox;
    @javafx.fxml.FXML
    private TableColumn colDate;
    @javafx.fxml.FXML
    private TableColumn colSpeed;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SaveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoachDashboard.fxml", actionEvent);
    }
}