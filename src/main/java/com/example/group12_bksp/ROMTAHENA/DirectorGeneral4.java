package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class DirectorGeneral4
{
    @javafx.fxml.FXML
    private TableView reportTable;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private TableColumn colPerformance;
    @javafx.fxml.FXML
    private ComboBox athleteComboBox;
    @javafx.fxml.FXML
    private DatePicker toDatePicker;
    @javafx.fxml.FXML
    private TableColumn colDate;
    @javafx.fxml.FXML
    private TableColumn colRemarks;
    @javafx.fxml.FXML
    private TableColumn colEvent;
    @javafx.fxml.FXML
    private ComboBox sportComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ExportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGdashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void GenerateReportButton(ActionEvent actionEvent) {
    }
}