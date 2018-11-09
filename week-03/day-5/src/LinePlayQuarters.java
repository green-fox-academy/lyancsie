import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        int n = 2;
        int k=0;
        int x1=20;
        for (int i = 1; i<=n; i++) {
            x1=linePlay(graphics, x1, 0, 0, 0, 2)+20;


}}

    public static int linePlay(Graphics graphics, int x1, int x2, int y1, int y2, int n) {
        for (int i = x1; i < WIDTH/n; i += 10) { // probably don't need to put a loop here
            x1 += 10;
            x2 = WIDTH / n;
            y1 = 0;
            y2 += 10;
            graphics.drawLine(x1, y1, x2, y2);
            if(x1>=WIDTH/n){return x1;}
        }
        return x1;


        //graphics.setColor(Color.PINK);

 /*       for(int i=1; i<23; i++){
            x2+=10;
            y1+=10;
            graphics.drawLine(x1,y1, x2,y2);
        }*/
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

