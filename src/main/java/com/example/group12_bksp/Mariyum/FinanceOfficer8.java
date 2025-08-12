package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class FinanceOfficer8
{
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass4, Integer>budgetedAmountColumn;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass4, Double> actualAmountColumn;
    @javafx.fxml.FXML
    private TableColumn <FinanceOfficerModelClass4, String>itemColumn;
    @javafx.fxml.FXML
    private TextField itemTF;
    @javafx.fxml.FXML
    private TextArea resultArea;
    @javafx.fxml.FXML
    private TextField overbudgetTF;
    @javafx.fxml.FXML
    private TextField amountTF;
    @javafx.fxml.FXML
    private TableView<FinanceOfficerModelClass4> auditTable;

    static ArrayList<FinanceOfficerModelClass4> FinanceOfficerModelClass4list= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        budgetedAmountColumn.setCellValueFactory(new PropertyValueFactory<>(" budgetedAmount"));
        itemColumn.setCellValueFactory(new PropertyValueFactory<>("item"));
        auditTable.getItems().addAll(FinanceOfficerModelClass4list);}


    @javafx.fxml.FXML
    public void runauditButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);

    }
}