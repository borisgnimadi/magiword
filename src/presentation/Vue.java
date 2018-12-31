package presentation;

import model.Joueur;
import presentation.Utilisation;
import presentation.Vue;
import service.ServiceImplementation;
import test.Main;


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
	Utilisation choixJoueur = new Utilisation();
	
	for (int i = 1 ; i <= Main.NOMBREJOUEUR ; i++) { // On fait une loop pour chaque joueur
		Joueur joueur = new Joueur(); // On déclare un nouveau joueur
		joueur.setNumeroJoueur(i);
		messageBienvenueDuJoueur(i);
		choixJoueur.choixClassePersonnage(joueur); // le choix de la classe débouche sur le choix des autres caractéristiques du joueur

		ServiceImplementation joueurEnbase = new ServiceImplementation();
		joueurEnbase.addJoueur(joueur); // On sauvegarde le joueur en mémoire

	}
	}
	
}
