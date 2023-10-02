package be.brussel.Opdracht2;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerApp {

    public static void main(String[] args) {

        int guessedNumber = 1;
        int randomNumber;
        boolean doesNotMatch = true;

        Scanner myScanner = new Scanner(System.in);
        Random myRandom = new Random();
        randomNumber = myRandom.nextInt(100);

        System.out.println("Welcome to Higher Lower App");
        System.out.println();

        while(doesNotMatch){

            do {
                if (guessedNumber < 1 || guessedNumber > 99)
                    System.out.println("Voer een nummer tussen 1 en 99 in");
                else
                    System.out.print("Guess the number : ");
                while (!myScanner.hasNextInt()) {
                    System.out.println("Enter an integer");
                    myScanner.next();
                }
                guessedNumber = myScanner.nextInt();
            }while(guessedNumber < 1 || guessedNumber > 99);
                if (guessedNumber < randomNumber)
                    System.out.println("Higher");
                else if (guessedNumber > randomNumber)
                    System.out.println("Lower");
                else {
                    System.out.println("Congrats!");
                    doesNotMatch = false;
                }

        }
        System.out.println();
        System.out.println("Thank you for choosing our app.");

    }
}
