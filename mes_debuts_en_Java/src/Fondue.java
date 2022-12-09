
import java.util.Scanner;

public class Fondue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int BASE = 4;
		double fromage = 800.0;
		double eau = 2.0; // en Décilitres
		double ail = 2.0;
		double pain = 400.0; // Quantité de pain nécessaires en grammes
		
		System.out.println("Entrez votre nombre de convives svp :");
		 int nbConvive = scanner.nextInt();
		
		//Adaptation des quantités
		 
		 double nouvfromage = fromage*nbConvive/BASE;
		 double nouvEau = eau*nbConvive/BASE;
		 double nouvAil = ail*nbConvive/BASE;
		 double nouvPain = pain*nbConvive/BASE;
		 
		 System.out.println(" Pour faire une fondue fribourgeoise pour" + nbConvive + "personnes, il vous faut :");
		 
		 System.out.println(" - "+nouvfromage+ "gr de Vacherin fribourgeois");
		 System.out.println("-"+ nouvEau + "dl d'eau");
		 System.out.println(" - "+ nouvAil + "gousse(s) d'ail" );
		 System.out.println("- "+ nouvPain + "gr de pain");
		 System.out.println(" - du poivre à volonté ");
		 System.out.println("Merci pour votre fidélité ...");
		 

	}

}
