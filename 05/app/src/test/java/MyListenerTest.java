package exercise;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyListenerTest {

    @Test
    public void testMyListenerClass() {
        // Check if the class exists
        try {
            Class.forName("exercise.MyListener");
        } catch (ClassNotFoundException e) {
            fail("MyListener class does not exist.");
        }

        // Check if it extends MouseAdapter
        assertTrue("MyListener should extend MouseAdapter.", MyListener.class.getSuperclass() == java.awt.event.MouseAdapter.class);

        // Check if the mouseClicked method is implemented
        try {
            MyListener.class.getDeclaredMethod("mouseClicked", java.awt.event.MouseEvent.class);
        } catch (NoSuchMethodException e) {
            fail("MyListener should implement the mouseClicked method.");
        }
    }
}
