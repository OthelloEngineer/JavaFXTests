module com.example.sceneanddrawings {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sceneanddrawings to javafx.fxml;
    exports com.example.sceneanddrawings;
}