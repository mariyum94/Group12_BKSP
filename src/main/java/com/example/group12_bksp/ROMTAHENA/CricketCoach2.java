package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class CricketCoach2
{
    @javafx.fxml.FXML
    private TextField activityField;
    @javafx.fxml.FXML
    private DatePicker datePicker;

    @javafx.fxml.FXML
    public void initialize() {
        activityField.clear();
        datePicker.setValue(null);

        activityField.setPromptText("Enter training activity");
        datePicker.setPromptText("Select training date");
    }

    @javafx.fxml.FXML
    public void SaveButton(ActionEvent actionEvent) {
        String activity = activityField.getText();
        LocalDate date = datePicker.getValue();

        if (activity.isEmpty() || date == null) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Please enter both activity and date.");
            return;
        }

        showAlert(Alert.AlertType.INFORMATION, "Saved",
                "Training session saved!\n\nActivity: " + activity + "\nDate: " + date);

        initialize();
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/CricketCoachDashboard.fxml", actionEvent);
    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}