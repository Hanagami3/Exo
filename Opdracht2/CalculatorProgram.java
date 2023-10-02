package be.brussel.Opdracht2;

import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {

        byte age = 0;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to age calculator program");
        System.out.print("Write the age :");

        if (myScanner.hasNextByte()) {
            age = myScanner.nextByte();
            if (age < 0 )
                System.out.println("Age can be not negative");
            else if (age < 2)
                System.out.println("Your are a baby");
            else if (age < 10)
                System.out.println("You are a child");
            else if (age < 18)
                System.out.println("You are a teenager");
            else
                System.out.println("You are a adult");
        }
        else
            System.out.println("Wrong input! Enter a valid age!" );

        System.out.println();
        System.out.println("Thank tou for using this program.");
    }
}
