package com.example.group12_bksp.Samayra;

import com.example.group12_bksp.Mansura.EventCmodel1;
import com.example.group12_bksp.Mariyum.FinanceOfficerModelClass1;
import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Physiotherapist1
{
    @javafx.fxml.FXML
    private TextField injuryTypeTextField;
    @javafx.fxml.FXML
    private TextField injurySeverityTextField;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TableView<PhysiotherapistModelClass1> listviewPhysio1;
    @javafx.fxml.FXML
    private TextField injuryformTextArea;
    @javafx.fxml.FXML
    private TableColumn<PhysiotherapistModelClass1, String> nameCol1;
    @javafx.fxml.FXML
    private TableColumn<PhysiotherapistModelClass1, String> injuryCol1;
    @javafx.fxml.FXML
    private TableColumn<PhysiotherapistModelClass1, String> remarksCol1;
    @javafx.fxml.FXML
    private TableColumn<PhysiotherapistModelClass1, String> severityCol1;

    static ArrayList<PhysiotherapistModelClass1> PhysiotherapistModelClassList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        nameCol1.setCellValueFactory(new PropertyValueFactory<>("name"));
        injuryCol1.setCellValueFactory(new PropertyValueFactory<>("injuryType"));
        severityCol1.setCellValueFactory(new PropertyValueFactory<>("severity"));
        remarksCol1.setCellValueFactory(new PropertyValueFactory<>("remarks"));

        PhysiotherapistModelClassList.add(new PhysiotherapistModelClass1("name A", "leg cramps","moderate","Bed rest for a week"));
        PhysiotherapistModelClassList.add(new PhysiotherapistModelClass1("name B","Shoulder Dislocate", "attention needed","Take medicines and checkup tomorrow"));

        listviewPhysio1.getItems().setAll(PhysiotherapistModelClassList);


    }


    @javafx.fxml.FXML
    public void ReturnHomeOnAction(ActionEvent actionEvent)throws IOException{
        SceneSwitcher.switchTo("/com/example/group12_bksp/Samayra/PhysiotherapistDashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void SubmitInjuryButton(ActionEvent actionEvent) {
        String name = nameTF.getText();
        String injuryType = injuryTypeTextField.getText();
        String severity = injurySeverityTextField.getText();
        String remarks = injuryformTextArea.getText();

        if (name.isEmpty() || injuryType.isEmpty() || severity.isEmpty() || remarks.isEmpty()) {
            OutputLabel.setText("Please fill in all fields before submitting.");
            return;
        }
        OutputLabel.setText("Assessment Submitted Successfully");
    }

    @javafx.fxml.FXML
    public void EditinjuryButton(ActionEvent actionEvent) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Physiotherapist1.bin"))) {
            outputStream.writeObject(PhysiotherapistModelClassList);
            OutputLabel.setText("Data saved");
        } catch (IOException e) {
            e.printStackTrace();
            OutputLabel.setText("Data Edited");
            OutputLabel.setText("Data Saving not successful");
        }
        }
    }
