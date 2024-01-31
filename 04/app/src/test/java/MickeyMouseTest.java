package exercise;

import org.junit.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream; // Import PrintStream

public class MickeyMouseTest {

    @Test
    public void testActionPerformed() {
        // Create an instance of MickeyMouse
        MickeyMouse mickeyMouse = new MickeyMouse();

        // Create a dummy ActionEvent with a source
        Object source = new Object();
        ActionEvent actionEvent = new ActionEvent(source, ActionEvent.ACTION_PERFORMED, "Button Clicked");

        // Use a custom OutputStream to capture printed messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call actionPerformed with the dummy ActionEvent
        mickeyMouse.actionPerformed(actionEvent);

        // Verify that the expected message is printed
        assertEquals("button clicked: " + source.toString() + "\n", outputStream.toString());
    }
}
