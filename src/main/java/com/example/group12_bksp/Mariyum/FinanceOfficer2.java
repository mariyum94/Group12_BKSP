package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class FinanceOfficer2
{
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass2, Double > salaryCol;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass2, String > nameCol;
    @javafx.fxml.FXML
    private TextField SalaryField;
    @javafx.fxml.FXML
    private Label reportLabel;
    @javafx.fxml.FXML
    private TableView<FinanceOfficerModelClass2>salaryTable;
    @javafx.fxml.FXML
    private TextField employenameField;

    static ArrayList<FinanceOfficerModelClass2> FinanceOfficerModelClass2list= new ArrayList<>();

    @FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));

        salaryTable.getItems().addAll(FinanceOfficerModelClass2list);}

    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void paySalaryButton(ActionEvent actionEvent) {
        String name = employenameField.getText();
        String salaryText = SalaryField.getText();

        if (name.isEmpty() || salaryText.isEmpty()) {
            reportLabel.setText("Please enter name and salary.");
            return;
        }

        double salary = Double.parseDouble(salaryText);
        FinanceOfficerModelClass2 entry = new FinanceOfficerModelClass2(name, salary);
        FinanceOfficerModelClass2list.add(entry);
        salaryTable.getItems().add(entry);

        reportLabel.setText("Paid salary to " + name);
        employenameField.clear();
        SalaryField.clear();

    }
}