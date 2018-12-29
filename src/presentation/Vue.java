package presentation;

import model.Joueur;
import presentation.Utilisation;
import presentation.Vue;


public class Vue {

	
	/**
	 * D�marrage du jeu par le joueur numero n
	 */
	public static void messageBienvenueDuJoueur(int numeroJoueur){
		System.out.println("Bienvenue dans le jeu Magic Word. \n"
				+ "Vous �tes le joueur "+numeroJoueur+".\n"
						+ "Dans un premier temps, vous allez "
						+ "d�finir les caract�ristiques de votre personnage. \n"
						+ "Attention : le total force + agilit� + "
						+ "intelligence doit �tre �gal au niveau du joueur. \n" 
						+ "Veuillez appuyer la touche \"Entr�e\" pour d�marrer le jeu.");
	Utilisation.sc.nextLine();
	}

	/**
	 * choix des caract�ristiques du joueur. 
	 */
	public static void choixPersonnageJoueur(){
	int[] tabJoueur = {Joueur.JOUEUR1, Joueur.JOUEUR2};
	Utilisation choixJoueur = new Utilisation();
	
	for (int i : tabJoueur) { // On fait une loop pour chaque joueur
		messageBienvenueDuJoueur(i);
		choixJoueur.choixClassePersonnage(i); // le choix de la classe d�bouche sur le choix des autres caract�ristiques du joueur
//		choixJoueur.choixNiveauPersonnage(i);
//		choixJoueur.choixForcePersonnage(i);		
	}
	}
	
}
