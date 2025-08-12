package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class FinanceOfficer6
{
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass4 ,Integer> budgetColumn;
    @javafx.fxml.FXML
    private TextField DepartmentField;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass4,String> departmentColumn;
    @javafx.fxml.FXML
    private TextField BudgetField;
    @javafx.fxml.FXML
    private Label msglabel;
    @javafx.fxml.FXML
    private TableView<FinanceOfficerModelClass4> budgetTable;

    static ArrayList<FinanceOfficerModelClass4> FinanceOfficerModelClass4list= new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        budgetColumn.setCellValueFactory(new PropertyValueFactory<>("Allocated Budget"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        budgetTable.getItems().addAll(FinanceOfficerModelClass4list);
    }

    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {
//        if (selectedStudent == null) return;
//
//        String newGrade = gradeBox1.getValue();
//        selectedStudent.setGrade(newGrade);
//        tableView.refresh();
//
//        nameLabel.setText("");
//        gradeBox1.setValue(null);
//        selectedStudent = null;
//
//        updateButton.setDisable(true);
//        editButton.setDisable(false);

    }

    @javafx.fxml.FXML
    public void allocateButton(ActionEvent actionEvent) {
    }
}