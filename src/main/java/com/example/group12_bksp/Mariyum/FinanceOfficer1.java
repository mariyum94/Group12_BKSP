package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class FinanceOfficer1
{
    @javafx.fxml.FXML
    private TextField budgetField;
    @javafx.fxml.FXML
    private TextField categoryField;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass1, Double> amountCol;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass1, LocalDate>dateCol;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableView<FinanceOfficerModelClass1> expenseTable;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass1,String> categoryCol;
    @javafx.fxml.FXML
    private Label msglabel;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass1, Integer> Budgetcol;
    @javafx.fxml.FXML
    private TextField amountField;

    static ArrayList<FinanceOfficerModelClass1> FinanceOfficerModelClass1list= new ArrayList<>();

    @FXML
    public void initialize() {
        Budgetcol.setCellValueFactory(new PropertyValueFactory<>("budget"));
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));

        expenseTable.getItems().addAll(FinanceOfficerModelClass1list);}


    @javafx.fxml.FXML
    public void editExpenseButton(ActionEvent actionEvent) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("FinanceOfficer1.bin"))) {
            outputStream.writeObject(FinanceOfficerModelClass1list);
            msglabel.setText("Saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
            msglabel.setText("Could not save data.");
        }
    }

    @javafx.fxml.FXML
    public void deleteExpenseButton(ActionEvent actionEvent) {
        FinanceOfficerModelClass1 selected = expenseTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            FinanceOfficerModelClass1list.remove(selected); //the work will be on here the column will delete
            expenseTable.getItems().remove(selected);
            msglabel.setText("Record deleted.");
        } else {
            msglabel.setText("Please select a row to delete.");
        }
    }

    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void addExpenseButton(ActionEvent actionEvent) {
        String amountText = amountField.getText();
        String category = categoryField.getText();
        String budgetText = budgetField.getText();
        LocalDate date = datePicker.getValue();

        if (amountText.isEmpty() || category.isEmpty() || budgetText.isEmpty() || date == null) {
            msglabel.setText("Please fill in all fields including date.");
            return;
        }
        int budget = Integer.parseInt(budgetText);
        double amount = Double.parseDouble(amountText);
        FinanceOfficerModelClass1 expense = new FinanceOfficerModelClass1(category, amount,budget, date);
        FinanceOfficerModelClass1list.add(expense);
        expenseTable.getItems().add(expense);
        msglabel.setText("Expense added.");

        amountField.clear();
        categoryField.clear();
        budgetField.clear();
        datePicker.setValue(null);
    }
}