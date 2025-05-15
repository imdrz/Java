package GUI;

//import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame implements ActionListener {
    
    JButton button;
    JPanel panel;
    

    Frame() throws InterruptedException {
        
        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        button.setText("Bob");
        button.setFocusable(false);
        //button.addActionListener(e -> System.out.println("1"));

        panel = new JPanel();
        panel.add(button);
        panel.setBounds(0, 0, 300, 300);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);


        this.setSize(500, 500);
        this.setTitle("Title");
        this.setLayout(null);


        this.setVisible(true);
        this.add(panel);
        panel.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        if (e.getSource() == button) {
            System.out.println("Bob");
            System.out.println(button.getX());
        }
    }
}