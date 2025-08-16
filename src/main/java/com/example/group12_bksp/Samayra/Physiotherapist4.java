package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class Physiotherapist4
{
    @javafx.fxml.FXML
    private TextField setsTF;
    @javafx.fxml.FXML
    private TextField durationTF;
    @javafx.fxml.FXML
    private TextField repsTF;
    @javafx.fxml.FXML
    private ComboBox<String> comboBoxPhy4;
    @javafx.fxml.FXML
    private Label outputLabelPhy4;
    @javafx.fxml.FXML
    private TextField exerciseTF;
    @javafx.fxml.FXML
    private TableView exerciseTV;

    static ArrayList<PhysiotherapistModelClass1> PhysiotherapistModelClassList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn setsCol;
    @javafx.fxml.FXML
    private TableColumn repsCol;
    @javafx.fxml.FXML
    private TableColumn durationCol;
    @javafx.fxml.FXML
    private TableColumn exerciseCol;
    @javafx.fxml.FXML
    private Button ReturnHomeOnAction;

    @javafx.fxml.FXML
    public void initialize() {
        comboBoxPhy4.getItems().addAll("Karim", "Arik", "Isha");
        exerciseCol.setCellValueFactory(new PropertyValueFactory<>("exercise"));
        repsCol.setCellValueFactory(new PropertyValueFactory<>("repetition"));
        setsCol.setCellValueFactory(new PropertyValueFactory<>("sets"));
        durationCol.setCellValueFactory(new PropertyValueFactory<>("duration"));

        exerciseTV.getItems().addAll(PhysiotherapistModelClassList);


    }

    @javafx.fxml.FXML
    public void assignexerciseButton(ActionEvent actionEvent) {
        String chooseAthlete= comboBoxPhy4.getValue();
        String exercise = exerciseTF.getText();
        String rep = repsTF.getText();
        String sets = setsTF.getText();
        String duration= durationTF.getText();

        if (exercise.isEmpty() || rep.isEmpty() || sets.isEmpty() || duration.isEmpty() || chooseAthlete==null) {
            outputLabelPhy4.setText("Please enter all the information");
            return;
        }
        PhysiotherapistModelClass1 newEntry = new PhysiotherapistModelClass1(chooseAthlete, exercise, rep, "Exercise notes");
        PhysiotherapistModelClassList.add(newEntry);
        exerciseTV.getItems().add(newEntry);

        outputLabelPhy4.setText("Assigned Routine successfully to the user");

        exerciseTF.clear();
        repsTF.clear();
        setsTF.clear();
        durationTF.clear();
        comboBoxPhy4.getSelectionModel().clearSelection();

    }

    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/PhysiotherapistDashboard.fxml", actionEvent);

    }
}