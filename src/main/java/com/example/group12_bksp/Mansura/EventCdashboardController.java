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
    public void assignvolunteerbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("assignVolunteer.fxml", actionEvent);
    }//EventC7

    @javafx.fxml.FXML
    public void manageparticipantsbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("manageParticipants.fxml", actionEvent);
    }//EventC4

    @javafx.fxml.FXML
    public void viewfeedbackbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("viewFeedback.fxml", actionEvent);
    }//EventC8

    @javafx.fxml.FXML
    public void editeventbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("editEvent.fxml", actionEvent);
    }//Editevent

    @javafx.fxml.FXML
    public void postannoucementbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("postAnnouncement.fxml", actionEvent);
    }//EventC6

    @javafx.fxml.FXML
    public void uploaddocumentsbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("uploadDocuments.fxml", actionEvent);
    }//EventC5

    @javafx.fxml.FXML
    public void vieweventbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("viewEvent.fxml", actionEvent);
    }//Viewevent

    @javafx.fxml.FXML
    public void logoutbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login.fxml", actionEvent);
    }//

    @javafx.fxml.FXML
    public void createeventbuttton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("createEvent.fxml", actionEvent);
    }//Createevent
}
