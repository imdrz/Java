package MathProject;

import java.awt.Color;

import javax.swing.JPanel;

public class Point extends JPanel {
    
    Point(int x, int y) {
        this.setBounds(x, y, 5, 5);
        this.setBackground(Color.RED);
        this.setVisible(true);
    }

    Point(int x, int y, Color c) {
        this.setBounds(x, y, 5, 5);
        this.setBackground(c);
        this.setVisible(true);
    }
}
