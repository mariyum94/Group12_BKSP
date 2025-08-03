package com.example.group12_bksp.Mariyum;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinanceOfficer3
{
    @javafx.fxml.FXML
    private TextField categoryField;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TableColumn amountCol;
    @javafx.fxml.FXML
    private TextField AmountField;
    @javafx.fxml.FXML
    private DatePicker filterDatePicker;
    @javafx.fxml.FXML
    private TableColumn categoryCol;
    @javafx.fxml.FXML
    private TableView logTableview;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextArea textArea;
    public static final String filename = "FinanceOfficer3.txt";

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loaddataButton(ActionEvent actionEvent) {
        try (BufferedReader reader = new BufferedReader(new FileReader("FinanceOfficer3.txt"))) {
            while(true) {
                String line = reader.readLine();
                if (line == null) break;
                textArea.appendText(line + "\n");
            }
        }
        catch (IOException e) {
            messageLabel.setText("Could not read from file!");
        }

    }

    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void filterButton(ActionEvent actionEvent) {
    }
}