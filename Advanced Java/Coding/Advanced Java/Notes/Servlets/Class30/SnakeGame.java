import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;

public class SnakeGame extends JFrame {
    private static final long serialVersionUID = 1L;

    private ArrayList<Point> snake;
    private final int DOT_SIZE = 10;
    private final int ALL_DOTS = 900;
    private int dots;
    private Point food;

    public SnakeGame() {
        snake = new ArrayList<Point>();
        dots = 3;
        for (int i = 0; i < dots; i++) {
            snake.add(new Point(i * DOT_SIZE, 0));
        }
        locateFood();
        setTitle("Snake Game");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void locateFood() {
        food = new Point((int)(Math.random() * 28 + 1) * DOT_SIZE, 
                        (int)(Math.random() * 28 + 1) * DOT_SIZE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.YELLOW);
        for (Point p : snake) {
            g.fillRect(p.x, p.y, DOT_SIZE, DOT_SIZE);
        }
        g.setColor(Color.RED);
        g.fillRect(food.x, food.y, DOT_SIZE, DOT_SIZE);
    }

    public static void main(String[] args) {
        SnakeGame snakeGame = new SnakeGame();
        snakeGame.setVisible(true);
    }
}
