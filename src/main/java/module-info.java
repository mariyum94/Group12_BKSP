module com.example.group12_bksp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.group12_bksp to javafx.fxml;
    exports com.example.group12_bksp;
}