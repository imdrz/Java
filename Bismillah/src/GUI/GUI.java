package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("C:\\Users\\imadr\\OneDrive\\Documents\\Java\\Bismillah\\src\\GUI\\bob.png");

        JLabel label = new JLabel();
        label.setText("Text");
        label.setIcon(image);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setForeground(Color.black);
        label.setFont(new Font("Arial", Font.PLAIN, 18));

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 250, 250);
        panel.setBackground(Color.white);
        panel.setLayout(new BorderLayout());

        JPanel panel2 = new JPanel();
        panel2.setBounds(250, 250, 250, 250);
        panel2.setBackground(Color.red);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);


        frame.setSize(750, 750);
        frame.setTitle("Title");
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);
        frame.setVisible(true);
        
        panel.add(label);
        frame.add(panel);
        frame.add(panel2);
        
    }
}
