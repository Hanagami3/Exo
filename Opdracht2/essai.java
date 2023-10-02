package be.brussel.Opdracht2;

import java.util.Scanner;

public class essai {

    public static void main(String[] args) {

        Scanner keyboardReader = new Scanner(System.in);

        System.out.print("Enter a number:  ");
        //loop to check if the input is indeed an integer
        while (!keyboardReader.hasNextInt()) {
            System.out.print("Please enter an integer: ");
            keyboardReader.next();
        }
        int number = keyboardReader.nextInt();
        System.out.println(number);
    }
}