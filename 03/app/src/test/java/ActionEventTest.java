package exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ActionEventTest {

    @Test
    public void testGetSource() {
        // Create an ActionEvent with a source
        Object source = new Object();
        ActionEvent actionEvent = new ActionEvent(source);

        // Verify that getSource returns the correct source
        assertEquals(source, actionEvent.source());
    }

    @Test
    public void testEqualsAndHashCode() {
        // Create two ActionEvent objects with the same source
        Object source = new Object();
        ActionEvent actionEvent1 = new ActionEvent(source);
        ActionEvent actionEvent2 = new ActionEvent(source);

        // Verify that they are equal and have the same hash code
        assertEquals(actionEvent1, actionEvent2);
        assertEquals(actionEvent1.hashCode(), actionEvent2.hashCode());
    }

    @Test
    public void testNotEquals() {
        // Create two ActionEvent objects with different sources
        Object source1 = new Object();
        Object source2 = new Object();
        ActionEvent actionEvent1 = new ActionEvent(source1);
        ActionEvent actionEvent2 = new ActionEvent(source2);

        // Verify that they are not equal
        assertEquals(false, actionEvent1.equals(actionEvent2));
    }

    @Test
    public void testToString() {
        // Create an ActionEvent with a source
        Object source = new Object();
        ActionEvent actionEvent = new ActionEvent(source);

        // Verify that toString returns the expected string
        assertEquals("ActionEvent[source=" + source.toString() + "]", actionEvent.toString());
    }
}
