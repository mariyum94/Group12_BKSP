package com.example.group12_bksp.Mansura;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import java.io.IOException;

public class EventCdashboardController {

    @javafx.fxml.FXML
    public void initialize() {
        // Initialization logic if needed
    }

    @javafx.fxml.FXML
    public void schedulepracticebuttton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("schedulePractice.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void assignvolunteerbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("assignVolunteer.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void manageparticipantsbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("manageParticipants.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void viewfeedbackbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("viewFeedback.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void editeventbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("editEvent.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void postannoucementbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("postAnnouncement.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void uploaddocumentsbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("uploadDocuments.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void vieweventbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("viewEvent.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void logoutbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void createeventbuttton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("createEvent.fxml", actionEvent);
    }
}
