package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class HRManager1 {

    @FXML
    private TextField ContactTF;

    @FXML
    private TextField NameTF;

    @FXML
    private TextField RoleTF;

    @FXML
    private TableView<HRManagerModelClass1> StaffRecordsTV;

    @FXML
    private TableColumn<HRManagerModelClass1, String> colContact;

    @FXML
    private TableColumn<HRManagerModelClass1, String> colName;

    @FXML
    private TableColumn<HRManagerModelClass1, String> colRole;

    @FXML
    private Label messageLabel;

    static ArrayList<HRManagerModelClass1> HRManagerModelClass1list= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        colRole.setCellValueFactory(new PropertyValueFactory<>("Role"));
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("Contact"));

        StaffRecordsTV.getItems().addAll(HRManagerModelClass1list);}


    @FXML
    void addButton(ActionEvent event) {
        String name = NameTF.getText();
        String role = RoleTF.getText();
        String contact = ContactTF.getText();

        if (name.isBlank() || role.isBlank() || contact.isBlank()) {
            messageLabel.setText("Please provide all inputs");
            return;
        }
//        if (password.length() < 8) {
//            messageLabel.setText("Password must be at least 8 characters long!");
//            return;
//        }

        for (HRManagerModelClass1 u : HRManagerModelClass1list) {
            if (u.getName().equals(name)) {
                messageLabel.setText("This username is not available!");
                return;
            }
        }

        HRManagerModelClass1 user = new HRManagerModelClass1(name, contact, role);
        HRManagerModelClass1list.add(user);
        StaffRecordsTV.getItems().add(user);
        messageLabel.setText("User added successfully");
//        System.out.println("Currently " + userList.size() + " users in the list");

        NameTF.clear();
        RoleTF.clear();
        ContactTF.clear();

    }

    @FXML
    void deleteButton(ActionEvent event) {
        HRManagerModelClass1 selected = StaffRecordsTV.getSelectionModel().getSelectedItem();
        if (selected != null) {
            HRManagerModelClass1list.remove(selected); // Remove from the list
            StaffRecordsTV.getItems().remove(selected);
            messageLabel.setText("Record deleted.");
        } else {
            messageLabel.setText("Please select a row to delete.");
        }

    }

    @FXML
    void editButton(ActionEvent event) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("HRManager1.bin"))) {
            outputStream.writeObject(HRManagerModelClass1list);
            messageLabel.setText("Saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
            messageLabel.setText("Could not save data.");
        }}


    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }

}
