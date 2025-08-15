package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class DirectorGeneral3
{
    @javafx.fxml.FXML
    private TableColumn colAmount;
    @javafx.fxml.FXML
    private TextField budgetAmountField;
    @javafx.fxml.FXML
    private DatePicker dateAssignedPicker;
    @javafx.fxml.FXML
    private TableColumn colDate;
    @javafx.fxml.FXML
    private ComboBox departmentComboBox;
    @javafx.fxml.FXML
    private TableView budgetTable;
    @javafx.fxml.FXML
    private TableColumn colDepartment;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void AllocateBudgetButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UpdateBudgetButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGdashboard.fxml", actionEvent);
    }
}