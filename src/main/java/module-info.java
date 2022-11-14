module com.example.absrad {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.absrad to javafx.fxml;
    exports com.example.absrad;
}