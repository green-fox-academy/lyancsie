import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        // Reproduce this:
        // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
        PurpleSteps(graphics);
    }
    public static void PurpleSteps(Graphics graphics){
        System.out.println("How many times?");

        Scanner read = new Scanner(System.in);
        int n=read.nextInt();
        graphics.setColor(new Color(148, 0, 211));
        int x=0;
        int y=0;
        int width=5;
        int height=5;
        for (int i = 0; i < n ; i++) {
            graphics.fillRect(x,y,width,height);
            x+=width; y+=height;
            width+=10;
            height+=10;
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
