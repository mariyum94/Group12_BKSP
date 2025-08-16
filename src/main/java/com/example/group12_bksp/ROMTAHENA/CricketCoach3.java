package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class CricketCoach3
{
    @javafx.fxml.FXML
    private ComboBox<String> playerComboBox;
    @javafx.fxml.FXML
    private TableColumn<CricketCoachModelClass3, String> colBowlWkts;
    @javafx.fxml.FXML
    private TableColumn<CricketCoachModelClass3, String> colOpp;
    @javafx.fxml.FXML
    private TableColumn<CricketCoachModelClass3, String> colBatRuns;
    @javafx.fxml.FXML
    private TableColumn<CricketCoachModelClass3, String> colFitness;
    @javafx.fxml.FXML
    private TableView<CricketCoachModelClass3> playerStatsTable;
    @javafx.fxml.FXML
    private TableColumn<CricketCoachModelClass3, String> colBowlRuns;
    @javafx.fxml.FXML
    private TableColumn<CricketCoachModelClass3, String> colMatch;
    @javafx.fxml.FXML
    private TableColumn<CricketCoachModelClass3, String> colDate;
    @javafx.fxml.FXML
    private TableColumn<CricketCoachModelClass3, String> colBatBalls;

    @javafx.fxml.FXML
    public void initialize() {
        playerComboBox.getItems().addAll("Player A", "Player B", "Player C");
        playerComboBox.setPromptText("Select Player");

        colMatch.setCellValueFactory(new PropertyValueFactory<>("match"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colOpp.setCellValueFactory(new PropertyValueFactory<>("opponent"));
        colBatRuns.setCellValueFactory(new PropertyValueFactory<>("battingRuns"));
        colBatBalls.setCellValueFactory(new PropertyValueFactory<>("battingBalls"));
        colBowlRuns.setCellValueFactory(new PropertyValueFactory<>("bowlingRuns"));
        colBowlWkts.setCellValueFactory(new PropertyValueFactory<>("bowlingWickets"));
        colFitness.setCellValueFactory(new PropertyValueFactory<>("fitness"));

    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoachDashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ExportButton(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Export Stats");
        alert.setHeaderText(null);
        alert.setContentText("Player stats exported successfully!");
        alert.showAndWait();
    }
}