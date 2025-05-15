package test;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class O extends JPanel {
    private int g = -4;
    private double e = 0.8;

    private int x;
    private int y;

    private int xV = 0;
    private int yV = -1;

    private double friction = 0.9;

    public O(int h, int w, int x, int y) {
        setBounds(x, y, w, h);
        this.x = x;
        this.y = y;
    }

    public void calc() {
        if (yV > -4) {
            yV--;
        }
        checkCollision(((TestFrame) getTopLevelAncestor()).getComps(), ((TestFrame) getTopLevelAncestor()).getBorders());
        check();
        System.out.println(x + ", " + y + " - " + xV + ", " + yV);
        
    }

    public int getXV() {
        return xV;
    }

    public int getYV() {
        return yV;
    }

    public void check() {
        x = getX();
        y = getY();
    }

    public void checkCollision(ArrayList<O> components, ArrayList<JPanel> borders) {
        check();
        for (JPanel b: borders) {
            if (b.getY()-y < getHeight()+100) {
                System.out.println(b.getY()-y + "s" + getHeight());
                // yV = (int) (yV * e * -1);
            } else {
            }
        }
    }
    
}
