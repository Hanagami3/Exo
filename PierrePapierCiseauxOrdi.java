package nicoExo;

public class PierrePapierCiseauxOrdi {
	
	public static void main(String [] argument) {
		
		int bot1;
		int bot2;
		
		int score1 = 0;
		int score2 = 0;
		
		System.out.println("Début match!");
		for(int i = 1; i <= 3; i++) {
			
			
			System.out.println("Partie #" + i);
			
			bot1 = (int) (3*Math.random()+1);
			switch (bot1) {
				case 1 :System.out.println("Bot1 joue : pierre");
				break;
				case 2 : System.out.println("Bot1 joue : feuille");
				break;
				case 3 : System.out.println("Bot1 joue : ciseaux");
				break;
			}
			bot2 = (int) (3*Math.random()+1);
			switch (bot2) {
				case 1 :System.out.println("Bot2 joue : pierre");
				break;
				case 2 : System.out.println("Bot2 joue : feuille");
				break;
				case 3 : System.out.println("Bot2 joue : ciseaux");
				break;
			}
			
			if (bot1 == 1 && bot2 == 2) {
				score2++;
				System.out.println("Bot2 gagne la partie");
			}
			else if(bot1 == 1 && bot2 == 3) {
				score1++;
				System.out.println("Bot1 gagne la partie");
			}
			else if(bot1 == 2 && bot2 == 1) {
				score1++;
				System.out.println("Bot1 gagne la partie");
			}
			else if(bot1 == 2 && bot2 == 3) {
				score2++;
				System.out.println("Bot2 gagne la partie");
			}
			else if(bot1 == 3 && bot2 == 1) {
				score2++;
				System.out.println("Bot2 gagne la partie");
			}
			else if(bot1 == 3 && bot2 == 2) {
				score1++;
				System.out.println("Bot1 gagne la partie");
			}
			else System.out.println("Partie Exequo");
			
			System.out.println("Score : bot1 " + score1 + " - " + score2 + " bot2");
		}
		
		System.out.println("Resultat final : bot1 " + score1 + " - " + score2 + " bot2");
		
		if (score1 > score2)
			System.out.println("Bot1 gagne le match");
		else if (score1 < score2)
			System.out.println("Bot2 gagne le match");
		else System.out.println("Match Exequo");
	}

}
