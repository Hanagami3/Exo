package be.brussel.Opdracht2;

import java.security.PrivateKey;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class ElektriciteitApp {

    public static void main(String[] args) {

        Boolean eenKeer;
        String number = "0123456789";
        char yesOfNo = ' ';
        char yesOfNo2 = ' ';
        byte hoeveelHuizen = 1;
        String verbruikerNaam = " ";
        ArrayList<String> verbruikerNaamList = new ArrayList<String>();
        int wattPerUur = 0;
        int uurPerDag = 0;
        ArrayList<Float> uurPerDagList = new ArrayList<Float>();
        int dagenPerMaand = 0;
        ArrayList<Float> dagenPerList = new ArrayList<Float>();
        float eenheidprijs = 0F;

        Scanner myScanner = new Scanner(System.in);


        System.out.println("Welcome to the Elektriciteit App");
        System.out.println("De doel van Elektriciteitrekening is ");
        System.out.println();

        System.out.println("Do you want to make calculations for more than one house?");

        do {
            System.out.print("Y/N : ");
            yesOfNo = myScanner.next().charAt(0);
            if (checkIfYesNo(yesOfNo))
                System.out.print("verkeerde invoer! opnieuw geprobeerd : ");
        }while (checkIfYesNo(yesOfNo));

            System.out.println();
            if (checkYesOrNO(yesOfNo)) {
                do {
                    if (hoeveelHuizen < 1)
                        System.out.println("Geen negatief nummer!");
                    else
                        System.out.print("Voor hoeveel huizen : ");
                    while (!myScanner.hasNextInt()) {
                        System.out.println("Voer een geheel getal in!");
                        myScanner.next();
                    }
                    hoeveelHuizen = myScanner.nextByte();

                }while (hoeveelHuizen < 1);
            }
            for (int i = 0; i < hoeveelHuizen; i++) {
                if (i == 0 ) {
                    System.out.print("Naam van de verbruiker: ");
                    verbruikerNaam = myScanner.nextLine();
                    verbruikerNaamList.add(verbruikerNaam);
                }
                else {
                System.out.println("Het nieuw huis heeft dezelfde eigennar?");
                while(checkIfYesNo(yesOfNo2)) {
                    System.out.print("Y/N : ");
                    yesOfNo2 = myScanner.next().charAt(0);
                    if (checkIfYesNo(yesOfNo2))
                        System.out.println("verkeerde invoer! opnieuw geprobeerd!");
                    else
                        if(!checkYesOrNO(yesOfNo2)){
                            System.out.println("Naam van de verbruiker: ");
                            verbruikerNaam = myScanner.next();
                            verbruikerNaamList.add(verbruikerNaam);
                        }
                    }
                }
                do {
                    if (wattPerUur < 0)
                        System.out.println("Geen negatief nummer!");
                    else
                        System.out.println("Vermogen in watt per uur: ");
                    while (!myScanner.hasNextInt()) {
                        System.out.println("Voer een geheel getal in!");
                        myScanner.next();
                    }
                    wattPerUur = myScanner.nextInt();
                }while (wattPerUur < 0);
                do {
                    if (uurPerDag < 0 || uurPerDag > 24)
                        System.out.println("Voer een nummer tussen 0 en 24 in");
                    else
                        System.out.println("Aantal uren per dag dat electricitait wordt gebruikt: ");
                        while (!myScanner.hasNextInt()) {
                            System.out.println("Voer een geheel getal in!");
                            myScanner.next();
                        }
                    uurPerDag = myScanner.nextInt();
                    }while(uurPerDag < 0 || uurPerDag > 24);

                do {
                    if (dagenPerMaand < 0 ||  dagenPerMaand > 31)
                        System.out.println("Voer een nummer tussen 0 en 31 in");
                    else
                        System.out.println("Aantal dagen per maand waarop electricitait wordt gebruikt: ");
                    while (!myScanner.hasNextInt()) {
                        System.out.println("Voer een geheel getal in!");
                        myScanner.next();
                    }
                    dagenPerMaand = myScanner.nextInt();
                }while( dagenPerMaand < 0 ||  dagenPerMaand > 31);

                do {
                    if (eenheidprijs < 0)
                        System.out.println("Geen negatief nummer!");
                    else
                        System.out.println("Eenheidsprijs voor elektriciteit: ");
                    while (!myScanner.hasNextFloat()) {
                        System.out.println("please enter a float");
                        myScanner.next();
                    }
                    eenheidprijs = myScanner.nextFloat();
                }while (eenheidprijs < 0);

            }


        System.out.println();
        System.out.println(verbruikerNaamList);
        System.out.println("Thank you om our app te kiezen.");
    }

    private static boolean checkIfYesNo(char a){

        boolean ok;
        if (a != 'Y' && a != 'N' &&
                a != 'y' && a != 'n')
            ok = true;
        else
            ok = false;
        return ok;
    }

    private static boolean checkYesOrNO(char a){
        boolean ok;
        if (a == 'Y' || a == 'y')
            ok = true;
        else
            ok = false;
        return ok;
    }




}
