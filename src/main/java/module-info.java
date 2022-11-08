module uz.bakhromjon.javafxlogin {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxlogin to javafx.fxml;
    exports uz.bakhromjon.javafxlogin;
}