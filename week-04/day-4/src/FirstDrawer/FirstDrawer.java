/*package FirstDrawer;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FirstDrawer {
  static int counter = 3;

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.red);
    int width = WIDTH;
    int height = HEIGHT;
    int x = 0;
    int y = 0;
    draw(x, y, WIDTH, HEIGHT, graphics);
  }

  public static void draw(int x, int y, int width, int height, Graphics graphics) {
    if (counter == 0) {
      return;
    }
    if (counter > 0) {
      for (int j = 0; j < 3; j++) {
        for (int i = 0; i < 3; i++) {
          graphics.drawRect(x, y, width / 3, height / 3);
          x += width / 3;
        }
        x=0;
        y += height / 3;
        graphics.drawRect(x, y, width / 3, height / 3);
      }
      counter--;
      draw(x / 3, y / 3, width / 3, height / 3, graphics);
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

  public static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}*/