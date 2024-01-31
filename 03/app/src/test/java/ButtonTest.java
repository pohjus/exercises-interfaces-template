package exercise;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ButtonTest {

    private Button button;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        button = new Button("Test Button");
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testConstructorAndGetTitle() {
        assertEquals("Test Button", button.getTitle());
    }

    @Test
    public void testSetTitle() {
        button.setTitle("New Title");
        assertEquals("New Title", button.getTitle());
    }

    @Test
    public void testAskIfButtonIsPressedYes() {
        MyActionListener listener = new MyActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed");
            }
        };
        button.addActionListener(listener);

        // Simulate user pressing 'Y'
        ByteArrayInputStream in = new ByteArrayInputStream("Y\n".getBytes());
        System.setIn(in);

        button.askIfButtonIsPressed();

        String expectedOutput = "Do you want to press the button 'Test Button' (Y/N):\nButton pressed\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testAskIfButtonIsPressedNo() {
        MyActionListener listener = new MyActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button pressed");
            }
        };
        button.addActionListener(listener);

        // Simulate user pressing 'N'
        ByteArrayInputStream in = new ByteArrayInputStream("N\n".getBytes());
        System.setIn(in);

        button.askIfButtonIsPressed();

        String expectedOutput = "Do you want to press the button 'Test Button' (Y/N):\nButton 'Test Button' was not pressed\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testToString() {
        assertEquals("Button{title='Test Button', listener=not attached}", button.toString());
    }
}
