module mx.edu.utez.yahir1314 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.yahir1314 to javafx.fxml;
    exports mx.edu.utez.yahir1314;
}