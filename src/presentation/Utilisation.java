package presentation;

import java.util.Scanner;

import model.Joueur;

public class Utilisation {
	
	Scanner sc = new Scanner(System.in);
	Joueur joueur = new Joueur();
	
	/**
	 * Choix du joeur. Une valeur entre 1 et 2
	 */
	public  void choixJoueur() {
		System.out.println("Tapez 1 si vous êtes le joueur 1, sinon tapez 2 : ");
		
		String numeroJoueur = sc.nextLine();
		
			switch (numeroJoueur) {
			case "1": case "2":
				System.out.println("Vous êtes le joeur : "+numeroJoueur);
				int valeurSaisieNumeroJoueur = Integer.parseInt(numeroJoueur); // transformation de la valeur saisie en chiffre
				joueur.setNumeroJoueur(valeurSaisieNumeroJoueur);
				break;

			default:
				System.out.println("Votre saisie n'est pas correcte.\n"
						+ "Vous devez tapez un chiffre entre 1 et 2.");	
				choixJoueur();
				break;
			}
		
	}


	public void creationJoueur(int numeroJoueur) {
		System.out.println("Veuillez choisir la classe de votre personnage : ");
		System.out.println("Tapez : \n"
				+ "\t - 1 pour Guerrier \n"
				+ "\t - 2 pour Rodeur \n"
				+ "\t  - 3 pour Mage");
		
	}

}
