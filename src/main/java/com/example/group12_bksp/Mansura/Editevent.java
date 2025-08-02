package com.example.group12_bksp.Mansura;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Editevent
{
    @javafx.fxml.FXML
    private TableColumn colEventname;
    @javafx.fxml.FXML
    private TextField eventnameTF;
    @javafx.fxml.FXML
    private TextField eventvenueTF;
    @javafx.fxml.FXML
    private TableColumn coleventtime;
    @javafx.fxml.FXML
    private TableColumn coleventvenue;
    @javafx.fxml.FXML
    private TableColumn colEventId;
    @javafx.fxml.FXML
    private TextField eventtimeTF;
    @javafx.fxml.FXML
    private TableColumn coleeventdate;
    @javafx.fxml.FXML
    private DatePicker eventdateDP;
    @javafx.fxml.FXML
    private TableView eventtable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void editonaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cancelonaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateonaction(ActionEvent actionEvent) {
    }
}