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
    requires com.fasterxml.jackson.databind;
    requires java.net.http;
    requires org.apache.logging.log4j;
    requires io;
    requires kernel;
    requires layout;
    requires org.apache.logging.log4j.core;
    requires retrofit2;
    requires retrofit2.converter.jackson;
    requires okhttp3;
    requires org.apache.tomcat.embed.core;
    requires opencsv;
    requires java.desktop;

    opens at.technikum.tour_planner to javafx.fxml;
    exports at.technikum.tour_planner;
    exports at.technikum.tour_planner.model to com.fasterxml.jackson.databind, opencsv;
    exports at.technikum.tour_planner.controllers;
    exports at.technikum.tour_planner.dal.map to com.fasterxml.jackson.databind;
    opens at.technikum.tour_planner.controllers to javafx.fxml;
    opens at.technikum.tour_planner.dal.map to com.fasterxml.jackson.databind;
    opens at.technikum.tour_planner.model to javafx.base;

}