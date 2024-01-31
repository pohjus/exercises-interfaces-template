package exercise;

import org.junit.Before;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAccept() {
        App app = new App();
        app.accept("Test Line");
        assertEquals("Test Line\n", outContent.toString());
    }

    @Test
    public void testTest() {
        App app = new App();
        assertTrue(app.test("This contains a\ttab."));
        assertFalse(app.test("No tab here"));
    }

    @Test
    public void testApply() {
        App app = new App();
        assertEquals("Replace____tabs", app.apply("Replace\ttabs"));
    }
}
