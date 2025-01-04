module hr.javafx.trackrly {
    requires javafx.controls;
    requires javafx.fxml;


    opens hr.javafx.trackrly to javafx.fxml;
    exports hr.javafx.trackrly;
}