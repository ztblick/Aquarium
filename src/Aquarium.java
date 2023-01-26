import javax.swing.*;
import java.awt.event.*;
/**
 * The Aquarium
 * (Aquarium, AquariumView, & Fish)
 *
 * Built by Z. Blick on Nov. 25 2022 for CS2 @ Menlo School
 * with inspiration from Steven Holzner's "Java After Hours" (2006)
 *
 * This program simulates a group of fish swimming around, periodically
 * changing directions when they reach the edge of the tank.
 */
public class Aquarium implements ActionListener {
    private AquariumView window;
    private final int NUM_FISH = 20;
    private static final int SLEEP_TIME = 110;
    private Fish[] fishes;
    public Aquarium() {
        // Initialize the View, then create all the Fish:
        // TODO: Write the Aquarium constructor.
    }

    /**
     * actionPerformed
     *
     * For each time step, this method is called. It moves
     * each Fish, then checks to see if any of them should bounce
     * off the side of the screen. Finally, it repaints the window.
     *
     * @param e the event to be processed
     */
    public void actionPerformed(ActionEvent e) {
        // TODO: Write the actionPerformed method.
    }

    public Fish[] getFishes() {
        return fishes;
    }

    public static void main(String[] args) {
        Aquarium a = new Aquarium();
        Timer clock = new Timer(SLEEP_TIME, a);
        clock.start();
    }
}