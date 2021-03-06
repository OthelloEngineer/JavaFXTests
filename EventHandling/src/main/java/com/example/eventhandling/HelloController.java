package com.example.eventhandling;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {

    @FXML
    private Circle circle;
    private double x;
    private double y;

    public void up(ActionEvent e){
        System.out.println("up");
        circle.setCenterY(y-=10);

    }
    public void down(ActionEvent e){
        System.out.println("down");
        circle.setCenterY(y+=10);
    }
    public void right(ActionEvent e){
        System.out.println("right");
        circle.setCenterX(y+=10);
    }
    public void left(ActionEvent e){
        System.out.println("left");
        circle.setCenterX(y-=10);
    }

}