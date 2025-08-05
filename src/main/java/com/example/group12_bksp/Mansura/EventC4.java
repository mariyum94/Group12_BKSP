package com.example.group12_bksp.Mansura;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class EventC4
{
    @javafx.fxml.FXML
    private TableView participantstable;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private TableColumn statusColumn;
    @javafx.fxml.FXML
    private TableColumn idColumn;
    @javafx.fxml.FXML
    private TableColumn emailColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backToDashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mansura/EventCdashbord.fxml", actionEvent);

    }

    @javafx.fxml.FXML
    public void removeParticipant(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveParticipant(ActionEvent actionEvent) {
    }
}