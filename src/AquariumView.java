import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

public class AquariumView extends JFrame {

    private Image aquariumImage;
    private Image[] fishImages;
    private final int WINDOW_WIDTH = 1000;
    private final int WINDOW_HEIGHT = 800;
    private Aquarium a;
    public AquariumView(Aquarium a) {

        this.a = a;
        fishImages = new Image[2];
        fishImages[0] = new ImageIcon("Resources/fish1.png").getImage();
        fishImages[1] = new ImageIcon("Resources/fish2.png").getImage();
        aquariumImage = new ImageIcon("Resources/bubbles.jpg").getImage();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("The Aquarium");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
        createBufferStrategy(2);
    }

    public Image[] getFishImages() {
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

    public void myPaint(Graphics g) {
        // Draw the background
        g.drawImage(aquariumImage, 0, 0, this);
        // Add all the fish on top
        ArrayList<Fish> fishes = a.getFishes();
        for (Fish fish : fishes) {
            fish.draw(g);
        }
    }

}