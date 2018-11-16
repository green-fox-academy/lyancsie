package Hexagon;

import javax.swing.*;

import java.awt.*;

import static java.lang.StrictMath.sin;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
  public static void mainDraw(Graphics graphics) {
    drawCross(WIDTH / 2,HEIGHT / 2,WIDTH / 2,12,graphics);
  }

  public static void drawCross(int xPos, double yPos, int side, int n, Graphics graphics) {
    if(n==0){
      return;
    }

    Polygon h = new Polygon();
    for (int i = 0; i < 6; i++){
      h.addPoint((int) (xPos + side * Math.cos(i * 2 * Math.PI / 6)),
          (int) (yPos + side * Math.sin(i * 2 * Math.PI / 6)));
    }
    int[] xpoints = h.xpoints;
    int[] ypoints = h.ypoints;
    graphics.setColor(Color.red);
    graphics.drawPolygon(xpoints,ypoints,6);
    drawCross(xPos - side / 2/ 2, yPos - (side / 2.0 * sin(Math.PI / 3)), side / 2, n - 1 ,graphics);
    drawCross(xPos - side / 2/ 2, yPos + (side / 2.0 * sin(Math.PI / 3)), side / 2, n - 1 ,graphics);
    drawCross(xPos + side / 2, yPos, side / 2, n - 1 ,graphics);

  }

  // Don’t touch the code below
  static int WIDTH = 500;
  static int HEIGHT = 500;

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