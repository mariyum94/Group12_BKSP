package com.example.group12_bksp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @javafx.fxml.FXML
    private PasswordField passwordTextField;
    @javafx.fxml.FXML
    private Label errorLabel;
    @javafx.fxml.FXML
    private TextField usernameTextField;
    //mariyum
    private final String FinanceOfficerID = "FinanceOfficer";
    private final String FinanceOfficerpassword = "1234";
    private final String HRManagerID = "HRManager";
    private final String HRManagerpassword = "1234";

    //mansura
    private final String EventCoordinatorID = "EventCoordinator";
    private final String EventCoordinatorpassword = "EventC";
    private final String CricketTraineeID = "CricketTrainee";
    private final String CricketTraineepassword = "CricketT";
    //ROMTAHENA
    private final String DirectorGeneralID = "DirectorGeneral";
    private final String DirectorGeneralpassword = "DirectorG";
    private final String CricketCoachID = "Cricket Coach";
    private final String CricketCoachpassword = "Cricket Coach";
    //Samayra
    private final String SwimmingTraineeID = "SwimmingTrainee";
    private final String SwimmingTraineepassword = "SwimmingT";
    private final String PhysiotherapistID = "Physiotherapist";
    private final String Physiotherapistpassword = "Physiotherapist";


//others user password

    @FXML
    public void LoginOnActionButton(ActionEvent actionEvent) throws IOException {
        String username = usernameTextField.getText().trim();
        String password = passwordTextField.getText().trim();
// mariyum
        if (username.equals(FinanceOfficerID) && password.equals(FinanceOfficerpassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group12_bksp/Mariyum/FinanceOfficerDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else if (username.equals(HRManagerID) && password.equals(HRManagerpassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group12_bksp/Mariyum/HRManagerDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

            //mansura
        }   else if (username.equals(EventCoordinatorID) && password.equals(EventCoordinatorpassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group12_bksp/Mansura/EventCdashbord.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }else if (username.equals(CricketTraineeID) && password.equals(CricketTraineepassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group12_bksp/Mansura/CTraineedashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

            //ROMTAHENA
        }else if (username.equals(DirectorGeneralID) && password.equals(DirectorGeneralpassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group12_bksp/ROMTAHENA/DirectorGdashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }else if (username.equals(CricketCoachID) && password.equals(CricketCoachpassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group12_bksp/ROMTAHENA/CricketCoachDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
            //Samayra
        }else if (username.equals(SwimmingTraineeID) && password.equals(SwimmingTraineepassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group12_bksp/Samayra/SwimmingTraineeDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }else if (username.equals(PhysiotherapistID) && password.equals(Physiotherapistpassword)) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/group12_bksp/Samayra/PhysiotherapistDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

            //others path
        } else {
            errorLabel.setText("Incorrect username or password. Please try again.");
        }
    }

}
