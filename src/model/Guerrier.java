package model;

public class Guerrier implements Attaque {

	/** 
	 * Il s'agit d'un Coup d��p�e. 
	 * Le joueur qui utilise cette attaque effectue des dommages �gaux � sa force 
	 * sur l�adversaire.
	 */

	public void attaqueBasique(Joueur joueurAttaquant, Joueur joueurvictime) {
		double niveauVieAttaquant = joueurAttaquant.getNiveauPersonnage();
		double vitaliteVictime = joueurvictime.getViePersonnage();

		System.out.println("Joueur "+joueurAttaquant.getNumeroJoueur()+" utilise Coup d'�p� et inflige "
				+ niveauVieAttaquant+ " dommages � joueur "+joueurvictime.getNumeroJoueur());
		joueurvictime.setViePersonnage(vitaliteVictime-niveauVieAttaquant); // on prend la vitalit� de la victime et 
		// on soustrait la force de l'attaquant
	}

	/** 
	 * Il s'agit d'un Coup de Rage. 
	 * Le joueur qui utilise cette attaque effectue des dommages �gaux � sa force fois deux 
	 * sur l�adversaire. Le joueur lan�ant l'attaque perd de la vitalit� : 
	 * la valeur de sa force divis�e par 2..
	 */
	@Override
	public void attaqueSpeciale(Joueur joueurAttaquant, Joueur joueurvictime) {
		double niveauVieAttaquant = joueurAttaquant.getNiveauPersonnage();
		double vitaliteVictime = joueurvictime.getViePersonnage();
		double vitaliteAttaquant = joueurAttaquant.getViePersonnage();

		System.out.println("Joueur "+joueurAttaquant.getNumeroJoueur()+" utilise Coup de rage et inflige "
				+ niveauVieAttaquant*2+" dommages � joueur "+joueurvictime.getNumeroJoueur());
		System.out.println("Joueur "+joueurAttaquant.getNumeroJoueur()+" perd "+0.5*niveauVieAttaquant+" points de vie"
				+ " et joueur "+joueurvictime.getNumeroJoueur()+" perd "+2*niveauVieAttaquant+" points de vie");

		joueurvictime.setViePersonnage(vitaliteVictime-2*niveauVieAttaquant); // on prend la vitalit� de la victime et 
		// on soustrait le double de la force de l'attaquant
		
		joueurAttaquant.setViePersonnage(vitaliteAttaquant-0.5*niveauVieAttaquant); // on prend la vitalit� de la victime et 
		// on soustrait le double de la force de l'attaquant. L'attaquant perd 50% de point de cette
		// sur sa vitalit�
	}

}
