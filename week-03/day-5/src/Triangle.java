import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
    public static void mainDraw(Graphics graphics) {

        int x[] = {300, 320, 340};
        int y[] = {600, 570, 600};

        Triangles(x, y, graphics);
    }


    public static void Triangles(int[] x, int[] y, Graphics graphics) {
        int size = 40;
        int column = 22;
        int max = 10;
        int[] xref = x.clone();
        int[] yref = y.clone();
        for (int i = column; i > 0; i--) {
            max -=1;
            for (int row = max; row > 0; row--) {      //draws a single line
                for (int xmod = 0; xmod < x.length; xmod++) { //if row==1
                    x[xmod] += size;
                    graphics.drawPolygon(x, y, 3);
                }
            }
                for (int ymod = 0; ymod < y.length; ymod++) {
                    y[ymod] -= size;
                    x[ymod] = xref[ymod] + (column - i+1) * size/2;
                }
            }
        }
        //   }


    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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
