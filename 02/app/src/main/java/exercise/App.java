package exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

/**
 * Exercise 02.
 */
public final class App {
    private static final Logger LOG = LogManager.getLogger(App.class);

    private App() {
        // Utility class, no instantiation required
    }

    /**
     * The main method that serves as the entry point for the application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(final String[] args) {

    }

    /**
     * Randomly returns an instance of either Human or AI class using a
     * ternary operator.
     * Both classes implement the DriveThruSpeakerSystem interface.
     *
     * @return An instance of DriveThruSpeakerSystem (either Human or AI).
     */
    public static DriveThruSpeakerSystem getRandom() {
        return null;
    }
}
