import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
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
public class AquariumView extends JFrame {
    private Image aquariumImage;
    private Image[] fishImages;
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 800;
    private final int TITLE_BAR_HEIGHT = 23;
    private Aquarium a;
    public AquariumView(Aquarium a) {

        // Initialize instance variables.
        // TODO: initialize the View's instance variables.

        // Setup the window and the buffer strategy.
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("The Aquarium");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
        createBufferStrategy(2);
    }

    public Image[] getImages() {
        return fishImages;
    }

    public void paint(Graphics g) {
        BufferStrategy bf = this.getBufferStrategy();
        if (bf == null)
            return;
        Graphics g2 = null;
        try {
            g2 = bf.getDrawGraphics();
            myPaint(g2);
        }
        finally {
            g2.dispose();
        }
        bf.show();
        Toolkit.getDefaultToolkit().sync();
    }

    /**
     * myPaint
     *
     * This is used by the buffering strategy to do the actual painting.
     * It draws the background image, then draws each fish on top of it.
     */
    public void myPaint(Graphics g) {
        // TODO: Write the paint method.
    }
}