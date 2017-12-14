package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task createTask(final String task) {
        switch (task) {
            case SHOPPING:
                return new ShoppingTask("Shopping List", "Rice", 2.0);
            case PAINTING:
                return new PaintingTask("Picture", "blue", "Sea");
            case DRIVING:
                return new DrivingTask("Vacation", "New York", "Plane");
            default:
                return null;
        }
    }
}
