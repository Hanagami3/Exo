package be.brussel.les6.Opdracht3;

import java.util.Scanner;

public class Oefening1 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String usernaam;
        int index = 2;

        System.out.println("Hallo! Je koos de optie om je usernaam te veranderen.");
        System.out.print("Je kan je nieuwe usernaam invoeren : ");
        usernaam = myScanner.nextLine();
        while(usernaam.toUpperCase().contains("GORI") || usernaam.toUpperCase().contains("HARAMBE")){
            System.out.println("Het is niet een goed usernaam! ");
            System.out.println("Je hebt nog " + index + " pogingen! Je moet opnieuw proberen : ");
            usernaam = myScanner.nextLine();

            index--;
            if (index < 1) {
                System.out.println("Sorry, je bent verbannen");
                System.exit(0);
            }
        }
            System.out.println("Proficiat, heb je je usernaam veranderd. Nu is het : " + usernaam);


    }
}
