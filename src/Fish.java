import java.awt.*;
public class Fish {
    private AquariumView tank;
    private Image image1, image2;
    private Point location, velocity;
    private Rectangle edges;
    public Fish(AquariumView tank) {
        this.tank = tank;
        this.image1 = tank.getFishImages()[0];
        this.image2 = tank.getFishImages()[1];
        this.edges = new Rectangle(0, 0, tank.getWidth(), tank.getHeight());
        this.location = new Point((int) (Math.random() * edges.width * 0.8),
                                (int) (Math.random() * edges.height * 0.8));
        this.velocity = new Point(-8 + (int) (Math.random() * 16), -8 + (int) (Math.random() * 16));
    }

    public void swim() {
        // Periodically change fish velocity to simulate swimming
        if ((int) (Math.random() * 7) == 1) {
            velocity.x += -4 + (int) (Math.random() * 8);
            velocity.x = Math.min(velocity.x, 8);
            velocity.x = Math.max(velocity.x, -8);

            velocity.y += -4 + (int) (Math.random() * 8);
            velocity.y = Math.min(velocity.y, 8);
            velocity.y = Math.max(velocity.y, -8);
        }

        // Update fish location
        location.x += velocity.x;
        location.y += velocity.y;

        // Bounce off walls
        if (location.x < edges.x) {
            location.x = edges.x;
            velocity.x *= -1;
        }
        if (location.x + image1.getWidth(tank) > edges.x + edges.width) {
            location.x = edges.x + edges.width - image1.getWidth(tank);
            velocity.x *= -1;
        }
        if (location.y < edges.y) {
            location.y = edges.y;
            velocity.y *= -1;
        }
        if (location.y + image1.getHeight(tank) > edges.y + edges.height) {
            location.y = edges.y + edges.height - image1.getHeight(tank);
            velocity.y *= -1;
        }
    }

    public void draw(Graphics g) {
        if (velocity.x < 0)
            g.drawImage(image1, location.x, location.y, tank);
        else
            g.drawImage(image2, location.x, location.y, tank);
    }
}