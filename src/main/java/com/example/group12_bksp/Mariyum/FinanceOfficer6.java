package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FinanceOfficer6
{
    @javafx.fxml.FXML
    private TableColumn budgetColumn;
    @javafx.fxml.FXML
    private TextField DepartmentField;
    @javafx.fxml.FXML
    private TableColumn departmentColumn;
    @javafx.fxml.FXML
    private TextField BudgetField;
    @javafx.fxml.FXML
    private Label msglabel;
    @javafx.fxml.FXML
    private TableView budgetTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void allocateButton(ActionEvent actionEvent) {
    }
}