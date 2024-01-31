import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import exercise.Circle;

public class CircleTest {
    private static final double DELTA = 1e-15;
    private Circle circle;

    @Before
    public void setUp() {
        circle = new Circle(5.0); // Radius = 5.0
    }

    @Test
    public void testCalculateArea() {
        // Expected area = π * radius^2 = π * 5.0^2 = 78.53981633974483
        assertEquals(78.53981633974483, circle.calculateArea(), DELTA);
    }

    @Test
    public void testCalculateAreaWithZeroRadius() {
        Circle zeroRadiusCircle = new Circle(0.0);
        assertEquals(0.0, zeroRadiusCircle.calculateArea(), DELTA);
    }
}
