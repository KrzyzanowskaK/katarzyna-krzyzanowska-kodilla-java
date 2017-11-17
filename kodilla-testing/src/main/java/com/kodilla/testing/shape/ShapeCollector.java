package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeList = new ArrayList<Shape>();

    public ArrayList addFigure(Shape shape) {
        shapeList.add(shape);
        return shapeList;
    }

    public ArrayList removeFigure(Shape shape) {
        shapeList.remove(shape);
        return shapeList;
    }

    public Shape getFigure(int n) {
        return shapeList.get(n);
    }

    public void showFigures(Shape shape) {
        System.out.println(shape);
    }
}
