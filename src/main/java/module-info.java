module sn.dev.demodevops {
    requires javafx.controls;
    requires javafx.fxml;


    opens sn.dev.demodevops to javafx.fxml;
    exports sn.dev.demodevops;
}