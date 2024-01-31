package exercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void takeOrder() {
        Human human = new Human();
        String orderDetails = "1 Big Mac, 1 Fries, 1 Coke";
        String expectedMessage = "Order received: " + orderDetails + "\n";
        assertEquals(expectedMessage, human.takeOrder(orderDetails));
    }

    @Test
    public void confirmOrder() {
        Human human = new Human();
        String orderDetails = "1 Big Mac, 1 Fries, 1 Coke";
        String expectedMessage = "Confirming your order: " + orderDetails + "\n";
        assertEquals(expectedMessage, human.confirmOrder(orderDetails));
    }

    @Test
    public void calculateTotal() {
        Human human = new Human();
        String orderDetails = "1 Big Mac, 1 Fries, 1 Coke";
        double expectedTotal = 20.0;
        assertEquals(expectedTotal, human.calculateTotal(orderDetails), 0.0);
    }

    @Test
    public void notifyWhenReady() {
        Human human = new Human();
        String orderDetails = "1 Big Mac, 1 Fries, 1 Coke";
        String expectedMessage = "Your order is ready: " + orderDetails + "\n";
        assertEquals(expectedMessage, human.notifyWhenReady(orderDetails));
    }

    @Test
    public void processPayment() {
        Human human = new Human();
        double amount = 20.0;
        String paymentMethod = "Credit Card";
        String expectedMessage = "Processed payment of $" + amount + " using " + paymentMethod + "\n";

        System.out.println(expectedMessage);

        assertEquals(expectedMessage, human.processPayment(amount, paymentMethod));
    }
}
