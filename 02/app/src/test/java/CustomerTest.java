import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import exercise.Customer;
import exercise.DriveThruSpeakerSystem;

public class CustomerTest {
    private Customer customer;
    private DriveThruSpeakerSystem driveThruService;

    @Before
    public void setUp() {
        // Create a mock of the DriveThruSpeakerSystem
        driveThruService = mock(DriveThruSpeakerSystem.class);

        // Initialize the Customer with the mock service
        customer = new Customer(driveThruService);
    }

    @Test
    public void testPlaceOrder() {
        // Define the expected interaction messages
        String orderDetails = "1 Burger, 1 Fries, 1 Coke";
        String orderConfirmation = "Order confirmed";
        String confirmationDetails = "Order details confirmed";
        double totalCost = 10.0;
        String paymentConfirmation = "Payment processed";
        String readyNotification = "Order is ready";

        // Configure the mock service to return expected messages
        when(driveThruService.takeOrder(orderDetails)).thenReturn(orderConfirmation);
        when(driveThruService.confirmOrder(orderDetails)).thenReturn(confirmationDetails);
        when(driveThruService.calculateTotal(orderDetails)).thenReturn(totalCost);
        when(driveThruService.processPayment(totalCost, "Credit Card")).thenReturn(paymentConfirmation);
        when(driveThruService.notifyWhenReady(orderDetails)).thenReturn(readyNotification);

        // Call the placeOrder method and capture the result
        String result = customer.placeOrder(orderDetails);

        // Verify that the result contains the expected messages
        String expectedInteraction = orderConfirmation + "\n" +
                confirmationDetails + "\n" +
                "Your total is: $" + totalCost + "\n" +
                paymentConfirmation + "\n" +
                readyNotification;

        assertEquals(expectedInteraction, result);
    }
}
