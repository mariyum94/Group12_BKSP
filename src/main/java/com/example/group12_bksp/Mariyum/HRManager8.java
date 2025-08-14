package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class HRManager8 {

    @FXML
    private TableView<HRManagerModelClass5> healthTable;

    @FXML
    private TableColumn<HRManagerModelClass5, String> injuryCol;

    @FXML
    private TextField injuryField;

    @FXML
    private TableColumn<HRManagerModelClass5, String> nameCol;

    @FXML
    private TextField nameField;

    @FXML
    private TextField textarea;

    @FXML
    private TableColumn<HRManagerModelClass5, Double> weightCol;

    @FXML
    private TextField weightField;

    static ArrayList<HRManagerModelClass5> HRManagerModelClass5list= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("Name"));
        injuryCol.setCellValueFactory(new PropertyValueFactory<>("injury"));
        weightCol.setCellValueFactory(new PropertyValueFactory<>("weight"));

        healthTable.getItems().addAll(HRManagerModelClass5list);}

    @FXML
    void addRecordButton(ActionEvent event) {
        String name = nameField.getText().trim();
        String injury = injuryField.getText().trim();
        String weightText = weightField.getText().trim();

        if (name.isEmpty() || injury.isEmpty() || weightText.isEmpty()) {
            return;
        }

        double weight = Double.parseDouble(weightText);//weightField.getText().trim().
        HRManagerModelClass5 record = new HRManagerModelClass5(name, weight, injury);
        HRManagerModelClass5list.add(record);
        healthTable.getItems().add(record);

        nameField.clear();
        weightField.clear();
        injuryField.clear();
    }


    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }

}
