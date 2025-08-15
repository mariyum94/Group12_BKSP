package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class HRManager6 {

    @FXML
    private TextField NameTF;

    @FXML
    private TextField RoleTF;

    @FXML
    private TableColumn<HRManagerModelClass3, String> nameColumn;

    @FXML
    private TextField perfomanceTFTF;

    @FXML
    private TableView<HRManagerModelClass3> performanceTable;

    @FXML
    private TextArea remarksArea;

    @FXML
    private TableColumn<HRManagerModelClass3, String> roleColumn;

    @FXML
    private TableColumn<HRManagerModelClass3, String> scoreColumn;

    private static final String dataFileName = "HRManager6.bin";

    static ArrayList<HRManagerModelClass3> HRManagerModelClass3list = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<>("role"));
        scoreColumn.setCellValueFactory(new PropertyValueFactory<>("score"));
        performanceTable.getItems().addAll(HRManagerModelClass3list);
    }


    @FXML
    void evaluateButton(ActionEvent event) {
        String name = NameTF.getText();
        String role = RoleTF.getText();
        String perfomance = perfomanceTFTF.getText();

        if (name.isEmpty() || role.isEmpty() || perfomance.isEmpty()) {
            remarksArea.setText("Please fill all fields before evaluating.");
            return;
        }

        // Create a new evaluation record and add it
        HRManagerModelClass3 newRecord = new HRManagerModelClass3(name, role,perfomance);
        HRManagerModelClass3list.add(newRecord);

        // Update TableView
        performanceTable.getItems().clear();
        performanceTable.getItems().addAll(HRManagerModelClass3list);

        // Clear input fields
        NameTF.clear();
        RoleTF.clear();
        perfomanceTFTF.clear();

        remarksArea.setText("Evaluation added successfully.");
    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }

    @FXML
    void saveButton(ActionEvent event) {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream(dataFileName)
        )) {
            // write individual User objects
//            for (User u : userList) {
//                stream.writeObject(u);
//            }

            // or write the whole ArrayList object
            stream.writeObject(HRManagerModelClass3list);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not save data to file");
        }}

}