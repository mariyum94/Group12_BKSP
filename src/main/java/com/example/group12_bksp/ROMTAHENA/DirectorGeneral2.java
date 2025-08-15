package com.example.group12_bksp.ROMTAHENA;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class DirectorGeneral2
{
    @javafx.fxml.FXML
    private TextArea remarksArea;
    @javafx.fxml.FXML
    private Button returnHomeButton;
    @javafx.fxml.FXML
    private ListView pendingRequestsList;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void RejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnHomeButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/ROMTAHENA/DirectorGdashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void ApproveButton(ActionEvent actionEvent) {
    }
}