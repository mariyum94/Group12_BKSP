package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

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

    static ArrayList<CricketCoachModelClass3> CricketCoachModelClass3list= new ArrayList<>();
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        playerComboBox.getItems().addAll("Player A", "Player B", "Player C");

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
        String player = playerComboBox.getValue();

        if (player == null) {
            messageLabel.setText("Please select a report type..");
        } else {
            messageLabel.setText("Unknown report type selected " );
        }

    }
}
