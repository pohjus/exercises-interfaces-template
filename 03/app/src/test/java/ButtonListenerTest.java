package exercise;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ButtonListenerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testActionPerformed() {
        ButtonListener buttonListener = new ButtonListener();
        ActionEvent actionEvent = new ActionEvent("Test Button");

        buttonListener.actionPerformed(actionEvent);

        String expectedOutput = "button clicked: Test Button\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
