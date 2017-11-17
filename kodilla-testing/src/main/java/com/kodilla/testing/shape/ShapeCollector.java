package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    public ArrayList addFigure(Shape shape) {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(shape);
        return shapeList;
    }

    public ArrayList removeFigure(Shape shape) {
        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        shapeList.remove(shape);
        return shapeList;
    }

    public Shape getFigure(int n) {
        return null;
    }

    public void showFigures(Shape shape) {
        System.out.println(shape);
    }
}
