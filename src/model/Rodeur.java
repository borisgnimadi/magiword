package model;

/**
 * décrit les attaques du Rodeur
 * @author user
 *
 */public class Rodeur implements Attaque {

	/**
	 * Il s'agit d'un Tir à l’Arc : Le joueur qui utilise cette attaque effectue des
	 * dommages égaux à l’agilité du joueur sur l’adversaire.
	 */
	@Override
	public void attaqueBasique(Joueur joueurAttaquant, Joueur joueurvictime) {
		double niveauVieAttaquant = joueurAttaquant.getNiveauPersonnage();
		double vitaliteVictime = joueurvictime.getViePersonnage();

		System.out.println("Joueur " + joueurAttaquant.getNumeroJoueur() + " utilise  Tire à l'arc et inflige "
				+ niveauVieAttaquant + " dommages à joueur " + joueurvictime.getNumeroJoueur());
		joueurvictime.setViePersonnage(vitaliteVictime - niveauVieAttaquant); // on prend la vitalité de la victime et
		// on soustrait du niveau de vie de l'attaquant
	}

	/**
	 * Il s'agit d'une Concentration : Le joueur gagne son niveau divisé par 2 en
	 * agilité..
	 */
	@Override
	public void attaqueSpeciale(Joueur joueurAttaquant, Joueur joueurvictime) {
		double niveauVieAttaquant = joueurAttaquant.getNiveauPersonnage();

		System.out.println("Joueur " + joueurAttaquant.getNumeroJoueur() + " utilise Concentration et gagne "
				+ niveauVieAttaquant * 0.5 + " en niveau de vie. Il possède maintenant " + niveauVieAttaquant * 1.5
				+ " de niveau de vie");

		joueurAttaquant.setNiveauPersonnage(niveauVieAttaquant * 1.5); // on prend la vitalité de l'attaquant et
		// on rajoute la moitié du niveau de l'attaquant.
	}

}
