package exercise;

import javax.swing.SwingUtilities;

/**
 * Exercise 04.
 */
public final class App {

    private App() {

    }
    /**
     * Main starting point for the app.
     *
     * @param args - not used.
     */
    public static void main(final String[] args) {
        // using SwingUtilities.invokeLater() to ensure that the
        // Swing components are created and updated on the
        // Event Dispatch Thread (EDT). The EDT is a special thread used
        // in Java to handle all the events, including GUI events like button
        // clicks and drawing graphics. It's crucial for ensuring that the GUI
        // is responsive and not blocked by long-running tasks.
        //
        // Uses lambda syntax, let's talk about also that later.
        SwingUtilities.invokeLater(() -> {
            MyWindow window = new MyWindow();
            window.setVisible(true);
        });
    }
}

