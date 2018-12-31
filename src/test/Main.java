package test;

import java.util.List;

import model.Joueur;
import presentation.Vue;
import service.ServiceImplementation;

public class Main {
	
	public static final int NOMBREJOUEUR = 2; // on déclare le nomnbre de joueur de la partie
	
	public static void main(String[] args) {
		Vue.choixPersonnageJoueur();
		
		ServiceImplementation joueurEnbase = new ServiceImplementation();
		
		List<Joueur> allCustomer = joueurEnbase.getAllJoueur();
		
		System.out.println("********************** Résumé des personnages de la partie **********************");
		for (Joueur joueur : allCustomer) {
			System.out.println(joueur);
			
			
		}


	}

}
