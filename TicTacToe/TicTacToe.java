package CasualGame.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    Scanner myScanner = new Scanner(System.in);
    Random random = new Random();
    public boolean messagepresentation() {

        boolean hardMode = false;
        char input;
        char[][] helpboard = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'}};

        System.out.println("welcome to this tic tac toe game!");
        System.out.println("location of the buttons");


        System.out.println(helpboard[0][0] + "|" + helpboard[0][1] + "|" + helpboard[0][2]);
        System.out.println("-+-+-");
        System.out.println(helpboard[1][0] + "|" + helpboard[1][1] + "|" + helpboard[1][2]);
        System.out.println("-+-+-");
        System.out.println(helpboard[2][0] + "|" + helpboard[2][1] + "|" + helpboard[2][2]);

        System.out.println("Hard mode?");
        input = myScanner.next().charAt(0);
        if (input == 'y' || input == 'Y')
            hardMode = true;

        return hardMode;
    }

    public void helpGame(){

        System.out.println("There is the 'help board' :");
        char[][] helpboard = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'}};

        System.out.println(helpboard[0][0] + "|" + helpboard[0][1] + "|" + helpboard[0][2]);
        System.out.println("-+-+-");
        System.out.println(helpboard[1][0] + "|" + helpboard[1][1] + "|" + helpboard[1][2]);
        System.out.println("-+-+-");
        System.out.println(helpboard[2][0] + "|" + helpboard[2][1] + "|" + helpboard[2][2]);
    }

    public boolean endGame(char[][] board) {
        boolean victory = false;

        if (board[0][0] == board[0][1] && board[0][0] == board[0][2]) {
            if (!(board[0][0] == ' ')) {
                victory = true;
            }
        }
        if (board[1][0] == board[1][1] && board[1][0] == board[1][2]) {
            if (!(board[1][0] == ' ')) {
                victory = true;
            }
        }
        if (board[2][0] == board[2][1] && board[2][0] == board[2][2]) {
            if (!(board[2][0] == ' ')) {
                victory = true;
            }
        }
        if (board[0][0] == board[1][0] && board[0][0] == board[2][0]) {
            if (!(board[0][0] == ' ')) {
                victory = true;
            }
        }
        if (board[0][1] == board[1][1] && board[0][1] == board[2][1]) {
            if (!(board[0][1] == ' ')) {
                victory = true;
            }
        }
        if (board[0][2] == board[1][2] && board[0][2] == board[2][2]) {
            if (!(board[0][2] == ' ')) {
                victory = true;
            }
        }
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            if (!(board[0][0] == ' ')) {
                victory = true;
            }
        }
        if (board[0][2] == board[1][1] && board[2][0] == board[1][1]) {
            if (!(board[0][2] == ' '))
                victory = true;
        }
        return victory;
    }

    public char[][] tour(int input, char[][] board, boolean player) {

        char marque;
        if (player)
            marque = 'X';
        else
            marque = 'O';

        boolean inputOk = false;

        while (!inputOk) {
            switch (input) {
                case 1:
                    if (board[0][0] == ' ') {
                        board[0][0] = marque;
                        inputOk = true;
                    }
                    else
                        continue;
                    break;
                case 2:
                    if (board[0][1] == ' ') {
                        board[0][1] = marque;
                        inputOk = true;
                    }
                    break;
                case 3:
                    if (board[0][2] == ' ') {
                        board[0][2] = marque;
                        inputOk = true;
                    }

                    break;
                case 4:
                    if (board[1][0] == ' ') {
                        board[1][0] = marque;
                        inputOk = true;
                    }

                    break;
                case 5:
                    if (board[1][1] == ' ') {
                        board[1][1] = marque;
                        inputOk = true;
                    }
                    break;
                case 6:
                    if (board[1][2] == ' ') {
                        board[1][2] = marque;
                        inputOk = true;
                    }
                    break;
                case 7:
                    if (board[2][0] == ' ') {
                        board[2][0] = marque;
                        inputOk = true;
                    }
                    break;
                case 8:
                    if (board[2][1] == ' ') {
                        board[2][1] = marque;
                        inputOk = true;
                    }

                    break;
                case 9:
                    if (board[2][2] == ' ') {
                        board[2][2] = marque;
                        inputOk = true;
                    }

            }
        }
        return board;
    }

    public void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
    
    public boolean change(boolean player){
        if (player)
            player = false;
        else 
            player = true;
        return player;
    }

    public boolean checkempty(int input, char[][] board){

        boolean empty = false;
        switch (input){
            case 1:
                if (board[0][0] == ' ') {
                    empty = true;
                }
                break;
            case 2:
                if (board[0][1] == ' ') {
                    empty = true;
                }
                break;
            case 3:
                if (board[0][2] == ' ') {
                    empty = true;
                }
                break;
            case 4:
                if (board[1][0] == ' ') {
                    empty = true;
                }

                break;
            case 5:
                if (board[1][1] == ' ') {
                    empty = true;
                }
                break;
            case 6:
                if (board[1][2] == ' ') {
                    empty = true;
                }
                break;
            case 7:
                if (board[2][0] == ' ') {
                    empty = true;
                }
                break;
            case 8:
                if (board[2][1] == ' ') {
                    empty = true;
                }

                break;
            case 9:
                if (board[2][2] == ' ') {
                    empty = true;
                }
        }
        return empty;
    }

    public boolean whoWins(boolean a){
            boolean score;
        if (a) {
            System.out.println("you wins");
            score = true;
        }
        else {
            System.out.println("you loses");
            score = false;
        }
        return score;
    }

    public boolean tryAgain(){
        boolean again = false;
        char input;
        System.out.println("Again?");
        input = myScanner.next().charAt(0);
        if (input == 'y' || input == 'Y')
            again = true;
        return again;
    }

    public char[][] boardEmpty(char[][] board){
        for(int i = 0; i <=2; i++) {
            for (int j = 0; j <= 2; j++)
                board[i][j] = ' ';
        }
        return board;
    }

    public void endMessage(int scoreH, int scoreO){
        System.out.println();
        System.out.println("Final result : \nHumain: " + scoreH + " - " + scoreO + " Ordi");
        if (scoreH > scoreO)
            System.out.println("You're de big winner");
        else if (scoreH < scoreO)
            System.out.println("You're de big looser");
        else
            System.out.println("Ex aequo ");
        System.out.println("Thanks for playing");
    }

    public int inputHumain(){
        int input = 0;
        System.out.println("enter a number between 0 and 9 and not yet played");
        do {
            if (input < 0 || input > 9)
                System.out.println("enter a number between 0 and 9");
            else
                System.out.println("Your turn : ");
            while (!myScanner.hasNextInt()) {
                System.out.println("enter a integer");
                myScanner.next();
            }
            input = myScanner.nextInt();
       }while (input < 0 || input > 9);
        return input;
    }
    
    public int inputOrdi (char[][] board){
       
        int ordiInput = 0;

        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == ' ')
            ordiInput = 3;
        else if (board[0][1] == 'O' && board[0][2] == 'O' && board[0][0] == ' ')
            ordiInput = 1;
        else if (board[0][0] == 'O' && board[0][2] == 'O' && board[0][1] == ' ')
            ordiInput = 2;

        else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == ' ')
            ordiInput = 6;
        else if (board[1][1] == 'O' && board[1][2] == 'O' && board[1][0] == ' ')
            ordiInput = 4;
        else if (board[1][0] == 'O' && board[1][2] == 'O' && board[1][1] == ' ')
            ordiInput = 5;

        else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == ' ')
            ordiInput = 9;
        else if (board[2][1] == 'O' && board[2][2] == 'O' && board[2][0] == ' ')
            ordiInput = 7;
        else if (board[2][0] == 'O' && board[2][2] == 'O' && board[2][1] == ' ')
            ordiInput = 8;

        else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == ' ')
            ordiInput = 7;
        else if (board[1][0] == 'O' && board[2][0] == 'O' && board[0][0] == ' ')
            ordiInput = 1;
        else if (board[0][0] == 'O' && board[2][0] == 'O' && board[1][0] == ' ')
            ordiInput = 4;

        else if (board[1][1] == 'O' && board[0][1] == 'O' && board[2][1] == ' ')
            ordiInput = 8;
        else if (board[1][1] == 'O' && board[2][1] == 'O' && board[0][1] == ' ')
            ordiInput = 2;
        else if (board[0][1] == 'O' && board[2][1] == 'O' && board[1][1] == ' ')
            ordiInput = 5;

        else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == ' ')
            ordiInput = 9;
        else if (board[1][2] == 'O' && board[2][2] == 'O' && board[0][2] == ' ')
            ordiInput = 3;
        else if (board[0][2] == 'O' && board[2][2] == 'O' && board[1][2] == ' ')
            ordiInput = 6;

        else if (board[1][1] == 'O' && board[2][2] == 'O' && board[0][0] == ' ')
            ordiInput = 1;
        else if (board[0][0] == 'O' && board[2][2] == 'O' && board[1][1] == ' ')
            ordiInput = 5;
        else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == ' ')
            ordiInput = 9;

        else if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == ' ')
            ordiInput = 3;
        else if (board[2][0] == 'O' && board[0][2] == 'O' && board[1][1] == ' ')
            ordiInput = 5;
        else if (board[1][1] == 'O' && board[0][2] == 'O' && board[2][0] == ' ')
            ordiInput = 7;


        else if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == ' ')
            ordiInput = 3;
        else if (board[0][1] == 'X' && board[0][2] == 'X' && board[0][0] == ' ')
            ordiInput = 1;
        else if (board[0][0] == 'X' && board[0][2] == 'X' && board[0][1] == ' ')
            ordiInput = 2;

        else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == ' ')
            ordiInput = 6;
        else if (board[1][1] == 'X' && board[1][2] == 'X' && board[1][0] == ' ')
            ordiInput = 4;
        else if (board[1][0] == 'X' && board[1][2] == 'X' && board[1][1] == ' ')
            ordiInput = 5;

        else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == ' ')
            ordiInput = 9;
        else if (board[2][1] == 'X' && board[2][2] == 'X' && board[2][0] == ' ')
            ordiInput = 7;
        else if (board[2][0] == 'X' && board[2][2] == 'X' && board[2][1] == ' ')
            ordiInput = 8;

        else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == ' ')
            ordiInput = 7;
        else if (board[1][0] == 'X' && board[2][0] == 'X' && board[0][0] == ' ')
            ordiInput = 1;
        else if (board[0][0] == 'X' && board[2][0] == 'X' && board[1][0] == ' ')
            ordiInput = 4;

        else if (board[1][1] == 'X' && board[0][1] == 'X' && board[2][1] == ' ')
            ordiInput = 8;
        else if (board[1][1] == 'X' && board[2][1] == 'X' && board[0][1] == ' ')
            ordiInput = 2;
        else if (board[0][1] == 'X' && board[2][1] == 'X' && board[1][1] == ' ')
            ordiInput = 5;

        else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == ' ')
            ordiInput = 9;
        else if (board[1][2] == 'X' && board[2][2] == 'X' && board[0][2] == ' ')
            ordiInput = 3;
        else if (board[0][2] == 'X' && board[2][2] == 'X' && board[1][2] == ' ')
            ordiInput = 6;

        else if (board[1][1] == 'X' && board[2][2] == 'X' && board[0][0] == ' ')
            ordiInput = 1;
        else if (board[0][0] == 'X' && board[2][2] == 'X' && board[1][1] == ' ')
            ordiInput = 5;
        else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == ' ')
            ordiInput = 9;

        else if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == ' ')
            ordiInput = 3;
        else if (board[2][0] == 'X' && board[0][2] == 'X' && board[1][1] == ' ')
            ordiInput = 5;
        else if (board[1][1] == 'X' && board[0][2] == 'X' && board[2][0] == ' ')
            ordiInput = 7;
        
        else 
            ordiInput = random.nextInt(1,10);
        
        return ordiInput;
    }
}





