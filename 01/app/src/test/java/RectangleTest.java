import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import exercise.Rectangle;

public class RectangleTest {
    private static final double DELTA = 1e-15;
    private Rectangle rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(5.0, 4.0); // Width = 5.0, Height = 4.0
    }

    @Test
    public void testCalculateArea() {
        // Expected area = width * height = 5.0 * 4.0 = 20.0
        assertEquals(20.0, rectangle.calculateArea(), DELTA);
    }

    @Test
    public void testCalculateAreaWithZero() {
        Rectangle zeroRectangle = new Rectangle(0.0, 4.0);
        assertEquals(0.0, zeroRectangle.calculateArea(), DELTA);

        zeroRectangle = new Rectangle(5.0, 0.0);
        assertEquals(0.0, zeroRectangle.calculateArea(), DELTA);
    }
}
