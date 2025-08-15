package com.example.group12_bksp.Mansura;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CTrainee6 {

    @FXML
    private RadioButton morningRadio, afternoonRadio, eveningRadio;

    @FXML
    private TextField coachTextField;

    @FXML
    private TextArea notesTextArea;

    @FXML
    private TableView<CTraineemodel6> sessionTable;

    @FXML
    private TableColumn<CTraineemodel6, String> dateColumn, timeColumn, coachColumn, notesColumn;

    private ObservableList<CTraineemodel6> sessionList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // TableView column bindings using SimpleStringProperty
        dateColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getDate().format(DateTimeFormatter.ISO_DATE))
        );
        timeColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getTime())
        );
        coachColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getCoach())
        );
        notesColumn.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getNotes())
        );

        sessionTable.setItems(sessionList);
    }

    @FXML
    private void handleRequestSession() {
        // Get selected time(s)
        StringBuilder selectedTime = new StringBuilder();
        if (morningRadio.isSelected()) selectedTime.append("Morning ");
        if (afternoonRadio.isSelected()) selectedTime.append("Afternoon ");
        if (eveningRadio.isSelected()) selectedTime.append("Evening ");
        String timeString = selectedTime.toString().trim();

        String coach = coachTextField.getText().trim();
        String notes = notesTextArea.getText().trim();
        LocalDate date = LocalDate.now();

        if (timeString.isEmpty() || coach.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Please select at least one time and enter coach name.", ButtonType.OK);
            alert.showAndWait();
            return;
        }

        sessionList.add(new CTraineemodel6(date, timeString, coach, notes));


        coachTextField.clear();
        notesTextArea.clear();
        morningRadio.setSelected(false);
        afternoonRadio.setSelected(false);
        eveningRadio.setSelected(false);
    }
}
