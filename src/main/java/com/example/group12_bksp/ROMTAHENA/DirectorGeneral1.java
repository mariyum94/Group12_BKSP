package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class DirectorGeneral1
{
    @javafx.fxml.FXML
    private TableColumn colMetric;
    @javafx.fxml.FXML
    private ComboBox athleteComboBox;
    @javafx.fxml.FXML
    private TableView progressTable;
    @javafx.fxml.FXML
    private TableColumn colDate;
    @javafx.fxml.FXML
    private TableColumn colRemarks;
    @javafx.fxml.FXML
    private ComboBox sportComboBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGdashboard.fxml", actionEvent);
    }
}