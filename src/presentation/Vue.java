package presentation;

import model.Joueur;
import presentation.Utilisation;
import presentation.Vue;


public class Vue {

	
	/**
	 * Démarrage du jeu par le joueur numero n
	 */
	public static void messageBienvenueDuJoueur(int numeroJoueur){
		System.out.println("Bienvenue dans le jeu Magic Word. \n"
				+ "Vous êtes le joueur "+numeroJoueur+".\n"
						+ "Dans un premier temps, vous allez "
						+ "définir les caractéristiques de votre personnage. \n"
						+ "Attention : le total force + agilité + "
						+ "intelligence doit être égal au niveau du joueur. \n" 
						+ "Veuillez appuyer la touche \"Entrée\" pour démarrer le jeu.");
	Utilisation.sc.nextLine();
	}

	/**
	 * choix des caractéristiques du joueur. 
	 */
	public static void choixPersonnageJoueur(){
	int[] tabJoueur = {Joueur.JOUEUR1, Joueur.JOUEUR2};
	Utilisation choixJoueur = new Utilisation();
	
	for (int i : tabJoueur) { // On fait une loop pour chaque joueur
		messageBienvenueDuJoueur(i);
		choixJoueur.choixClassePersonnage(i); // le choix de la classe débouche sur le choix des autres caractéristiques du joueur
//		choixJoueur.choixNiveauPersonnage(i);
//		choixJoueur.choixForcePersonnage(i);		
	}
	}
	
}
