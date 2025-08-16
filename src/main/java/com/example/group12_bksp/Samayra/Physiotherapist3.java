package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.Mariyum.FinanceOfficerModelClass3;
import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class Physiotherapist3
{
    @javafx.fxml.FXML
    private TextField RecoveryTextField;
    @javafx.fxml.FXML
    private TableColumn<PhysiotherapistModelClass1, String> prevInjuryCol;
    @javafx.fxml.FXML
    private TableColumn<PhysiotherapistModelClass1, String> notesCol;
    @javafx.fxml.FXML
    private TableColumn<PhysiotherapistModelClass1, String>newRecoveryCol;
    @javafx.fxml.FXML
    private TableView<PhysiotherapistModelClass1> recoveryTableView3;
    @javafx.fxml.FXML
    private TextArea recoveryTextArea;
    @javafx.fxml.FXML
    private TextField prevInjuryTF;
    @javafx.fxml.FXML
    private Label outputLabelPhy3;
    @javafx.fxml.FXML
    private ComboBox<String> athleteComboBox3;

    static ArrayList<PhysiotherapistModelClass1> PhysiotherapistModelClassList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        athleteComboBox3.getItems().addAll("Karim", "Arik", "Isha");
        newRecoveryCol.setCellValueFactory(new PropertyValueFactory<>("newScore"));
        prevInjuryCol.setCellValueFactory(new PropertyValueFactory<>("previousInjury"));
        notesCol.setCellValueFactory(new PropertyValueFactory<>("notes"));

        recoveryTableView3.getItems().addAll(PhysiotherapistModelClassList);

    }

    @javafx.fxml.FXML
    public void recoveryUpdateButton(ActionEvent actionEvent) {
        String athlete3= athleteComboBox3.getValue();
        String prevInjury = prevInjuryTF.getText();
        String score3 = RecoveryTextField.getText();
        String notes3 = recoveryTextArea.getText();

        if (athlete3.isEmpty() || prevInjury.isEmpty() || notes3.isEmpty() || athlete3==null) {
            outputLabelPhy3.setText("Please enter all the information");
            return;
        }

        double Score3 = Double.parseDouble(score3);


        PhysiotherapistModelClass1 newEntry = new PhysiotherapistModelClass1(athlete3, prevInjury, score3, "Recovering");
        PhysiotherapistModelClassList.add(newEntry);
        recoveryTableView3.getItems().add(newEntry);

        outputLabelPhy3.setText("Monitoring One Athlete is Done");

        RecoveryTextField.clear();
        recoveryTextArea.clear();
        prevInjuryTF.clear();
        athleteComboBox3.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/PhysiotherapistDashboard.fxml", actionEvent);
    }
}