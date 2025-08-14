package com.example.group12_bksp.Mansura;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class EventC8 {

    @FXML
    private TableView<Feedback> feedbackTable;

    @FXML
    private TableColumn<Feedback, String> feedbackIdColumn;

    @FXML
    private TableColumn<Feedback, String> authorColumn;

    @FXML
    private TableColumn<Feedback, String> contentColumn;

    @FXML
    private TextField idField, authorField, contentField;

    @FXML
    private Label statusLabel;

    // Static list to persist data
    static ArrayList<Feedback> feedbackListStatic = new ArrayList<>();

    @FXML
    public void initialize() {
        feedbackIdColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));
        contentColumn.setCellValueFactory(new PropertyValueFactory<>("message"));

        // Load from static list
        feedbackTable.getItems().addAll(feedbackListStatic);

        statusLabel.setText("Total feedback: " + feedbackListStatic.size());
    }

    @FXML
    public void addFeedbackButton() {
        String id = idField.getText();
        String author = authorField.getText();
        String message = contentField.getText();

        if (id.isEmpty() || author.isEmpty() || message.isEmpty()) {
            statusLabel.setText("Fill all fields first!");
            return;
        }

        Feedback newFeedback = new Feedback(id, author, message);
        feedbackListStatic.add(newFeedback);
        feedbackTable.getItems().add(newFeedback);

        statusLabel.setText("Feedback added. Total: " + feedbackListStatic.size());

        idField.clear();
        authorField.clear();
        contentField.clear();
    }

    public static class Feedback {
        private String id;
        private String author;
        private String message;

        public Feedback(String id, String author, String message) {
            this.id = id;
            this.author = author;
            this.message = message;
        }

        public String getId() { return id; }
        public String getAuthor() { return author; }
        public String getMessage() { return message; }
    }
}

