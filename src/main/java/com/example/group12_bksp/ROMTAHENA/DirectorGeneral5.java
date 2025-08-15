package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DirectorGeneral5
{
    @javafx.fxml.FXML
    private TableColumn colContact;
    @javafx.fxml.FXML
    private TableColumn colName;
    @javafx.fxml.FXML
    private TextField coachNameField;
    @javafx.fxml.FXML
    private TextField experienceField;
    @javafx.fxml.FXML
    private TableView coachesTable;
    @javafx.fxml.FXML
    private TextField contactField;
    @javafx.fxml.FXML
    private TableColumn colSport;
    @javafx.fxml.FXML
    private ComboBox sportComboBox;
    @javafx.fxml.FXML
    private TableColumn colExperience;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RejectCoachButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void HireCoachButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGdashboard.fxml", actionEvent);
    }
}