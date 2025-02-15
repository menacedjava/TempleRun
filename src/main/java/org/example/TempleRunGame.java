package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;


public class TempleRunGame extends JPanel implements ActionListener, KeyListener {

//    private int runnerX = 50, runnerY = 250, runnerWidth = 30, runnerHeight = 40;
//    private int velocityY = 0;
//    private boolean onGround = true;
//    private int score = 0;
//    private Timer timer;
//    private ArrayList<Rectangle> obstacles;
//    private Random random;

//    public TempleRunGame() {
//        setPreferredSize(new Dimension(500, 300));
//        setBackground(Color.WHITE);
//        setFocusable(true);
//        addKeyListener(this);
//        timer = new Timer(20, this);
//        obstacles = new ArrayList<>();
//        random = new Random();
//        timer.start();
//    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        // Runner
//        g.setColor(Color.BLUE);
//        g.fillRect(runnerX, runnerY, runnerWidth, runnerHeight);
//
//        // Obstacles
//        g.setColor(Color.RED);
//        for (Rectangle obstacle : obstacles) {
//            g.fillRect(obstacle.x, obstacle.y, obstacle.width, obstacle.height);
//        }
//
//        // Score
//        g.setColor(Color.BLACK);
//        g.drawString("Score: " + score, 10, 20);
//    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        runnerY += velocityY;
//        if (runnerY >= 250) {
//            runnerY = 250;
//            onGround = true;
//        } else {
//            velocityY += 1;
//        }
//
//
//        for (int i = 0; i < obstacles.size(); i++) {
//            Rectangle obstacle = obstacles.get(i);
//            obstacle.x -= 5;
//            if (obstacle.x + obstacle.width < 0) {
//                obstacles.remove(i);
//                score += 10;
//            }
//        }
//
//
//        if (random.nextInt(100) < 2) {
//            obstacles.add(new Rectangle(500, 260, 30, 30));
//        }
//
//
//        for (Rectangle obstacle : obstacles) {
//            if (obstacle.intersects(new Rectangle(runnerX, runnerY, runnerWidth, runnerHeight))) {
//                timer.stop();
//                JOptionPane.showMessageDialog(this, "Game Over! Score: " + score);
//                System.exit(0);
//            }
//        }
//
//        repaint();
//    }

//    @Override
//    public void keyPressed(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_UP && onGround) {
//            velocityY = -12;
//            onGround = false;
//        }
//        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//            runnerX += 10;
//        }
//    }

//    @Override
//    public void keyReleased(KeyEvent e) {
//    }
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Temple Run");
//        TempleRunGame game = new TempleRunGame();
//        frame.add(game);
//        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//        frame.setLocationRelativeTo(null);
//    }
}