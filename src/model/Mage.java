package model;

import test.Main;

public class Mage implements Attaque {

	/** 
	 * Il s'agit d'un Boule de Feu :  
	 * Le joueur qui utilise cette attaque effecture des dommages 
	 * égaux à l’intelligence du joueur sur l’adversaire.
	 */
	@Override
	public void attaqueBasique(Joueur joueurAttaquant, Joueur joueurvictime) {
		double niveauVieAttaquant = joueurAttaquant.getNiveauPersonnage();
		double vitaliteVictime = joueurvictime.getViePersonnage();

		joueurvictime.setViePersonnage(vitaliteVictime-niveauVieAttaquant); // on prend la vitalité de la victime et 
		// on soustrait du niveau de vie de l'attaquant
	}

	/** 
	 * Il s'agit d'un Soin  : 
	 * Le joueur soigne sa vie et regagne sa quantité d’intelligence fois 2 en points de vie. 
	 * Attention, il ne peut pas avoir plus de vie qu’il n’en avait au départ.
	 */
	@Override
	public void attaqueSpeciale(Joueur joueurAttaquant, Joueur joueurvictime) {
		double vitaliteAttaquant = joueurAttaquant.getViePersonnage();
		double vitaliteInitialAttaquant = Main.vitaliteInitialeJoueur[joueurAttaquant.getNumeroJoueur()-1];

		if (2*vitaliteAttaquant <= vitaliteInitialAttaquant) {
			joueurAttaquant.setViePersonnage(vitaliteAttaquant*2); // on prend la vitalité de l'attaquant et 
			// on rajoute la moitié de la force de l'attaquant. 
			joueurAttaquant.setIntelligencePersonnage(joueurAttaquant.getIntelligencePersonnage()*2); 
		} else {
			joueurAttaquant.setViePersonnage(vitaliteInitialAttaquant); // on prend la vitalité de l'attaquant et 
			// on rajoute la moitié de la force de l'attaquant. 
			joueurAttaquant.setIntelligencePersonnage(vitaliteInitialAttaquant/5); 
			
		}
	}

}
