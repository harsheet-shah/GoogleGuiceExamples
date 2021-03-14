package com.guice.services;

import com.guice.annotations.ColorValue;
import com.guice.annotations.EdgeValue;

import javax.inject.Inject;

public class DrawSquare implements DrawShape {


    private int edge;
    private String color;

    @Inject
    public DrawSquare(@EdgeValue int edge, @ColorValue String color) {
        //The reason why he created annotation here is guice framework will only insert string value and integer value
        // at annotated place, if we don't specify it will for string values and integer values
        this.edge = edge;
        this.color = color;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Square with edge value "+edge+" and color value "+color);
    }

}
