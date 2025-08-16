package com.example.group12_bksp.Mansura;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class CTrainee6Controller {

    @FXML
    private TableView<CTraineemodel6> certificateTable;

    @FXML
    private TableColumn<CTraineemodel6, LocalDate> dateColumn;

    @FXML
    private TableColumn<CTraineemodel6, String> coachColumn;

    @FXML
    private TableColumn<CTraineemodel6, String> notesColumn;

    @FXML
    private TableColumn<CTraineemodel6, Button> downloadColumn;

    @FXML
    private Label messageLabel;

    static ArrayList<CTraineemodel6> certificateList = new ArrayList<>();

    @FXML
    public void initialize() {
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        coachColumn.setCellValueFactory(new PropertyValueFactory<>("coach"));
        notesColumn.setCellValueFactory(new PropertyValueFactory<>("notes"));
        downloadColumn.setCellValueFactory(new PropertyValueFactory<>("downloadButton"));

        // Example data
        CTraineemodel6 cert1 = new CTraineemodel6(LocalDate.of(2025,8,15), "10:00 AM", "Coach A", "Java Basics");
        CTraineemodel6 cert2 = new CTraineemodel6(LocalDate.of(2025,8,20), "11:00 AM", "Coach B", "Cricket Coaching");

        // Set download button actions
        cert1.getDownloadButton().setOnAction(e -> downloadCertificate(cert1));
        cert2.getDownloadButton().setOnAction(e -> downloadCertificate(cert2));

        certificateList.add(cert1);
        certificateList.add(cert2);

        certificateTable.getItems().addAll(certificateList);
    }

    @FXML
    void downloadCertificate(CTraineemodel6 cert) {
        messageLabel.setText("Downloaded: " + cert.getNotes());

    }

    @FXML
    void returnToDashboard(ActionEvent event) {
        try {
            SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/CTraineeDashboard.fxml", event);
        } catch (IOException e) {
            messageLabel.setText("Could not open dashboard!");
            e.printStackTrace();
        }
    }
}

