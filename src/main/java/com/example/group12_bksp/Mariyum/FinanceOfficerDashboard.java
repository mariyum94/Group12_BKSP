package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class FinanceOfficerDashboard {
    @javafx.fxml.FXML
    public void ManageEquipmentPurchaseOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void TrackMonthlyBudgetOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void GenerateFinancialReportOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void MonitorSponsorshipFundOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LogOutOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void MaintainFinancialTransactionsLogOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AllocateBudgettoDepartmentOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void HandleSalariesOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void AuditFinancialRecordOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/bksp/Mariyum/FinanceOfficer8.fxml", actionEvent);
    }
}
