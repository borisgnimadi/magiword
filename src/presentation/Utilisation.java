package presentation;

import java.util.Scanner;

import model.Joueur;
import service.ValidationDeLaSommeDesCaracteresDuJoueur;

public class Utilisation {

	static Scanner sc = new Scanner(System.in);
	Joueur joueur = new Joueur();

	/**
	 * Choix de la classe du personnage. Le choix de la classe débouche sur 
	 * le choix du niveau du joueur
	 */
	public void choixClassePersonnage(int numeroJoueur) {
		System.out.println("Joueur " + numeroJoueur + ", veuillez choisir la classe de votre personnage : ");
		System.out.println("Tapez : \n \t - 1 pour Guerrier \n \t "
				+ "- 2 pour Rodeur \n \t - 3 pour Mage \n \t - 0 pour revenir au menu précédent. ");

		String classeJoueur = sc.nextLine();

		switch (classeJoueur) {
		case "1":
		case "2":
		case "3":
			int classeJoueurNum = Integer.valueOf(classeJoueur);
			String classePersonnageWording = classeJoueurNum == 1 ? "Guerrier"
					: (classeJoueurNum == 2 ? "Rodeur" : "Mage");
			System.out.println("Joueur " + numeroJoueur + ", vous êtes de classe : " + classePersonnageWording);
			joueur.setNumeroJoueur(numeroJoueur); // sauvegarde du numéro du joueur
			joueur.setClassePersonnage(classeJoueurNum); // sauvegarde de la classe du joueur
			choixNiveauPersonnage(numeroJoueur); // on dirige le joueur vers le choix de son niveau
			break;
		case "0":
			Vue.messageBienvenueDuJoueur(numeroJoueur);

		default:
			System.out.println("Votre saisie n'est pas correcte.\n" + "Vous devez tapez un chiffre entre 1, 2 ou 3.");
			choixClassePersonnage(numeroJoueur);
			break;
		}
	}

	public void choixNiveauPersonnage(int numeroJoueur) {
		System.out.println("Veuillez choisir le niveau de votre personnage : \nTapez une valeur entre 0 et 100.\nPour revenir au menu précédent, veuillez taper 999.");

		String niveauJoueur = sc.nextLine();

		try {
			int niveauJoueurNumero = Integer.valueOf(niveauJoueur); // transformons la valeur en nombre

			if (ValidationDeLaSommeDesCaracteresDuJoueur.validationNiveauOK(niveauJoueurNumero)) {
				System.out.println("Vous êtes de niveau : " + niveauJoueur + "\n");
				joueur.setNiveauPersonnage(niveauJoueurNumero);
				choixForcePersonnage(numeroJoueur); // on dirige ensuite le joueur vers le choix de sa force
				;

			} else if (niveauJoueurNumero == 999) {
				choixClassePersonnage(numeroJoueur);

			} else {
				System.out.println("Votre saisie n'est pas correcte.\n"
						+ "Vous devez tapez un nombre entre 0 et 100 ou 999 (pour revenir en arrière).\n");
				choixNiveauPersonnage(numeroJoueur);

			}
		} catch (Exception e) {
			System.out.println(
					"Votre saisie n'est pas correcte.\n" + "Vous devez taper un nombre entre 0 et 100 ou 999 (pour revenir en arrière).\n.");
			choixNiveauPersonnage(numeroJoueur);
		}
	}

	public void choixForcePersonnage(int numeroJoueur) {
		System.out.println("Veuillez choisir la force de votre personnage : ");
		System.out.println("Tapez une valeur entre 0 et " + joueur.getNiveauPersonnage());
		System.out.println("Pour revenir au menu précédent, veuillez taper 999.\n");

		String forceJoueur = sc.nextLine();

		try {
			int forceJoueurNumero = Integer.valueOf(forceJoueur); // transformons la valeur en nombre

			int valeurMaxAutorise = joueur.getNiveauPersonnage();
			if (ValidationDeLaSommeDesCaracteresDuJoueur.validationForceOK(valeurMaxAutorise,forceJoueurNumero)) {
				System.out.println("Vous êtes de force : " + forceJoueur);
				joueur.setForcePersonnage(forceJoueurNumero);
				choixIntelligencePersonnage(numeroJoueur);
				;

			} else if (forceJoueurNumero == 999) {
				choixNiveauPersonnage(numeroJoueur);

			} else {
				System.out.println("Votre saisie n'est pas correcte.\nVous devez taper un nombre entre 0 et "
						+ joueur.getNiveauPersonnage() + " ou 999 (pour revenir en arrière).\n");
				choixForcePersonnage(numeroJoueur);

			}
		} catch (Exception e) {
			System.out.println(
					"Votre saisie n'est pas correcte.\n Vous devez taper un nombre entre 0 et \"+joueur.getNiveauPersonnage()+\" ou 999 (pour revenir en arrière).\n");
			choixForcePersonnage(numeroJoueur);
		}

	}
	
	public void choixIntelligencePersonnage(int numeroJoueur) {
		
		int valeurMaxAutorise = joueur.getNiveauPersonnage()-joueur.getForcePersonnage();
		
		System.out.println("Veuillez choisir l'intelligence de votre personnage : ");
		System.out.println("Tapez une valeur entre 0 et " + valeurMaxAutorise);
		System.out.println("Pour revenir au menu précédent, veuillez taper 999.\n");

		String intelligenceJoueur = sc.nextLine();

		try {
			int intelligenceJoueurNumero = Integer.valueOf(intelligenceJoueur); // transformons la valeur en nombre

			if (ValidationDeLaSommeDesCaracteresDuJoueur.validationIntelligenceOK(joueur.getNiveauPersonnage(), joueur.getForcePersonnage(), intelligenceJoueurNumero)) {
				System.out.println("Vous êtes d'intelligence : " + intelligenceJoueur);
				joueur.setIntelligencePersonnage(intelligenceJoueurNumero);
				choixAgilitePersonnage(numeroJoueur);

			} else if (intelligenceJoueurNumero == 999) {
				choixForcePersonnage(numeroJoueur);

			} else {
				System.out.println("Votre saisie n'est pas correcte.\nVous devez taper un nombre entre 0 et "
						+ valeurMaxAutorise + " ou 999 (pour revenir en arrière).\n");
				choixIntelligencePersonnage(numeroJoueur);

			}
		} catch (Exception e) {
			System.out.println(
					"Votre saisie n'est pas correcte.\n Vous devez taper un nombre entre 0 et \"+joueur.getNiveauPersonnage()+\" ou 999 (pour revenir en arrière).\n");
			choixIntelligencePersonnage(numeroJoueur);;
		}
	}	
	
	public void choixAgilitePersonnage(int numeroJoueur) {
		
		int valeurMaxAutorise = joueur.getNiveauPersonnage()-joueur.getForcePersonnage()-joueur.getIntelligencePersonnage();
		
		System.out.println("Votre agilité est donc de : "+valeurMaxAutorise);
		System.out.println("Veuillez saisir la valeur " + valeurMaxAutorise+" pour continuer ");
		System.out.println("Pour revenir au menu précédent, veuillez taper 999.\n");

		String agiliteJoueur = sc.nextLine();

		try {
			int agiliteJoueurNumero = Integer.valueOf(agiliteJoueur); // transformons la valeur en nombre

			if (ValidationDeLaSommeDesCaracteresDuJoueur.validationAgiliteOK(joueur.getNiveauPersonnage(), joueur.getForcePersonnage(), joueur.getIntelligencePersonnage(), agiliteJoueurNumero)) {
				joueur.setAgilitePersonnage(agiliteJoueurNumero);
				;

			} else if (agiliteJoueurNumero == 999) {
				choixAgilitePersonnage(numeroJoueur);

			} else {
				System.out.println("Votre saisie n'est pas correcte.\nVous devez taper un nombre entre 0 et "
						+ valeurMaxAutorise + " ou 999 (pour revenir en arrière).\n");
				choixAgilitePersonnage(numeroJoueur);

			}
		} catch (Exception e) {
			System.out.println(
					"Votre saisie n'est pas correcte.\n Vous devez taper un nombre entre 0 et \"+joueur.getNiveauPersonnage()+\" ou 999 (pour revenir en arrière).\n");
			choixIntelligencePersonnage(numeroJoueur);;
		}
	}	
	
}
