package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CricketCoach1
{
    @javafx.fxml.FXML
    private TextField ageField;
    @javafx.fxml.FXML
    private TextField roleField;
    @javafx.fxml.FXML
    private TextField nameField;

    @javafx.fxml.FXML
    public void initialize() {
        nameField.clear();
        ageField.clear();
        roleField.clear();

        nameField.setPromptText("Enter player name");
        ageField.setPromptText("Enter age");
        roleField.setPromptText("Enter role (e.g., Batsman, Bowler)");
    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {

        String name = nameField.getText();
        String age = ageField.getText();
        String role = roleField.getText();

        if (name.isEmpty() || age.isEmpty() || role.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "All fields must be filled!");
            return;
        }

        // Validate age is numeric
        try {
            Integer.parseInt(age);
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Invalid Input", "Age must be a number.");
            return;
        }

        // Success
        showAlert(Alert.AlertType.INFORMATION, "Success",
                "Player Added Successfully!\n\nName: " + name +
                        "\nAge: " + age +
                        "\nRole: " + role);

        initialize();
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml", actionEvent);
    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}