package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class HRManager3 {

    @FXML
    private TextField NameTF;

    @FXML
    private ComboBox<String> RoleCB;

    @FXML
    private TableView<HRManagerModelClass3> applicationsTable;

    @FXML
    private Label messageLabel;

    @FXML
    private TableColumn<HRManagerModelClass3, String> nameColumn;

    @FXML
    private TableColumn<HRManagerModelClass3, String> roleColumn;

    @FXML
    private TableColumn<HRManagerModelClass3, String> statusColumn;

static ArrayList<HRManagerModelClass3> HRManagerModelClass3list= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        RoleCB.getItems().addAll("Approve", "Reject");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<>("role"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));

        applicationsTable.getItems().addAll(HRManagerModelClass3list);}

    @FXML
    void approveButton(ActionEvent event) {
        String Name = NameTF.getText();
        String role = RoleCB.getValue();

        if (Name.isBlank() || role == null) {
            messageLabel.setText("Please provide all inputs");
            return;
        }

        for (HRManagerModelClass3 u : HRManagerModelClass3list) {
            if (u.getName().equalsIgnoreCase(Name)) {
                messageLabel.setText("This employee already exists!");
                return;
            }
        }
        // Create object of the correct type
        String perfomance = "perfomance";
        HRManagerModelClass3 user = new HRManagerModelClass3(Name, role,perfomance);

        HRManagerModelClass3list.add(user);
        applicationsTable.getItems().add(user);
        messageLabel.setText("Application Approved.");

        // Clear form
        NameTF.clear();
        RoleCB.setValue(null);

    }

    @FXML
    void rejectButton(ActionEvent event) {
        HRManagerModelClass3 selectedLeave = applicationsTable.getSelectionModel().getSelectedItem();

        if (selectedLeave != null) {
            selectedLeave.setStatus("rejected");

            // Refresh the table to reflect changes
            applicationsTable.refresh();
            messageLabel.setText("Application rejected.");
        } else {
            messageLabel.setText("Please select an application to reject.");
        }
    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }

}
