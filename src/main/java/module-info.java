module com.example.pos {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires java.sql;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.posandroidbasedapp to javafx.fxml;
    opens com.example.posandroidbasedapp.controllers to javafx.fxml;

    exports com.example.posandroidbasedapp;
    exports com.example.posandroidbasedapp.controllers;
}
