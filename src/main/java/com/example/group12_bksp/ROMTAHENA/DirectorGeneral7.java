package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class DirectorGeneral7
{
    @javafx.fxml.FXML
    private TableView performanceTable;
    @javafx.fxml.FXML
    private TableColumn colMetric;
    @javafx.fxml.FXML
    private TextArea remarksArea;
    @javafx.fxml.FXML
    private DatePicker evaluationDatePicker;
    @javafx.fxml.FXML
    private TableColumn colDate;
    @javafx.fxml.FXML
    private TableColumn colRemarks;
    @javafx.fxml.FXML
    private TableColumn colValue;
    @javafx.fxml.FXML
    private ComboBox departmentComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void UpdateEvaluationButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AddEvaluationButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGdashboard.fxml", actionEvent);
    }
}