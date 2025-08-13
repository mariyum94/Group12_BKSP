package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class HRManager2 {

    @FXML
    private TextField EmployeeNameTF;

    @FXML
    private ComboBox<String > atendanceCB;

    @FXML
    private DatePicker attendanceDatePicker;

    @FXML
    private TableView<HRManagerModelClass2> attendanceTV;

    @FXML
    private Label messageLabel1;

    @FXML
    private TableColumn<HRManagerModelClass2, String> nameColumn;

    @FXML
    private TableColumn<HRManagerModelClass2, String> presentColumn;

    static ArrayList<HRManagerModelClass2> HRManagerModelClass2list= new ArrayList<>();

    @FXML
    public void initialize() {
        atendanceCB.getItems().addAll("present", "Absent");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("Name"));
        presentColumn.setCellValueFactory(new PropertyValueFactory<>("present"));

        attendanceTV.getItems().addAll(HRManagerModelClass2list);}


    @FXML
    void generateReportButton(ActionEvent event) {
        String name = EmployeeNameTF.getText();
        String category = atendanceCB.getValue();
        LocalDate date = attendanceDatePicker.getValue();

        if (name.isBlank() || category == null || date == null) {
            messageLabel1.setText("Please provide all inputs");
            return;
        }
        String isPresent = "present";

        for (HRManagerModelClass2 u : HRManagerModelClass2list) {
            if (u.getName().equalsIgnoreCase(name)) {
                messageLabel1.setText("This employee already exists!");
                return;
            }
        }

        HRManagerModelClass2 user = new HRManagerModelClass2(name, isPresent);

        HRManagerModelClass2list.add(user);
        attendanceTV.getItems().add(user);
        messageLabel1.setText("Attendance recorded successfully.");

        EmployeeNameTF.clear();
        atendanceCB.setValue(null);
        attendanceDatePicker.setValue(null);
    }

    @FXML
    void markPresentButton(ActionEvent event) {
        messageLabel1.setText("Marked present.now generate a report.");
    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);
    }


}
