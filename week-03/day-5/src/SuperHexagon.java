import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.RED);
        int x[] = {40, 50, 70, 80, 70, 50};
        int y[] = {50, 35, 35, 50, 65, 65};
        hexa(x, y, 6, graphics);
    }

    public static void hexa(int x[], int y[], int n, Graphics graphics) {
        int k = 4;
        int[] xbase = x.clone();
        int[] ybase = y.clone();
        int count =4;
        for (int col=0; col<4; col++) {

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < y.length; j++) {    //sets the new Y position
                    y[j] = y[j] + 30;
                    count++;
                    if(count==k){
                        k++;
                        for(int z=0; z < x.length; z++){          //something is amiss here
                            x[z]+=30;
                            y[z]+=15;
                        }
                    }
                }
                graphics.drawPolygon(x, y, n);          //draws
            }

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

