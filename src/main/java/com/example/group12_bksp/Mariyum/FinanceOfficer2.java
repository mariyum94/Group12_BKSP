package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class FinanceOfficer2
{
    @javafx.fxml.FXML
    private TableColumn salaryCol;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private TextField SalaryField;
    @javafx.fxml.FXML
    private Label reportLabel;
    @javafx.fxml.FXML
    private TableView salaryTable;
    @javafx.fxml.FXML
    private TextField employenameField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("FinanceOfficerDashboard.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void paySalaryButton(ActionEvent actionEvent) {
    }
}