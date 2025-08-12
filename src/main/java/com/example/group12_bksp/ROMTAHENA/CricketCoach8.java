package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class CricketCoach8
{
    @javafx.fxml.FXML
    private ComboBox sessionComboBox;
    @javafx.fxml.FXML
    private TableColumn colTrainee;
    @javafx.fxml.FXML
    private TableColumn colRating;
    @javafx.fxml.FXML
    private Button returnHomeButton;
    @javafx.fxml.FXML
    private Button updateButton;
    @javafx.fxml.FXML
    private TextArea feedbackArea;
    @javafx.fxml.FXML
    private TableColumn colSession;
    @javafx.fxml.FXML
    private ComboBox ratingComboBox;
    @javafx.fxml.FXML
    private TableColumn colFeedback;
    @javafx.fxml.FXML
    private ComboBox traineeComboBox;
    @javafx.fxml.FXML
    private TableView feedbackTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void UpdateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoachDashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void SubmitButton(ActionEvent actionEvent) {
    }
}