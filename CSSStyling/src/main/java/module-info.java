module com.example.cssstyling {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.cssstyling to javafx.fxml;
    exports com.example.cssstyling;
}