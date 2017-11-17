import com.kodilla.testing.shape.*;
import org.junit.*;
import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapes = new ShapeCollector();
        Square square = new Square();

        //When
        ArrayList addedShape = shapes.addFigure(square);

        //Then
        Assert.assertEquals(1, addedShape.size());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapes = new ShapeCollector();
        Square square = new Square();
        shapes.addFigure(square);

        //When
        ArrayList removedShape = shapes.removeFigure(square);

        //Then
        Assert.assertEquals(0, removedShape.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapes = new ShapeCollector();
        Square square1 = new Square();
        shapes.addFigure(square1);
        Triangle triangle1 = new Triangle();
        shapes.addFigure(triangle1);
        Circle circle1 = new Circle();
        shapes.addFigure(circle1);

        //When
        Shape square = shapes.getFigure(0);
        Shape triangle = shapes.getFigure(1);
        Shape circle = shapes.getFigure(2);

        //Then
        Assert.assertEquals(square, square1);
        Assert.assertEquals(triangle, triangle1);
        Assert.assertEquals(circle, circle1);
    }
}
