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
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/EventC7.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void manageparticipantsbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/EventC4.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void viewfeedbackbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/EventC8.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void editeventbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/Editevent.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void postannoucementbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/EventC6.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void uploaddocumentsbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/EventC5.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void vieweventbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/Viewevent.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void logoutbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Login.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void createeventbuttton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/Createevent.fxml", actionEvent);
    }
}
