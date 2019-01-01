package test;

import java.util.List;

import model.Joueur;
import presentation.Vue;
import service.ServiceImplementation;

public class Main {
	
	public static final int NOMBREJOUEUR = 2; // on d�clare le nomnbre de joueur de la partie
	public static double[] vitaliteInitialeJoueur = new double[2];

	
	public static void main(String[] args) {
		Vue.choixPersonnageJoueur();
		
		ServiceImplementation joueurEnbase = new ServiceImplementation();
		
		List<Joueur> allJoueurs = joueurEnbase.getAllJoueur();
		
		System.out.println("********************** R�sum� des personnages de la partie **********************");
		for (Joueur joueur : allJoueurs) {
			System.out.println(joueur);
			vitaliteInitialeJoueur[joueur.getNumeroJoueur()-1]=joueur.getViePersonnage(); // On r�cup�re la vitalit� initiale des deux joueurs dans le tableau
			// on fait moins 1 car le num�ro du joueur commence par 1.
		}
		
		Vue.deroulementAttaque(allJoueurs);
	}

	
}
