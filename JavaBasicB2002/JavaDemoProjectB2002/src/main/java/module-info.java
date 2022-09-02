module com.example.javademoprojectb2002 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javademoprojectb2002 to javafx.fxml;
    exports com.example.javademoprojectb2002;
}