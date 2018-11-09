import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        graphics.setColor(Color.RED);
        EnvelopeStar(WIDTH / 2, WIDTH / 2, 0, HEIGHT / 2, graphics);
        //       EnvelopeStar(WIDTH/2,WIDTH,0,HEIGHT, graphics);
        //       EnvelopeStar(0,WIDTH/2,HEIGHT/2,HEIGHT, graphics);
        //       EnvelopeStar(WIDTH/2,WIDTH,HEIGHT,HEIGHT/2, graphics);
    }

    public static void EnvelopeStar(int x1, int x2, int y1, int y2, Graphics g) {
        while (x2 >= 0) {
            g.drawLine(x1, y1, x2, y2);
            y1 += 10;
            x2 -= 10;
            if (x2 == 0) {
                System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
                break;
            }
        }

        if (x2 == 0) {
            while (x2 <= WIDTH / 2) {
                g.drawLine(x2, y2, x1, y1);
                x2 += 10;
                y1 += 10;
                System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
                if (x2 == WIDTH / 2) {
                    break;
                }
            }
        }
        if (x2 == WIDTH / 2) {
            while (x2 <= WIDTH) {
                g.drawLine(x2, y2, x1, y1);
                x2 += 10;
                y1 -= 10;
                System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
                if (x2 == WIDTH) {
                    break;
                }
            }
            if (x2 == WIDTH) {
                while (x2 >= WIDTH/2) {
                    g.drawLine(x2, y2, x1, y1);
                    x2 -= 10;
                    y1 -= 10;
                    System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
                    if (x2 == WIDTH/2) {
                        break;
                    }
                }
            }
        }
    }

   // }

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
