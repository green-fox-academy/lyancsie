package lab.random;
import sun.plugin2.util.ColorUtil;

import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.


        int xrand, yrand, wrand, hrand, R, G, B;
        R=0; G=0; B=0;
        for (int i = 0; i < 4; i++) {
        graphics.setColor(new Color(R,G,B));
        R = (int)(Math.random() * 255);
        G = (int)(Math.random() * 255);
        B = (int)(Math.random() * 255);
        xrand = (int)(Math.random() * WIDTH);
        yrand = (int)(Math.random() * HEIGHT);
        wrand=(int)(Math.random() * WIDTH/4);
        hrand=(int)(Math.random() * HEIGHT/4);
        graphics.fillRect(xrand, yrand, wrand, hrand);
        }
    }



    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
