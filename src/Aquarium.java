/**
 * Aquarium.java
 *
 * Built by Z. Blick on Nov. 25 2022
 * with inspiration from Steven Holzner's "Java After Hours" (2006)
 */

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Aquarium implements ActionListener {
    private AquariumView window;
    private final int NUM_FISH = 20;
    private static final int SLEEP_TIME = 110;
    private ArrayList<Fish> fishes;
    public Aquarium() {
        window = new AquariumView(this);
        fishes = new ArrayList<>();
        for (int i = 0; i < NUM_FISH; i++)
            fishes.add(new Fish(window));
    }

    public void actionPerformed(ActionEvent e) {
        for (Fish fish : fishes) {
            fish.swim();
        }
        window.repaint();
    }

    public ArrayList<Fish> getFishes() {
        return fishes;
    }

    public static void main(String[] args) {
        Aquarium a = new Aquarium();
        Timer clock = new Timer(SLEEP_TIME, a);
        clock.start();
    }
}