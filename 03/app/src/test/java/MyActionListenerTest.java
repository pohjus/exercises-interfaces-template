package exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyActionListenerTest {

    @Test
    public void testMyActionListener() {
        // Create a dummy implementation of MyActionListener for testing
        MyActionListener myActionListener = new MyActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Dummy implementation, do nothing
            }
        };

        assertNotNull(myActionListener);
    }
}
