package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FinanceOfficer7
{
    @javafx.fxml.FXML
    private TextField SponsorNameField;
    @javafx.fxml.FXML
    private TableView sponsorshipTable;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private TableColumn amountColumn;
    @javafx.fxml.FXML
    private TableColumn purposeColumn;
    @javafx.fxml.FXML
    private TextField PurposeField;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField amountField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void editButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void monitorButton(ActionEvent actionEvent) {
    }
}