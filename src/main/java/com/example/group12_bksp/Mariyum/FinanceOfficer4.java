package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FinanceOfficer4 {

    @FXML
    private ComboBox<String> filterComboBox;

    @FXML
    private BarChart<String, Number> financeBarChart;

    @FXML
    private PieChart financePieChart;


    @FXML
    public void initialize() {
        filterComboBox.getItems().addAll("January", "February", "March", // Months
                "Utilities", "Salaries", "Maintenance", "Revenue" // Categories
        );

    }
    @FXML
    void generateButton(ActionEvent event) {
        String selected = filterComboBox.getValue();
        System.out.println("Generating report for: " + selected);
    }

    @FXML
    void loadButton(ActionEvent  actionEvent) {

        List<PieChart.Data> data = new ArrayList<>();
        data.add(new PieChart.Data("A", 3));
        data.add(new PieChart.Data("B", 5));
        data.add(new PieChart.Data("C", 9));
        data.add(new PieChart.Data("D", 1));
        data.add(new PieChart.Data("E", 2));

        financePieChart.getData().addAll(data);
        

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Section 1");
        series1.getData().add(new XYChart.Data<>("A", 3));
        series1.getData().add(new XYChart.Data<>("B", 5));
        series1.getData().add(new XYChart.Data<>("C", 9));
        series1.getData().add(new XYChart.Data<>("D", 1));
        series1.getData().add(new XYChart.Data<>("F", 2));

        financeBarChart.getData().add(series1);

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Section 2");
        series2.getData().add(new XYChart.Data<>("A", 4));
        series2.getData().add(new XYChart.Data<>("B", 6));
        series2.getData().add(new XYChart.Data<>("C", 4));
        series2.getData().add(new XYChart.Data<>("D", 2));
        series2.getData().add(new XYChart.Data<>("F", 3));

        financeBarChart.getData().add(series2);
    }


    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);

    }
}