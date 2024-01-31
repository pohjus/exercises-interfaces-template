import org.junit.Test;
import static org.junit.Assert.*;
import exercise.Shape;
import exercise.Circle;
import exercise.Rectangle;

public class ShapeTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testGetClassName() {
        Shape circle = new Circle(5.0);
        assertEquals("Circle", circle.getClassName());

        Shape rectangle = new Rectangle(4.0, 6.0);
        assertEquals("Rectangle", rectangle.getClassName());
    }

    @Test
    public void testCompareShapeAreasEqual() {
        Shape circle1 = new Circle(5.0); // Area = π * 5^2
        Shape circle2 = new Circle(5.0); // Area = π * 5^2
        assertTrue(Shape.compareShapeAreas(circle1, circle2));
    }

    @Test
    public void testCompareShapeAreasNotEqual() {
        Shape circle = new Circle(5.0); // Area = π * 5^2
        Shape rectangle = new Rectangle(4.0, 6.0); // Area = 4 * 6
        assertFalse(Shape.compareShapeAreas(circle, rectangle));
    }

    @Test
    public void testMax() {
        Shape circle = new Circle(5.0); // Area = π * 5^2
        Shape rectangle = new Rectangle(4.0, 6.0); // Area = 4 * 6
        Shape[] shapes = {circle, rectangle};

        double maxArea = Shape.max(shapes);
        assertEquals(Math.max(circle.calculateArea(), rectangle.calculateArea()), maxArea, DELTA);
    }
}
