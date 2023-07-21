package com.cydeo.solid.openClosed.example1.good;

import java.util.List;

public class DrawShape {

    public void startDrawing(List<Shape> shapes) {

        for (Shape each: shapes) {
            each.draw();
        }

    }

}