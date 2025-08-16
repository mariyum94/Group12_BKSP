package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

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


    private ObservableList<CricketCoachModelClass4> drillList;

    @javafx.fxml.FXML
    public void initialize() {
        drillTypeComboBox.getItems().addAll("Batting", "Bowling", "Fielding");
        drillTypeComboBox.setPromptText("Select Drill Type");

        drillList = observableArrayList();
        drillTable.setItems(drillList);
    }

    @javafx.fxml.FXML
    public void AddDrillButton(ActionEvent actionEvent) {
        String name = drillNameField.getText();
        String type = drillTypeComboBox.getValue();
        String duration = durationField.getText();

        if (name.isEmpty() || type == null || duration.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Please fill all fields!");
            alert.show();
            return;
        }

        drillList.add(new CricketCoachModelClass4(name, type, duration));

        drillNameField.clear();
        drillTypeComboBox.setValue(null);
        durationField.clear();
    }

    @javafx.fxml.FXML
    public void DeleteDrillButton(ActionEvent actionEvent) {
        CricketCoachModelClass4 selected = drillTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            drillList.remove(selected);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Select a drill to delete!");
            alert.show();
        }
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoachDashboard.fxml", actionEvent);
    }
}