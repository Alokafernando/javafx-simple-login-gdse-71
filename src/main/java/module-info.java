module lk.ijse.gdse.work {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens lk.ijse.gdse.work.controller to javafx.fxml;
    exports lk.ijse.gdse.work;
}