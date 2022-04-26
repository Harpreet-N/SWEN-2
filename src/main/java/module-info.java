module at.technikum.tour_planner {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires lombok;

    opens at.technikum.tour_planner to javafx.fxml;
    exports at.technikum.tour_planner;
    exports at.technikum.tour_planner.main;
    opens at.technikum.tour_planner.main to javafx.fxml;
}