package CasualGame.Snake;
import javax.swing.*;
import java.awt.*;

public class App {

    public static void main(String[] args) throws Exception{
        int boardWidth = 600;
        int boardHeight = boardWidth;


        JFrame frame = new JFrame("Snake");
        frame.setSize(boardWidth,boardHeight);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();


    }
}
