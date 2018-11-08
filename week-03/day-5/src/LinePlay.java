import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw (Graphics graphics) {

LinePlay(graphics);
    }

    public static void LinePlay( Graphics graphics) {
        graphics.setColor(Color.magenta);
        int x1=220;
        int x2=0;
        int y1=0;
        int y2=100;
        int iterator=40;
        for(int i=1; i<19; i++){
            x1+=20;
            x2=WIDTH;
            y1=0;
            y2+=10;
            graphics.drawLine(x1,y1, x2,y2);
        }
   /*     for(int i=1; i<16; i++){
            graphics.drawLine(WIDTH,15*iterator,WIDTH-iterator,0);
            iterator+=10;
        }*/
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
