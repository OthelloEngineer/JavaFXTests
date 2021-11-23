package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        //Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("Iolas.png");
        stage.getIcons().add(icon);
        stage.setTitle("Stage Demo Program");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
        //stage.setX(50);
        //stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("YOU CAN'T ESCAPE THIS MADNESS HAHAHA. \"q\" JK");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));


        stage.setScene(scene);
        stage.show();
    }







    public static void main(String[] args) {
        launch(args);
    }
}