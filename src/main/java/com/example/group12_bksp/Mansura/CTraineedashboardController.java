package com.example.group12_bksp.Mansura;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import java.io.IOException;

public class CTraineedashboardController {



    @javafx.fxml.FXML
    public void viewmonthlyattendancebutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/CTrainee3.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void requestcoachingsessionbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/CTrainee5.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void downloadcertificatebutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/CTrainee6.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void checkteamassignmentbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/CTrainee7.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void viewtrainingschedulebutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/CTrainee1.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void viewcoachfeedbackbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/CTrainee4.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void viewmatchresultsbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/CTrainee8.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void logoutbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Login.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void registerbutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/CTrainee2.fxml", actionEvent);
    }
}
