package model;

public class Rodeur implements Attaque {

	/** 
	 * Il s'agit d'un Tir � l�Arc : 
	 * Le joueur qui utilise cette attaque effectue des dommages �gaux 
	 * � l�agilit� du joueur sur l�adversaire.
	 */
	@Override
	public void attaqueBasique(Joueur joueurAttaquant, Joueur joueurvictime) {
		double niveauVieAttaquant = joueurAttaquant.getNiveauPersonnage();
		double vitaliteVictime = joueurvictime.getViePersonnage();

		joueurvictime.setViePersonnage(vitaliteVictime-niveauVieAttaquant); // on prend la vitalit� de la victime et 
		// on soustrait du niveau de vie de l'attaquant
	}

	/** 
	 * Il s'agit d'une Concentration : 
	 * Le joueur gagne son niveau divis� par 2 en agilit�..
	 */
	@Override
	public void attaqueSpeciale(Joueur joueurAttaquant, Joueur joueurvictime) {
		double niveauVieAttaquant = joueurAttaquant.getNiveauPersonnage();
		double vitaliteAttaquant = joueurAttaquant.getViePersonnage();

		joueurAttaquant.setViePersonnage(vitaliteAttaquant+0.5*niveauVieAttaquant); // on prend la vitalit� de l'attaquant et 
		// on rajoute la moiti� de la force de l'attaquant. 
	}

}
