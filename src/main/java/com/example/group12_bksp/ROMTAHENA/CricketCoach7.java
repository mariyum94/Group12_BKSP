package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class CricketCoach7
{
    @javafx.fxml.FXML
    private CheckBox presentCheckBox1;
    @javafx.fxml.FXML
    private TextArea remarksArea;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private Button updateAttendanceButton;
    @javafx.fxml.FXML
    private ComboBox playerComboBox;
    @javafx.fxml.FXML
    private TableColumn colDate;
    @javafx.fxml.FXML
    private TableColumn colRemarks;
    @javafx.fxml.FXML
    private TableColumn colPlayer;
    @javafx.fxml.FXML
    private TableView attendanceTable;
    @javafx.fxml.FXML
    private CheckBox presentCheckBox;
    @javafx.fxml.FXML
    private TableColumn colStatus;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void SaveAttendanceButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void UpdateButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoachDashboard.fxml", actionEvent);
    }
}