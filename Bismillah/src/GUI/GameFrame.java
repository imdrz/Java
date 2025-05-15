package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame extends JFrame implements KeyListener {

    JLabel label;
    JLabel scoreText;
    JPanel bird;
    JPanel obstacle11;
    JPanel obstacle12;
    JPanel obstacle21;
    JPanel obstacle22;
    JPanel obstacle31;
    JPanel obstacle32;
    JPanel scorePanel;
    int xV = 0;
    int yV = 0;
    int vBuffer = -8;
    int score = 0;
    Boolean run;

    GameFrame() throws InterruptedException {
        ImageIcon image = new ImageIcon("C:\\Users\\imadr\\OneDrive\\Documents\\Java\\Bismillah\\src\\GUI\\9b91aada2439fe652a512ded67218623.png");

        scorePanel = new JPanel();
        scorePanel.setBounds(175, 100, 100, 50);
        scorePanel.setLayout(new BorderLayout());

        scoreText = new JLabel(String.valueOf(score));
        scoreText.setVisible(true);
        scoreText.setForeground(Color.BLACK);
        scoreText.setHorizontalAlignment(JLabel.CENTER);
        scoreText.setVerticalAlignment(JLabel.CENTER);
        scorePanel.add(scoreText);

        bird = new JPanel();
        bird.setBounds(175, 350, 50, 50);
        bird.setLayout(new BorderLayout());
        bird.setBackground(Color.RED);


        label = new JLabel("Bird");
        label.setVisible(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        bird.add(label);

        obstacle11 = new JPanel();
        obstacle11.setVisible(true);
        obstacle11.setBackground(Color.GREEN);
        obstacle11.setBounds(500, 0, 50, 700);
        obstacle11.setName("1");

        obstacle12 = new JPanel();
        obstacle12.setVisible(true);
        obstacle12.setBackground(Color.GREEN);
        obstacle12.setBounds(500, 480, 50, 700);
        obstacle12.setName("2");

        obstacle21 = new JPanel();
        obstacle21.setVisible(true);
        obstacle21.setBackground(Color.RED);
        obstacle21.setBounds(825, 0, 50, 700);
        obstacle21.setName("3");

        obstacle22 = new JPanel();
        obstacle22.setVisible(true);
        obstacle22.setBackground(Color.RED);
        obstacle22.setBounds(825, 480, 50, 700);
        obstacle22.setName("4");

        obstacle31 = new JPanel();
        obstacle31.setVisible(true);
        obstacle31.setBackground(Color.BLUE);
        obstacle31.setBounds(1150, 0, 50, 700);
        obstacle31.setName("3");

        obstacle32 = new JPanel();
        obstacle32.setVisible(true);
        obstacle32.setBackground(Color.BLUE);
        obstacle32.setBounds(1150, 480, 50, 700);
        obstacle32.setName("4");
        


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 700);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("Title");
        this.addKeyListener(this);

        run = false;
        

        //this.add(label);
        this.add(bird);
        this.add(obstacle11);
        this.add(obstacle12);
        this.add(obstacle21);
        this.add(obstacle22);
        this.add(obstacle31);
        this.add(obstacle32);
        this.add(scorePanel);

        while (true) {
            if (run == true) {
                Thread.sleep(10);

                if (yV != vBuffer) {
                    yV-=1;
                } else if (bird.getY() > 620) {
                    run = false;
                }

                bird.setBounds(bird.getX()+xV, bird.getY()-yV, 50, 50);
                
                if (obstacle11.getX() > -50) {
                    obstacle11.setBounds(obstacle11.getX()-5, obstacle11.getY(), 50, 300);
                    obstacle12.setBounds(obstacle12.getX()-5, obstacle12.getY(), 50, 300);
                    obstacle21.setBounds(obstacle21.getX()-5, obstacle21.getY(), 50, 300);
                    obstacle22.setBounds(obstacle22.getX()-5, obstacle22.getY(), 50, 300);
                    obstacle31.setBounds(obstacle31.getX()-5, obstacle31.getY(), 50, 300);
                    obstacle32.setBounds(obstacle32.getX()-5, obstacle32.getY(), 50, 300);
                } else if (obstacle21.getX() > -50) {
                    obstacle11.setBounds(obstacle11.getX()-5, obstacle11.getY(), 50, 300);
                    obstacle12.setBounds(obstacle12.getX()-5, obstacle12.getY(), 50, 300);
                    obstacle21.setBounds(obstacle21.getX()-5, obstacle21.getY(), 50, 300);
                    obstacle22.setBounds(obstacle22.getX()-5, obstacle22.getY(), 50, 300);
                    obstacle31.setBounds(obstacle31.getX()-5, obstacle31.getY(), 50, 300);
                    obstacle32.setBounds(obstacle32.getX()-5, obstacle32.getY(), 50, 300);
                } else if (obstacle31.getX() > -50) {
                    obstacle11.setBounds(obstacle11.getX()-5, obstacle11.getY(), 50, 300);
                    obstacle12.setBounds(obstacle12.getX()-5, obstacle12.getY(), 50, 300);
                    obstacle21.setBounds(obstacle21.getX()-5, obstacle21.getY(), 50, 300);
                    obstacle22.setBounds(obstacle22.getX()-5, obstacle22.getY(), 50, 300);
                    obstacle31.setBounds(obstacle31.getX()-5, obstacle31.getY(), 50, 300);
                    obstacle32.setBounds(obstacle32.getX()-5, obstacle32.getY(), 50, 300);
                } else if (obstacle11.getX() < -50) {
                    score++;
                    int offset = generateRandom(-125, 125);
                    offset*=1.25;
                    // System.out.println(offset);
                    obstacle11.setBounds(500, 0+offset, 50, 300);
                    obstacle12.setBounds(500, 480+offset, 50, 300);
                } else if (obstacle21.getX() < -50) {
                    score++;
                    int offset = generateRandom(-125, 125);
                    offset*=1.25;
                    // System.out.println(offset);
                    obstacle21.setBounds(825, 0+offset, 50, 300);
                    obstacle22.setBounds(825, 480+offset, 50, 300);                    
                }
                //System.out.println(bird.getY() + ", " + yV);
                if (checkCollision(bird, new JPanel[]{obstacle11, obstacle12, obstacle21, obstacle22})) {
                   run = false;
                }

            } else {
                score = 0;
                bird.setBounds(175, 350, 50, 50);
                obstacle11.setBounds(500, 0, 50, 300);
                obstacle12.setBounds(500, 480, 50, 300);
                obstacle21.setBounds(825, 0, 50, 300);
                obstacle22.setBounds(825, 480, 50, 300);
            }
        }

        

    }

    public int generateRandom(int numOne, int numTwo) {
        Random r = new Random();
        int randNum = (r.nextInt(numTwo - numOne + 1) + numOne);
        return randNum;
    }

    public boolean checkCollision(JPanel b, JPanel[] objects) {
        int bX = b.getX();
        int bY = b.getY();
        for (int x = 0; x < objects.length; x++) {
            JPanel o = objects[x];
            //System.out.println(bY + " - " + o.getName() + ": " + o.getHeight() + " / " + o.getY() + ", " + (o.getY()+o.getHeight()));
            if (((bY > o.getY() && bY < (o.getY()+o.getHeight())) || ((bY+b.getHeight()) > o.getY() && (bY+b.getHeight()) < (o.getY()+o.getHeight()))) && ((bX > o.getX() && bX < (o.getX()+o.getWidth())) || ((bX+b.getWidth()) > o.getX() && (bX+b.getWidth()) < (o.getX()+o.getWidth())))) {
                System.out.println(o.getName());
                return true;
            }
        }
        return false;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
        if (e.getKeyChar() == ' ') {
            if (run == false) {
                run = true;
            } else {
                yV = 12;
            }
        }
    }
    
}
