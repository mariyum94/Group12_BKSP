package com.example.group12_bksp.Mansura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EventC5 {

    @FXML
    private ComboBox<String> eventComboBox;
    @FXML
    private TextField filePathField;
    @FXML
    private Label statuslabel;

    @FXML
    public void initialize() {
        // Example events
        eventComboBox.getItems().addAll("Event A", "Event B", "Event C");
    }

    @FXML
    public void handleBrowseButton(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Document");
        File file = fileChooser.showOpenDialog(new Stage());
        if (file != null) {
            filePathField.setText(file.getAbsolutePath());
            statuslabel.setText("File selected: " + file.getName());
        } else {
            statuslabel.setText("No file selected");
        }
    }

    @FXML
    public void handleUploadButton(ActionEvent actionEvent) {
        String filePath = filePathField.getText();
        String selectedEvent = eventComboBox.getValue();

        if (filePath.isEmpty() || selectedEvent == null) {
            statuslabel.setText("Please select an event and a file");
            return;
        }

        // Simulate file upload by writing path to a local file (example)
        try (FileWriter writer = new FileWriter("uploaded_files.txt", true)) {
            writer.write("Event: " + selectedEvent + ", File: " + filePath + "\n");
            statuslabel.setText("File uploaded successfully for " + selectedEvent);
        } catch (IOException e) {
            statuslabel.setText("Upload failed!");
        }
    }
}
