import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
int x=0; int y=0;
lineToCenter(x,y,graphics);

    }
public static void lineToCenter(int x, int y, Graphics graphics) {
    int param = 20;
    for (int j = 0; j <= HEIGHT / param; j++){
        for (int i = 0; i <= WIDTH / param; i++) {
            graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
            x += param; if(x >= WIDTH){x=0;}
        }
        y += param; if(y >= HEIGHT){y=0;}
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