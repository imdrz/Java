package test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestFrame extends JFrame implements ActionListener {

    private int frameWidth = 500;
    private int frameHeight = 500;

    private int floor = frameWidth;
    private int ceil = 0;
    private int fps = 120;
    private ArrayList<O> components = new ArrayList<>();
    private ArrayList<JPanel> border = new ArrayList<>();

    TestFrame() throws InterruptedException {
        components.add(new CirclePanel(30, 30, 100, 0));
        
        JPanel bottomBorder = new JPanel();
        bottomBorder.setBounds(0, frameWidth, frameWidth, frameHeight);
        border.add(bottomBorder);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);


        this.setSize(frameWidth, frameHeight);
        this.setTitle("Title");
        this.setLayout(null);
        this.setVisible(true);

        
        System.out.println("Adding components..");
        for (O component: components) {
            this.add(component);
        }

        System.out.println("Start");
        while (true) {
            render();
            Thread.sleep(1000/fps);
        }
    }

    public void render() {
        for (O c: components) {
            calc(c);
        }
    }

    public void calc(O c) {        
        c.calc();
        c.setBounds(c.getX() + c.getXV(), c.getY() - c.getYV(), c.getWidth(), c.getHeight());
    }

    public int getFloor() {
        return floor;
    }

    public ArrayList<O> getComps() {
        return components;
    }

    public ArrayList<JPanel> getBorders() {
        return border;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}