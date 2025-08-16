package com.example.group12_bksp.Samayra;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private ComboBox comboBoxPhy4;
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
    }
}