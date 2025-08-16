package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import static javafx.collections.FXCollections.observableArrayList;


public class CricketCoach4
{
    @javafx.fxml.FXML
    private TableColumn<CricketCoachModelClass4, String> colDuration;
    @javafx.fxml.FXML
    private TextField drillNameField;
    @javafx.fxml.FXML
    private ComboBox<String> drillTypeComboBox;
    @javafx.fxml.FXML
    private TextField durationField;
    @javafx.fxml.FXML
    private TableColumn<CricketCoachModelClass4, String> colDrillName;
    @javafx.fxml.FXML
    private TableColumn<CricketCoachModelClass4, String> colDrillType;
    @javafx.fxml.FXML
    private TableView<CricketCoachModelClass4> drillTable;


    static ArrayList<CricketCoachModelClass4> CricketCoachModelClass4list= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        drillTypeComboBox.getItems().addAll("Batting", "Bowling", "Fielding");
    }

    @javafx.fxml.FXML
    public void AddDrillButton(ActionEvent actionEvent) {
//        String drillName = drillNameField.getText();
//        String duration = durationField.getText();
//
//        if (drillName.isEmpty() || durationField.isEmpty()) {
//            msglabel.setText("Please fill in all fields including date.");
//            return;
//        }
//
//        drillName.clear();
//        duration.setValue(null);

    }

    @javafx.fxml.FXML
    public void DeleteDrillButton(ActionEvent actionEvent) {
//CricketCoachModelClass4 selected = expenseTable.getSelectionModel().getSelectedItem();
//        if (selected != null) {
//            CricketCoachModelClass41list.remove(selected);
//            expenseTable.getItems().remove(selected);
//            msglabel.setText("Record deleted.");
//        } else {
//            msglabel.setText("Please select a row to delete.");
//        }
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoachDashboard.fxml", actionEvent);
    }
}
