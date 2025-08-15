package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.example.group12_bksp.Mariyum.FinanceOfficer1.FinanceOfficerModelClass1list;

public class FinanceOfficer3 {
    @javafx.fxml.FXML
    private TextField categoryField;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass1, LocalDate> dateCol;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass1, Double> amountCol;
    @javafx.fxml.FXML
    private TextField AmountField;
    @javafx.fxml.FXML
    private DatePicker filterDatePicker;
    @javafx.fxml.FXML
    private TableColumn<FinanceOfficerModelClass1, String> categoryCol;
    @javafx.fxml.FXML
    private TableView<FinanceOfficerModelClass1> logTableview;
    @javafx.fxml.FXML
    private Label messageLabel;

    private static final String dataFileName = "FinanceOfficer3/Mariyum.bin";


    static List<FinanceOfficerModelClass1> getFinanceOfficerModelClass1List() {
        List<FinanceOfficerModelClass1> FinanceOfficerModelClass1List = new ArrayList<>();
        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream(dataFileName)
        )) {
            // read individual objects one by one
//            while (true) {
//                User u = (User) stream.readObject();
//                userList.add(u);
//            }

            // or read the whole ArrayList object
            FinanceOfficerModelClass1List = (ArrayList) stream.readObject();
            return FinanceOfficerModelClass1List;
//        } catch (EOFException e) { // if reading using an infinite loop
//            return userList;
        } catch (InvalidClassException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Invalid data");
        } catch (IOException e) {
            // handle exception
            e.printStackTrace();
            throw new RuntimeException("Error reading from file!");
        }}

    @FXML
    public void initialize() {
        amountCol.setCellValueFactory(new PropertyValueFactory<>("amount"));
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        logTableview.getItems().addAll(FinanceOfficerModelClass1list);
    }


    @javafx.fxml.FXML
    public void loaddataButton(ActionEvent actionEvent) {
//        try (BufferedReader reader = new BufferedReader(new FileReader("FinanceOfficer3/Mariyum.txt"))) {
//            while(true) {
//                String line = reader.readLine();
//                if (line == null) break;
//                textArea.appendText(line + "\n");
//            }
//        }
//        catch (IOException e) {
//            messageLabel.setText("Could not read from file!");
//        }          // this one is not working
        try {
            logTableview.getItems().addAll(FinanceOfficer1.getFinanceOfficerModelClass1List());
            messageLabel.setText("Data loaded from file successfully!");
        }
        catch (RuntimeException e) {
            messageLabel.setText(e.getMessage());
        }}

    @javafx.fxml.FXML
    public void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void filterButton(ActionEvent actionEvent) {
        double amount = Double.parseDouble(AmountField.getText());
        String category = categoryField.getText();
        LocalDate date = filterDatePicker.getValue();

        if (category.isEmpty() || date == null) {
            messageLabel.setText("Please enter category and select a date.");
            return;
        }

        FinanceOfficerModelClass1 newEntry = new FinanceOfficerModelClass1(category, amount, date );
        FinanceOfficerModelClass1list.add(newEntry);
        logTableview.getItems().add(newEntry);

        messageLabel.setText("New entry added.");
        AmountField.clear();
        categoryField.clear();
    }
}