package exercise;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MyWindowTest {

    private MyWindow myWindow;

    @Before
    public void setUp() {
        myWindow = new MyWindow();
    }

    @Test
    public void testWindowTitle() {
        assertEquals("window", myWindow.getTitle());
    }

    @Test
    public void testWindowDimensions() {
        assertEquals(400, myWindow.getWidth());
        assertEquals(400, myWindow.getHeight());
    }

    @Test
    public void testDefaultCloseOperation() {
        assertEquals(JFrame.EXIT_ON_CLOSE, myWindow.getDefaultCloseOperation());
    }

    @Test
    public void testMouseListener() {
        MouseListener[] mouseListeners = myWindow.getMouseListeners();
        assertNotNull(mouseListeners);
        assertEquals(1, mouseListeners.length);
        assertTrue(mouseListeners[0] instanceof MyListener);
    }
}
