module com.javafx.javafx {
    requires javafx.fxml;

    requires java.sql;
    requires javafx.graphics;
    requires javafx.controls;

    opens com.javaintellij.sdia_tp5_v2.Entities to javafx.base;
    opens com.javaintellij.sdia_tp5_v2.Controllers to javafx.fxml;

    exports com.javaintellij.sdia_tp5_v2;
}