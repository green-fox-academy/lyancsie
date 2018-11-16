package Triangles;

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    double size=WIDTH;


    int[] x = {0, (int) WIDTH / 2, (int)WIDTH};
    int[] y = {0, (int) (WIDTH * Math.sqrt(3) / 2), 0};

   // int offset=(int)size/2;

    int[] x2 = {(int)size / 4 , (int)size / 2, 3 * (int)size / 4};
    int[] y2 = {(int) (size * Math.sqrt(3) / 4), 0, (int) (size * Math.sqrt(3) / 4)};
    graphics.drawPolygon(x, y, 3);

        recursiveTriangles((int)size, x2, y2, graphics, 8);

  }
  static void recursiveTriangles(double size, int[] x2,  int y2[], Graphics g, int n) {

    if (n == 0) {
      return;
    }
    int[] xPlus = {WIDTH / 2, WIDTH / 2, WIDTH / 2};
    g.drawPolygon(x2, y2, 3); //both tested, working



    recursiveTriangles(size/2, arraySetter(x2,0.5, 0.5,0.5), arraySetter (y2,0.5,0.5,0.5 ), g, n-1 ) ; //working

    x2= new int[]{(int)WIDTH / 4, WIDTH / 2, 3 * WIDTH / 4};
    y2 = new int[]{(int)(WIDTH * Math.sqrt(3) / 4), 0, (int) (WIDTH * Math.sqrt(3) / 4)};

    //recursiveTriangles(size/2, new int[]{x2[0]+3*(int)size/4, x2[1]+(int)size/4, x2[2]+(int)size/2}, arraySetter (y2,0.5,0.5,0.5 ), g, n-1 ) ; //working


    //recursiveTriangles(x2, y2, g, n - 1);
  }

  public static int[] arraySetter(int[] inputArray, double c0, double c1, double c2) {
    inputArray[0] *= c0;
    inputArray[1] *= c1;
    inputArray[2] *= c2;

    return inputArray;
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