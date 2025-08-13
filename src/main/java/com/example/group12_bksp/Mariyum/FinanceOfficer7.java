package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FinanceOfficer7
{
    @javafx.fxml.FXML
    private TextField SponsorNameField;
    @javafx.fxml.FXML
    private TableView<FinanceOfficerModelClass4> sponsorshipTable;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass4, String> nameColumn;
    @javafx.fxml.FXML
    private TableColumn <FinanceOfficerModelClass4, Double>amountColumn;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass4, String> purposeColumn;
    @javafx.fxml.FXML
    private TextField PurposeField;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField amountField;

    static ArrayList<FinanceOfficerModelClass4> FinanceOfficerModelClass4list= new ArrayList<>();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Allocated Budget"));
        purposeColumn.setCellValueFactory(new PropertyValueFactory<>("purpose"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        sponsorshipTable.getItems().addAll(FinanceOfficerModelClass4list);}


    @javafx.fxml.FXML
    public void editButton(ActionEvent actionEvent) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("FinanceOfficer7.bin"))) {
            outputStream.writeObject(FinanceOfficerModelClass4list);
            messageLabel.setText("Saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
            messageLabel.setText("Could not save data.");
        }}

    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void addButton(ActionEvent actionEvent) {
        String sponsorName = SponsorNameField.getText();
        String purpose = PurposeField.getText();
        String amountText = amountField.getText();

        if (sponsorName.isEmpty() || purpose.isEmpty() || amountText.isEmpty()) {
            messageLabel.setText("Please fill all fields.");
            return;
        }

        double amount = Double.parseDouble(amountText);

        FinanceOfficerModelClass4 sponsor = new FinanceOfficerModelClass4(sponsorName, purpose, amount);
        sponsorshipTable.getItems().add(sponsor);

        messageLabel.setText("Sponsorship added.");

        SponsorNameField.clear();
        PurposeField.clear();
        amountField.clear();
    }
        @javafx.fxml.FXML
    public void monitorButton(ActionEvent actionEvent) {
    }
}