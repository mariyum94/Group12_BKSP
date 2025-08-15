package com.example.group12_bksp.Mansura;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.FileWriter;
import java.io.IOException;

public class EventC6 {

    @FXML
    private TextArea announcementTextArea;

    @FXML
    private Label statuslabel;

    @FXML
    public void initialize() {
        // Optional: clear fields on load
        announcementTextArea.clear();
        statuslabel.setText("");
    }

    @FXML
    public void handlePostButton(ActionEvent actionEvent) {
        String message = announcementTextArea.getText().trim();

        if (message.isEmpty()) {
            statuslabel.setText("Announcement message is empty!");
            return;
        }

        // Example: write announcement to a local file
        try (FileWriter writer = new FileWriter("announcements.txt", true)) {
            writer.write(message + "\n");
            statuslabel.setText("Announcement posted successfully!");
            announcementTextArea.clear();
        } catch (IOException e) {
            statuslabel.setText("Failed to post announcement!");
        }
    }
}
