package CasualGame.Snake;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {

    private class Tile {
        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    ArrayList<Integer> snakeSizeX = new ArrayList<>(Arrays.asList());
    ArrayList<Integer> snakeSizeY = new ArrayList<>(Arrays.asList());


    int boardWidth;
    int boardHeight;
    int tileSize = 25;
    //Snake
    Tile snakeHead;
    ArrayList<Tile> snakeBody;
    //Apple
    Tile apple;
    Tile goldApple;
    Tile blueApple;
    Random random;

    //game logic
    Timer gameloop;
    float velocityX;
    float velocityY;
    int delay;
    int score = 0;
    boolean gameOver = false;

    public SnakeGame(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.BLACK);
        addKeyListener(this);
        setFocusable(true);

        snakeHead = new Tile(5, 5);
        snakeBody = new ArrayList<Tile>();

        apple = new Tile(10, 10);
        goldApple = new Tile(-1*tileSize,-1*tileSize);
        blueApple = new Tile(-1*tileSize,-1*tileSize);

        random = new Random();
        placefood();

        velocityX = 1f;
        velocityY = 0f;
        delay = 150;

        gameloop = new Timer(delay, this);
        gameloop.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {

        //grid
        /*
        for (int i = 0; i < boardWidth / tileSize; i++) {
            g.drawLine(i * tileSize, 0, i * tileSize, boardHeight);
            g.drawLine(0, i * tileSize, boardWidth, i * tileSize);
        }*/

        //Apple
        //Apple
        g.setColor(Color.RED);
        //g.fillRect(appel.x * tileSize, appel.y * tileSize, tileSize, tileSize);
        g.fill3DRect(apple.x * tileSize, apple.y * tileSize, tileSize, tileSize, true);

        //Gold Apple
        g. setColor(Color.YELLOW);
        //g.fillRect(goldApple.x * tileSize, goldApple.y * tileSize, tileSize, tileSize);
        g.fill3DRect(goldApple.x * tileSize, goldApple.y * tileSize, tileSize, tileSize, true);

        //Blue Apple
        g. setColor(Color.BLUE);
        //g.fillRect(blueApple.x * tileSize, blueApple.y * tileSize, tileSize, tileSize);
        g.fill3DRect(blueApple.x * tileSize, blueApple.y * tileSize, tileSize, tileSize, true);

        //Snake head
        g.setColor(Color.GREEN);
        //g.fillRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize);
        g.fill3DRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize,true);

        //Snake Body
        for (int i = 0; i < snakeBody.size(); i++) {
            Tile snakePart = snakeBody.get(i);
            //g.fillRect(snakePart.x * tileSize, snakePart.y * tileSize, tileSize, tileSize);
            g.fill3DRect(snakePart.x * tileSize, snakePart.y * tileSize, tileSize, tileSize, true);

        }
        //delay
        g.setColor(Color.WHITE);
        g.drawString("" + snakeBody.size(),0,50);

        //Score
        g.setColor(Color.YELLOW);
        g.drawString("Score: " + score, 6, 15);
        //Game over
        g.setFont((new Font("Arial", Font.PLAIN, 25)));
        if (gameOver) {
            g.setColor(Color.BLUE);
            g.drawString("Game Over!!!",9 * tileSize, 12*tileSize);
            g.drawString(" Je eet " + String.valueOf(snakeBody.size()) + " appelen.", 8*tileSize, 14*tileSize);
        }
    }

    public void placefood() {
        apple.x = random.nextInt(boardWidth / tileSize); //600/25 = 24
        apple.y = random.nextInt(boardWidth / tileSize);

        if (snakeBody.size() % 3 == 2) {
            goldApple.x = random.nextInt(boardWidth / tileSize);
            goldApple.y = random.nextInt(boardWidth / tileSize);
        }
        if (snakeBody.size() % 5 == 4){
            blueApple.x = random.nextInt(boardWidth / tileSize);
            blueApple.y = random.nextInt(boardWidth / tileSize);
        }
    }

    public void move() {
        //eat food
        if (collision(snakeHead, apple)) {
            snakeBody.add(new Tile(apple.x, apple.y));
            placefood();
            score += 100;
        }
        if (collision(snakeHead, goldApple)){
            goldApple = new Tile(-1*tileSize,-1*tileSize);
            score += 250;
        }
        if (collision(snakeHead,blueApple)) {
            blueApple = new Tile(-1 * tileSize, -1 * tileSize);
            snakeBody.add(new Tile(apple.x, apple.y));
            snakeBody.add(new Tile(apple.x, apple.y));
            score -= 50;
        }
        //Snake Body
        for (int i = snakeBody.size() - 1; i >= 0; i--) {
            Tile snakePart = snakeBody.get(i);
            if (i == 0) {
                snakePart.x = snakeHead.x;
                snakePart.y = snakeHead.y;
            } else {
                Tile prevSnakePart = snakeBody.get(i - 1);
                snakePart.x = prevSnakePart.x;
                snakePart.y = prevSnakePart.y;
            }
        }
        // Snake Head
        snakeHead.x += velocityX;
        snakeHead.y += velocityY;

        if (snakeHead.x == -1)
            snakeHead.x = boardWidth/tileSize -1;
        else if (snakeHead.x == boardWidth/tileSize)
            snakeHead.x = 0;
        else if (snakeHead.y == -1)
            snakeHead.y = boardHeight/tileSize -1;
        else if (snakeHead.y == boardHeight/tileSize)
            snakeHead.y = 0;

        // game over conditions
        for (int i = 0; i < snakeBody.size(); i++){
            Tile snakePart = snakeBody.get(i);
            if (collision(snakeHead, snakePart)){
                gameOver = true;
            }
        }

        /*
        if (snakeHead.x*tileSize < 0 || snakeHead.x*tileSize > boardWidth ||
            snakeHead.y*tileSize < 0 || snakeHead.y*tileSize > boardHeight)
                gameOver = true;*/

}
    public boolean collision(Tile tile1, Tile tile2){
        return tile1.x == tile2.x && tile1.y == tile2.y;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
        if (gameOver){
            gameloop.stop();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (velocityY != 1)
            if (e.getKeyCode() == KeyEvent.VK_UP){
                velocityX = 0;
                velocityY = -1;
            }
        if (velocityY != -1)
            if (e.getKeyCode() == KeyEvent.VK_DOWN){
                velocityX = 0;
                velocityY = 1;
            }
        if (velocityX != -1)
            if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                velocityX = 1;
                velocityY = 0;
            }
        if (velocityX != 1)
            if (e.getKeyCode() == KeyEvent.VK_LEFT){
                velocityX = -1;
                velocityY = 0;
            }

    }

    //not need
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
