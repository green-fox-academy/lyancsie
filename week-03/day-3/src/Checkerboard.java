import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int x=0; int y=0;
for(int i=1; i <= 8; i++){
    if(graphics.getColor()==Color.white){
        graphics.setColor(Color.black);}
    else{graphics.setColor(Color.white);}
    for(int j=1; j <= 8; j++){
        graphics.fillRect(x,y,WIDTH/8, HEIGHT/8);
        if(graphics.getColor()==Color.white){
            graphics.setColor(Color.black);}
        else{graphics.setColor(Color.white);}
        y+=HEIGHT/8;
    }
        y=0; x+=WIDTH/8;
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
