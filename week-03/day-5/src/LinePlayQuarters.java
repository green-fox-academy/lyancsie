import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw (Graphics graphics) {

        linePlay(graphics, 20, 0, 0 , 0, 2 );
      //  linePlay(graphics,100, 0, 0, 200, 2 );
    }

    public static void linePlay( Graphics graphics, int x1, int x2, int y1, int y2, int n) {
       for(int i=x1; i<=WIDTH/n; i+=10){
            x1+=10;
            x2=50+WIDTH/n;
            y1=0;
            y2+=10;
            graphics.drawLine(x1,y1, x2,y2);
        }
        x1=0; x2=0; y2=HEIGHT; y1=100;
        graphics.setColor(Color.PINK);

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

