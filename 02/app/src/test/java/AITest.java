import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import exercise.AI;

public class AITest {
    private AI ai;

    @Before
    public void setUp() {
        ai = new AI();
    }

    @Test
    public void testTakeOrder() {
        String orderDetails = "Burger and Fries";
        String expected = "Order of you, we have received, kind sir/madam: Burger and Fries. Thank you so very much, yes.\n";
        assertEquals(expected, ai.takeOrder(orderDetails));
    }

    @Test
    public void testConfirmOrder() {
        String orderDetails = "Pizza and Salad";
        String expected = "Confirming with great care, your esteemed order, it is: Pizza and Salad. We hope it's all correct, oh yes.\n";
        assertEquals(expected, ai.confirmOrder(orderDetails));
    }

    @Test
    public void testCalculateTotal() {
        // Total cost is fixed at 20 for testing purposes
        String orderDetails = "Anything";
        double expected = 20.0;
        assertEquals(expected, ai.calculateTotal(orderDetails), 0.0);
    }

    @Test
    public void testNotifyWhenReady() {
        String orderDetails = "Ice Cream";
        String expected = "Most joyous news! Your splendid order, ready it is: Ice Cream. Please collect at your earliest convenience, dear customer.\n";
        assertEquals(expected, ai.notifyWhenReady(orderDetails));
    }

    @Test
    public void testProcessPayment() {
        double amount = 30.50;
        String paymentMethod = "Credit Card";
        String expected = "Oh, what a grand choice! Processed payment, we have, of $30.5 using Credit Card. We are ever so grateful, thank you kindly.\n";
        assertEquals(expected, ai.processPayment(amount, paymentMethod));
    }
}
