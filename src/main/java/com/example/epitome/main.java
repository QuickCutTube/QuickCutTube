package com.example.epitome;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane object = FXMLLoader.load(getClass().getResource("view/login.fxml"));
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(object);
        stage.setTitle("Epitome");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}