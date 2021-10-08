module com.example.mycontatc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.mycontatc to javafx.fxml;
    exports com.example.mycontatc;
}