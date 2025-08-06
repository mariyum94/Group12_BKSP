package com.example.group12_bksp.Mariyum;

import com.example.group12_bksp.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;


public class FinanceOfficerDashboard {
    @javafx.fxml.FXML
    public void ManageEquipmentPurchaseOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficer5.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void TrackMonthlyBudgetOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficer1.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void GenerateFinancialReportOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficer4.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void MonitorSponsorshipFundOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficer7.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void LogOutOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Login.fxml", actionEvent);
}

    @javafx.fxml.FXML
    public void MaintainFinancialTransactionsLogOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficer3.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void AllocateBudgettoDepartmentOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficer6.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void HandleSalariesOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficer2.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void AuditFinancialRecordOnActionButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group12_bksp/Mariyum/FinanceOfficer8.fxml", actionEvent);
    }
}
