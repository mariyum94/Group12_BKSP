package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;

import java.io.IOException;

public class FinanceOfficer4
{
    @javafx.fxml.FXML
    private ComboBox filterComboBox;
    @javafx.fxml.FXML
    private BarChart financeBarChart;
    @javafx.fxml.FXML
    private PieChart financePieChart;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);

    }
}