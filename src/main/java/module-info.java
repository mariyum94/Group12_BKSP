module com.example.group12_bksp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.group12_bksp to javafx.fxml;
    opens com.example.group12_bksp.Mansura to javafx.fxml;
    opens com.example.group12_bksp.Mariyum to javafx.fxml;
    opens com.example.group12_bksp.ROMTAHENA to javafx.fxml;
    opens com.example.group12_bksp.Samayra to javafx.fxml;

    exports com.example.group12_bksp;
    exports com.example.group12_bksp.Mansura;
    exports com.example.group12_bksp.Mariyum;
    exports com.example.group12_bksp.ROMTAHENA;
    exports com.example.group12_bksp.Samayra;
    exports com.example.group12_bksp.Mansura.model;
    opens com.example.group12_bksp.Mansura.model to javafx.fxml;
    exports com.example.group12_bksp.Mansura.EventCmodel;
    opens com.example.group12_bksp.Mansura.EventCmodel to javafx.fxml;
}
