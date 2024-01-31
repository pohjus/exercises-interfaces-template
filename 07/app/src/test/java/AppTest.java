package exercise;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        assertTrue(app.test("Contains\tTab"));
        assertFalse(app.test("NoTabHere"));
    }

    @Test
    public void testApply() {
        App app = new App();
        String transformedLine = app.apply("Replace\tTabs");
        assertEquals("Replace____Tabs", transformedLine);
    }
}
