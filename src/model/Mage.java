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

		System.out.println("Joueur " + joueurAttaquant.getNumeroJoueur() + " utilise Boule de Feu et inflige"
				+ niveauVieAttaquant+" dommages à joueur " + joueurvictime.getNumeroJoueur());
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
		
		double niveauVieAttaquant = joueurAttaquant.getIntelligencePersonnage();

		System.out.println("Joueur " + joueurAttaquant.getNumeroJoueur() + " utilise Soin et gagne "
				+ 2*niveauVieAttaquant+" en vitalité");

		if (2*vitaliteAttaquant <= vitaliteInitialAttaquant) {
			joueurAttaquant.setViePersonnage(vitaliteAttaquant+niveauVieAttaquant*2); // le joueur utilisant cette attaque gagne  
			// 2 fois en niveau d'intelligence. 
		} else {
			joueurAttaquant.setViePersonnage(vitaliteInitialAttaquant); // le joueur utilisant cette attaque gagne  
			// 2 fois en niveau d'intelligence
			
		}
	}

}
