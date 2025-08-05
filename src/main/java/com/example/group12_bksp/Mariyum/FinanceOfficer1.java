package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class FinanceOfficer1
{
    @javafx.fxml.FXML
    private TextField budgetField;
    @javafx.fxml.FXML
    private TextField categoryField;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableView expenseTable;
    @javafx.fxml.FXML
    private TableColumn categoryCol;
    @javafx.fxml.FXML
    private Label msglabel;
    @javafx.fxml.FXML
    private TableColumn Budgetcol;
    @javafx.fxml.FXML
    private TextField amountField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void editExpenseButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deleteExpenseButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void addExpenseButton(ActionEvent actionEvent) {
    }
}