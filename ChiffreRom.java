import java.util.*;

public class ChiffreRom {

    public static void main(String [] argument) {

        int i = 1, v = 5, x = 10, l = 50, c = 100, d = 500, m = 1000;

        String nombre;

        Scanner lectureClavier = new Scanner (System.in);

        System.out.print("Saisir un bombre romain : ");
        nombre = lectureClavier.next();


        int resultat = 0;
        char cara1;
        String cara2;

        for (int j = 0; j < nombre.length(); j++) {
            cara1 = nombre.charAt(j);
            cara2 = "O";
            System.out.println(nombre.length());
            System.out.println(j+2);

            if (nombre.length() >= j+2) {
                cara2 = nombre.substring(j+1,j+2);
                System.out.println(nombre.substring(j+1,j+2));}
            switch (cara1) {
                case 'I' :
                    switch (cara2) {
                        case "V" : resultat = resultat - i;
                            break;
                        case "X" : resultat = resultat - i;
                            break;
                        default : resultat = resultat + i;
                    }
                    break;
                case 'V' : resultat = resultat + v;
                    break;
                case 'X' :
                    switch (cara2) {
                        case "L" : resultat = resultat - x;
                            break;
                        case "C" : resultat = resultat - x;
                            break;
                        default : resultat = resultat + x;
                    }
                    break;
                case 'L' : resultat = resultat + l;
                    break;
                case 'C' :
                    switch (cara2) {
                        case "D" : resultat = resultat - c;
                            break;
                        case "M" : resultat = resultat - c;
                            break;
                        default : resultat = resultat + c;
                    }
                    break;
                case 'D' : resultat = resultat + d;
                    break;
                case 'M' : resultat = resultat + m;
                    break;
                default : resultat = resultat + 0;

            }

        }
        System.out.print(resultat);

    }

}
