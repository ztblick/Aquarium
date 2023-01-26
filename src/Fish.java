import java.awt.*;
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
public class Fish {
    private AquariumView tank;
    private Image leftImage, rightImage;
    private int x, y, dx, dy;
    private int tankWidth;
    private int tankHeight;
    private static final int MAX_SPEED = 8;

    public Fish(AquariumView tank) {
        // Initialize the tank values
        this.tank = tank;
        this.tankWidth = tank.getWidth();
        this.tankHeight = tank.getHeight();

        // Set the images
        // TODO: initialize the images in Fish

        // Initialize the fish's variables:
        this.x = (int) (Math.random() * tankWidth * 0.8);
        this.y = (int) (Math.random() * tankHeight * 0.8);
        this.dx = MAX_SPEED - (int) (Math.random() * MAX_SPEED * 2);
        this.dy = MAX_SPEED - (int) (Math.random() * MAX_SPEED * 2);
    }

    /**
     * Swim
     *
     * This method makes the Fish move at somewhat random intervals to simulate swimming.
     */
    public void swim() {
        // This creates a 1-in-7 probability we change the fish's speed.
        if ((int) (Math.random() * 7) == 1) {
            // Change the speed
            dx += -MAX_SPEED / 2 + (int) (Math.random() * MAX_SPEED);
            // Enforce speed limits
            dx = Math.min(dx, MAX_SPEED);
            dx = Math.max(dx, -MAX_SPEED);

            // Do the same for the y-component
            dy += -MAX_SPEED / 2 + (int) (Math.random() * MAX_SPEED);
            dy = Math.min(dy, MAX_SPEED);
            dy = Math.max(dy, -MAX_SPEED);
        }

        // Update fish location
        // TODO: update the Fish's location.
    }

    /**
     * Bounce
     *
     * This method makes the Fish bounce by flipping its dx or dy
     * when it gets too close to the edge of the window.
     */
    public void bounce() {
        // TODO: Write the Fish's bounce() method.
    }

    /**
     * Draw
     *
     * This draws a Fish image in the fish's location. It uses dx to determine
     * whether to draw the left-facing fish or the right-facing fish.
     */
    public void draw(Graphics g) {
        // TODO: Write the Fish's draw() method.
    }
}