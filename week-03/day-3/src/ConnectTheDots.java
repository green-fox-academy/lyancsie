import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        int[][] input = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        connector(graphics, input);
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        int [][] input2 = {{120, 100}, {85, 130}, {50, 100}, {50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}};
        connector(graphics, input2);
    }
public static void connector(Graphics graphics, int input[][]){
    int [] storage1 = new int[input.length];
    int[] storage2 = new int[input.length];

    for(int i=0; i<input.length; i++){
    storage1[i] = input[i][0];
    storage2[i] = input[i][1];}

    graphics.drawPolygon(storage1, storage2, input.length);

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
