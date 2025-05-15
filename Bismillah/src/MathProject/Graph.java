package MathProject;

import java.awt.Color;

import javax.swing.JFrame;

public class Graph extends JFrame {

    int xC;
    int yC;
    
    Graph() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(200, 232);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("Title");

        xC = getWidth()/2;
        yC = (getHeight()-32)/2;
        System.out.println(xC + " - " + yC);
        // 250 - 234
    }

    public void run() throws InterruptedException {
        paint();
    }

    public void paint() throws InterruptedException {
        this.add(new Point(xC, yC, Color.BLACK));
        // for (int x = 0; x<getWidth(); x+=5) {
        //     //System.out.println(x + ", " + y);
        //     // Thread.sleep(20);
        //     // System.out.println(x);
        //     if (distance(x, 234) < 100.0) {
        //         this.add(new Point(x, 234));
        //     }
        // }
 
    }

    public double distance(int x, int y) {
        // System.out.println(Math.sqrt(Math.pow(x-xC, 2) + Math.pow(y-yC, 2)));
        return Math.sqrt(Math.pow(x-xC, 2) + Math.pow(y-yC, 2));
    }
}
