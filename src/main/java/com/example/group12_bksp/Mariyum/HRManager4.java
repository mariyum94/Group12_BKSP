package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class HRManager4 {

    @FXML
    private TableColumn<HRManagerModelClass4, String> coachColumn;

    @FXML
    private ComboBox<String> coachComboBox;

    @FXML
    private TableColumn<HRManagerModelClass4, String> dateColumn;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label messageLabel;

    @FXML
    private TableView<HRManagerModelClass4> scheduleTableView;

    @FXML
    private TableColumn<HRManagerModelClass4, String> sportColumn;

    @FXML
    private ComboBox<String> sportComboBox;

    static ArrayList<HRManagerModelClass4> HRManagerModelClass4list= new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        coachComboBox.getItems().addAll("Coach A", "Coach B", "Coach C");
        sportComboBox.getItems().addAll("Football", "Basketball", "Volleyball");
        coachColumn.setCellValueFactory(new PropertyValueFactory<>("coach"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        sportColumn.setCellValueFactory(new PropertyValueFactory<>("sport"));

        scheduleTableView.getItems().addAll(HRManagerModelClass4list);}

    @FXML
    void addScheduleButton(ActionEvent event) {
        String coach = coachComboBox.getValue();
        String sport = sportComboBox.getValue();
        LocalDate date = datePicker.getValue();//something wrong with the date


        if (coach == null || sport == null || date == null) {
            messageLabel.setText("Please provide all inputs");
            return;
        }

        for (HRManagerModelClass4 u : HRManagerModelClass4list) {
            if (u.getCoach().equals(coach)) {
                messageLabel.setText("Please provide all inputs");
                return;
            }
        }

        HRManagerModelClass4 user = new HRManagerModelClass4(coach, sport);
        HRManagerModelClass4list.add(user);
        scheduleTableView.getItems().add(user);
        messageLabel.setText("Schedule added successfully");
//        System.out.println("Currently " + userList.size() + " users in the list");

        coachComboBox.setValue(null);
        sportComboBox.setValue(null);
        datePicker.setValue(null);
    }

    @FXML
    void returnToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml", actionEvent);

    }

}