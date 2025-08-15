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

public class FinanceOfficer5
{
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass3,Double> costColumn;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass3,String> statusColumn;
    @javafx.fxml.FXML
    private TextField CostField;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass3,String> itemColumn;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass3,Integer> QuantityColumn;
    @javafx.fxml.FXML
    private TableView<FinanceOfficerModelClass3> equipmentTable;
    @javafx.fxml.FXML
    private TextField itemField;
    @javafx.fxml.FXML
    private TextField quantityField;
    @javafx.fxml.FXML
    private Label messageLabel;

    static ArrayList<FinanceOfficerModelClass3> FinanceOfficerModelClass3list= new ArrayList<>();
    @FXML
    public void initialize() {
        itemColumn.setCellValueFactory(new PropertyValueFactory<>("item"));
        costColumn.setCellValueFactory(new PropertyValueFactory<>("cost"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        QuantityColumn.setCellValueFactory(new PropertyValueFactory<>("Quantity"));

        equipmentTable.getItems().addAll(FinanceOfficerModelClass3list);}


    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void manageButton(ActionEvent actionEvent) {
        String item = itemField.getText();
        String costText = CostField.getText();
        String quantityText = quantityField.getText();

        if (item.isEmpty() || costText.isEmpty() || quantityText.isEmpty()) {
            messageLabel.setText("Please enter item, cost, and quantity.");
            return;
        }

        double cost = Double.parseDouble(costText);
        int quantity = Integer.parseInt(quantityText);

        FinanceOfficerModelClass3 newEntry = new FinanceOfficerModelClass3(item, cost, quantity, "Pending");
        FinanceOfficerModelClass3list.add(newEntry);
        equipmentTable.getItems().add(newEntry);

        messageLabel.setText("New entry added.");

        itemField.clear();
        CostField.clear();
        quantityField.clear();
    }


    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
        //same as approve
        FinanceOfficerModelClass3 selectedItem = equipmentTable.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            selectedItem.setStatus("Rejected");
            equipmentTable.refresh();}
    }

    @javafx.fxml.FXML
    public void approveButton(ActionEvent actionEvent) {
        FinanceOfficerModelClass3 selectedItem = equipmentTable.getSelectionModel().getSelectedItem();

        if (selectedItem != null) {
            selectedItem.setStatus("Approved");
            // this one Update the table also refresh it
            equipmentTable.refresh();
        }}
}