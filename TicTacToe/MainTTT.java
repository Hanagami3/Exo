package CasualGame.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class MainTTT {

    public static void main(String[] args) {

        Random myrandom = new Random();
        Scanner myscanner = new Scanner(System.in);
        TicTacToe ticTacToe = new TicTacToe();

        char[][] board = {{' ',' ',' '},
                          {' ',' ',' '},
                          {' ',' ',' '}};
        int input;
        boolean whoPlays = false; //true = human
        boolean iA;
        int scoreH = 0;
        int scoreO = 0;
        int game = 0;

        iA = ticTacToe.messagepresentation();
        do {
            input = 10;
            game++;
            System.out.println("game n°" + game);
            ticTacToe.boardEmpty(board);
            for (int i = 0; i < 9; i++) {
                whoPlays = ticTacToe.change(whoPlays);
               while (!ticTacToe.checkempty(input, board)) {
                    if (whoPlays) {
                        input = ticTacToe.inputHumain();
                        if (input == 0) {
                            ticTacToe.helpGame();
                        }
                    } else {
                        if (iA)
                            input = ticTacToe.inputOrdi(board);
                        else
                            input = myrandom.nextInt(1,10);
                    }
               }
                if (!whoPlays)
                    System.out.println("computer turn : \n" + input);
                board = ticTacToe.tour(input, board, whoPlays);
                ticTacToe.printBoard(board);

                if (ticTacToe.endGame(board)) {
                    if (ticTacToe.whoWins(whoPlays))
                        scoreH++;
                    else
                        scoreO++;
                    break;
                }
                if (i == 8)
                    System.out.println("Ex aequo");
            }
            System.out.println("Humain: " + scoreH + " - " + scoreO + " ordi");
        }while (ticTacToe.tryAgain());

        ticTacToe.endMessage(scoreH, scoreO);

    }
}
