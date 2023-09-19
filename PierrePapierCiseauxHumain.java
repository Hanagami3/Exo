package nicoExo;

import java.util.*;

public class PierrePapierCiseauxHumain {
	
	public static void main(String [] argument) {
		
		Scanner lectureClavier = new Scanner(System.in);
		
		int bot;
		int humain = 0;
		int partie = 1;
		
		String saisie = "";
		boolean sortie = true;
		
		int score1 = 0;
		int score2 = 0;
		
		System.out.println("Début match!");
		
		do {
			System.out.println();
			System.out.println("Partie #" + partie);
			System.out.print("Choississez et appuyez sur Entrer : ");
			saisie = lectureClavier.next();
			
			bot = (int) (3*Math.random()+1);
		
			
			
			switch (saisie) {
				case "pierre" :
					System.out.println("Humain joue : pierre");
					humain = 1;
					if(bot == 2) {
						score1++;
						System.out.println("Bot joue : feuille");
						System.out.println("Bot gagne la partie");
					}
					else if (bot == 3) {
						score2++;
						System.out.println("Bot joue : ciseaux");
						System.out.println("Humain gagne la partie");
					}
					else System.out.println("Partie Exequo");
				break;
				case "feuille" : 
					System.out.println("Humain joue : feuille");
					humain = 2;
						if (bot == 1) {
							score2++;
							System.out.println("Bot joue : pierre");
							System.out.println("Humain gagne la partie");
						}
						else if (bot == 3) {
							score1++;
							System.out.println("Bot joue : ciseaux");
							System.out.println("Bot gagne la partie");
						}
						else System.out.println("Partie Exequo");
				break;
				case "ciseaux" : 
					System.out.println("Humain joue : ciseaux");
					humain = 3;
					if(bot == 1) {
						score1++;
						System.out.println("Bot joue : pierre");
						System.out.println("Bot gagne la partie");
					}
					else if (bot == 2) {
						score2++;
						System.out.println("Bot joue : feuille");
						System.out.println("Humain gagne la partie");
					}
					else System.out.println("Partie Exequo");
				break;
				case "exit" : 
					System.out.println("Fin du match");
					sortie = false;
				break;
				default : System.out.println("Mauvaise saisie");
			}
			System.out.println("Score : Humain " + score2 + " - " + score1 + " Bot");
			partie++;
		}while (sortie == true);
		
		System.out.println();
		System.out.println("Resultat final : Humain " + score2 + " - " + score1 + " Bot");
		
		if (score1 > score2)
			System.out.println("Bot gagne le match");
		else if (score1 < score2)
			System.out.println("Humain gagne le match");
		else System.out.println("Match Exequo");
	
	}

}
