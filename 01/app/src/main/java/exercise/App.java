package exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Application class demonstrating usage of Shape interface
 * and its implementations, Circle and Rectangle.
 */
public final class App {

    private static final Logger LOG = LogManager.getLogger(App.class);
    private static final double FIRST_CIRCLE_RADIUS = 5.0;
    private static final double SECOND_CIRCLE_RADIUS = 3.0;
    private static final double RECTANGLE_WIDTH = 4.0;
    private static final double RECTANGLE_HEIGHT = 6.0;

    private App() {
        // Private constructor to prevent instantiation
    }

    /**
     * Main method to run the application.
     *
     * @param args command line arguments (not used)
     */
    public static void main(final String[] args) {
        // Create a Circle object with a radius
        Circle circle = new Circle(FIRST_CIRCLE_RADIUS);

        LOG.info(Shape.PI);

        // Calculate and log the area of the circle
        double circleArea = circle.calculateArea();
        LOG.info("Area of the circle: {}", circleArea);

        // Get and log the class name using the default method
        String circleClassName = circle.getClassName();
        LOG.info("Circle Class Name: {}", circleClassName);

        // Create another Circle object with a different radius
        Circle anotherCircle = new Circle(SECOND_CIRCLE_RADIUS);

        // Compare the areas of two circles and log the result
        boolean areasEqual = Shape.compareShapeAreas(circle, anotherCircle);
        LOG.info("Are the areas of the two circles equal? {}", areasEqual);

        // Find the maximum area among circles and log it
        Circle[] circles = {circle, anotherCircle};
        double maxCircleArea = Shape.max(circles);
        LOG.info("Maximum area among circles: {}", maxCircleArea);

        // Create a Rectangle object with width and height
        Rectangle rectangle = new Rectangle(RECTANGLE_WIDTH, RECTANGLE_HEIGHT);

        // Calculate and log the area of the rectangle
        double rectangleArea = rectangle.calculateArea();
        LOG.info("Area of the rectangle: {}", rectangleArea);

        // Get and log the class name using the default method
        String rectangleClassName = rectangle.getClassName();
        LOG.info("Rectangle Class Name: {}", rectangleClassName);

        // Compare the areas of the circle and rectangle and log the result
        boolean areasEqualCircleRectangle = Shape.compareShapeAreas(circle,
                                                                    rectangle);
        LOG.info("Are the areas of the circle and rectangle equal? {}",
                                                    areasEqualCircleRectangle);

        // Find the maximum area among the circle and rectangle and log it
        Shape[] shapes = {circle, rectangle};
        double maxArea = Shape.max(shapes);
        LOG.info("Maximum area among circle and rectangle: {}", maxArea);
    }
}
