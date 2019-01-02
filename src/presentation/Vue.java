package presentation;

import java.util.List;

import model.Guerrier;
import model.Joueur;
import model.Mage;
import model.Rodeur;
import service.ServiceImplementation;
import test.Main;

/**
 * Cette classe d�finit des m�thodes relatives au textes � pr�senter aux
 * utilisateurs
 * 
 * @author user
 *
 */
public class Vue {

	/**
	 * D�marrage du jeu par le joueur numero n
	 */
	public static void messageBienvenueDuJoueur(int numeroJoueur) {
		System.out.println("Bienvenue dans le jeu MagiWorld ! \n" + "Vous �tes le joueur " + numeroJoueur + ".\n"
				+ "Dans un premier temps, vous allez " + "d�finir les caract�ristiques de votre personnage. \n"
				+ "Attention : le total force + agilit� + " + "intelligence doit �tre �gal au niveau du joueur. \n"
				+ "Veuillez appuyer la touche \"Entr�e\" pour d�marrer le jeu.");
		Utilisation.sc.nextLine();
	}

	/**
	 * choix des caract�ristiques du joueur.
	 */
	public static void choixPersonnageJoueur() {
		Utilisation choixJoueur = new Utilisation();

		for (int i = 1; i <= Main.NOMBREJOUEUR; i++) { // On fait une loop pour chaque joueur
			Joueur joueur = new Joueur(); // On d�clare un nouveau joueur
			joueur.setNumeroJoueur(i);
			messageBienvenueDuJoueur(i);
			choixJoueur.choixClassePersonnage(joueur); // le choix de la classe d�bouche sur le choix des autres
														// caract�ristiques du joueur

			ServiceImplementation joueurEnbase = new ServiceImplementation();
			joueurEnbase.addJoueur(joueur); // On sauvegarde le joueur en m�moire

		}
	}

	/**
	 * renvoie le joueur adverse dans la liste
	 * 
	 * @param j
	 * @return
	 */
	public static Joueur joueurAdverse(List<Joueur> allJoueurs, Joueur j) {
		Joueur joueurAdverse = allJoueurs.get(0) == j ? allJoueurs.get(1) : allJoueurs.get(0);
		return joueurAdverse;
	}

	/**
	 * affiche le message de game over, en fin de partie et le nom du gagnant
	 * 
	 * @param vitalitejoueur1
	 * @param vitalitejoueur2
	 */
	public static void gameOver(double vitalitejoueur1, double vitalitejoueur2) {
		if (vitalitejoueur1 <= 0) {
			System.out.println("Game Over");
			System.out.println("Joueur 1, tu as perdu ! ");
			System.out.println("Le joueur 2, l'emporte avec une vitalit� de : " + vitalitejoueur2);
		}
		if (vitalitejoueur2 <= 0) {
			System.out.println("Game Over");
			System.out.println("Joueur 2, tu as perdu ! ");
			System.out.println("Le joueur 1, l'emporte avec une vitalit� de : " + vitalitejoueur1);
		}
	}

	public static double renvoieValeurZeroSiValeurNegative(double d) {

		if (d < 0) {
			d = 0;
		}
		return d;
	}

	/**
	 * fait appel � l'attaque � utiliser
	 * 
	 * @param typeAttaque
	 * @param joueurAttaquant
	 * @param joueurAdverse
	 */
	public static void actionAttaque(int typeAttaque, Joueur joueurAttaquant, Joueur joueurAdverse) {
		Guerrier g = new Guerrier();
		Mage m = new Mage();
		Rodeur r = new Rodeur();

		switch (typeAttaque) {
		case 1:
			if (joueurAttaquant.getClassePersonnage() == 1) {
				g.attaqueBasique(joueurAttaquant, joueurAdverse);
			} else if (joueurAttaquant.getClassePersonnage() == 2) {
				r.attaqueBasique(joueurAttaquant, joueurAdverse);
			} else {
				m.attaqueBasique(joueurAttaquant, joueurAdverse);
			}
			break;

		case 2:
			if (joueurAttaquant.getClassePersonnage() == 1) {
				g.attaqueSpeciale(joueurAttaquant, joueurAdverse);
			} else if (joueurAttaquant.getClassePersonnage() == 2) {
				r.attaqueSpeciale(joueurAttaquant, joueurAdverse);
			} else {
				m.attaqueSpeciale(joueurAttaquant, joueurAdverse);
			}
			break;

		default:
			break;
		}

	}

	/**
	 * d�roulement des attaques
	 * 
	 * @param allJoueurs
	 */
	public static void deroulementAttaque(List<Joueur> allJoueurs) {
		System.out.println("Veuillez appuyer sur la touche \"Entr�e\" pour d�marrer les attaques.");
		Utilisation.sc.nextLine();
		do {
			for (Joueur joueur : allJoueurs) {
				Joueur joueurAdverse = joueurAdverse(allJoueurs, joueur);
				System.out.println("\nJoueur " + joueur.getNumeroJoueur() + ", ("
						+ renvoieValeurZeroSiValeurNegative(joueur.getViePersonnage()) + " vitalit�)"
						+ ", appuyer sur 1 pour une attaque basique ou 2 pour une attaque sp�ciale.");
				String attaque = Utilisation.sc.nextLine();
				switch (attaque) {
				case "1":
					actionAttaque(1, joueur, joueurAdverse);
					break;
				case "2":
					actionAttaque(2, joueur, joueurAdverse);
					break;
				default:
					System.out.println("Votre saisie n'est pas correcte.\n" + "Vous deviez tapez un "
							+ "chiffre entre 1, 2. C'est maintenant le tour du second joueur de continuer.");
					break;
				}
				System.out.println("\nJoueur " + joueur.getNumeroJoueur() + ", votre niveau de vie est maintenant de :"
						+ " " + joueur.getViePersonnage() + " vitalit�");
			}
		} while (allJoueurs.get(0).getViePersonnage() > 0 && allJoueurs.get(1).getViePersonnage() > 0);
		gameOver(allJoueurs.get(0).getViePersonnage(), allJoueurs.get(1).getViePersonnage());
	}

}
