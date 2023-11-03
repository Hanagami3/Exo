package CasualGame.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TicTacToeGame extends JPanel implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel titlePanel = new JPanel();
    JPanel buttonPanel = new  JPanel();
    JLabel textefield = new JLabel();
    JButton[] buttons = new JButton[9];


    TicTacToeGame(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textefield.setBackground(new Color(25,25,25));
        textefield.setForeground(new Color(25,255,0));
        textefield.setFont(new Font("Ink Free", Font.BOLD,75));
        textefield.setHorizontalAlignment(JLabel.CENTER);
        textefield.setText("Tic-Tac-Toe");
        textefield.setOpaque(true);

        titlePanel.setLayout(new BorderLayout());
        titlePanel.setBounds(0,0,300, 50);

        titlePanel.add(textefield);
        frame.add(titlePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
