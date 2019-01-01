package model;

public class Rodeur implements Attaque {

	/** 
	 * Il s'agit d'un Tir à l’Arc : 
	 * Le joueur qui utilise cette attaque effectue des dommages égaux 
	 * à l’agilité du joueur sur l’adversaire.
	 */
	@Override
	public void attaqueBasique(Joueur joueurAttaquant, Joueur joueurvictime) {
		double niveauVieAttaquant = joueurAttaquant.getNiveauPersonnage();
		double vitaliteVictime = joueurvictime.getViePersonnage();

		joueurvictime.setViePersonnage(vitaliteVictime-niveauVieAttaquant); // on prend la vitalité de la victime et 
		// on soustrait du niveau de vie de l'attaquant
	}

	/** 
	 * Il s'agit d'une Concentration : 
	 * Le joueur gagne son niveau divisé par 2 en agilité..
	 */
	@Override
	public void attaqueSpeciale(Joueur joueurAttaquant, Joueur joueurvictime) {
		double niveauVieAttaquant = joueurAttaquant.getNiveauPersonnage();
		double vitaliteAttaquant = joueurAttaquant.getViePersonnage();

		joueurAttaquant.setViePersonnage(vitaliteAttaquant+0.5*niveauVieAttaquant); // on prend la vitalité de l'attaquant et 
		// on rajoute la moitié de la force de l'attaquant. 
	}

}
