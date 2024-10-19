package com.example.epitome;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource.("Loginpage.fxml"));
        stage.initStyle(StageStyle.UNDECORATED);
        Scene scene = new Scene(com.example.epitome.Controller.fxmlLoader.load(), 600, 400);
        stage.setTitle("Epitome");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}