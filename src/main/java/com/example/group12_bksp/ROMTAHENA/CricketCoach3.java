package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CricketCoach3
{
    @javafx.fxml.FXML
    private ComboBox playerComboBox;
    @javafx.fxml.FXML
    private TableColumn colBowlWkts;
    @javafx.fxml.FXML
    private TableColumn colOpp;
    @javafx.fxml.FXML
    private TableColumn colBatRuns;
    @javafx.fxml.FXML
    private TableColumn colFitness;
    @javafx.fxml.FXML
    private TableView playerStatsTable;
    @javafx.fxml.FXML
    private TableColumn colBowlRuns;
    @javafx.fxml.FXML
    private TableColumn colMatch;
    @javafx.fxml.FXML
    private TableColumn colDate;
    @javafx.fxml.FXML
    private TableColumn colBatBalls;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoachDashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ExportButton(ActionEvent actionEvent) {
    }
}