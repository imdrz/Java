package test;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePanel extends O {

    private Graphics gr;

    public CirclePanel(int h, int w, int x, int y) {
        super(h, w, x, y);
        super.setBackground(Color.RED);
        // drawCircle(gr, x, y, w);
    }
    
    public void drawCircle(Graphics g, int x, int y, int r) {
        g.fillOval(x, y, r, r);
    }
}
