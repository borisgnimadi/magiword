package model;

public class Guerrier implements Attaque {

	/** 
	 * Il s'agit d'un Coup d’Épée. 
	 * Le joueur qui utilise cette attaque effectue des dommages égaux à sa force 
	 * sur l’adversaire.
	 */

	public void attaqueBasique(Joueur joueurAttaquant, Joueur joueurvictime) {
		double niveauVieAttaquant = joueurAttaquant.getNiveauPersonnage();
		double vitaliteVictime = joueurvictime.getViePersonnage();

		System.out.println("Joueur "+joueurAttaquant.getNumeroJoueur()+" utilise Coup d'épé et inflige "
				+ niveauVieAttaquant+ " dommages à joueur "+joueurvictime.getNumeroJoueur());
		joueurvictime.setViePersonnage(vitaliteVictime-niveauVieAttaquant); // on prend la vitalité de la victime et 
		// on soustrait la force de l'attaquant
	}

	/** 
	 * Il s'agit d'un Coup de Rage. 
	 * Le joueur qui utilise cette attaque effectue des dommages égaux à sa force fois deux 
	 * sur l’adversaire. Le joueur lançant l'attaque perd de la vitalité : 
	 * la valeur de sa force divisée par 2..
	 */
	@Override
	public void attaqueSpeciale(Joueur joueurAttaquant, Joueur joueurvictime) {
		double niveauVieAttaquant = joueurAttaquant.getNiveauPersonnage();
		double vitaliteVictime = joueurvictime.getViePersonnage();
		double vitaliteAttaquant = joueurAttaquant.getViePersonnage();

		System.out.println("Joueur "+joueurAttaquant.getNumeroJoueur()+" utilise Coup de rage et inflige "
				+ niveauVieAttaquant*2+" dommages à joueur "+joueurvictime.getNumeroJoueur());
		System.out.println("Joueur "+joueurAttaquant.getNumeroJoueur()+" perd "+0.5*niveauVieAttaquant+" points de vie"
				+ " et joueur "+joueurvictime.getNumeroJoueur()+" perd "+2*niveauVieAttaquant+" points de vie");

		joueurvictime.setViePersonnage(vitaliteVictime-2*niveauVieAttaquant); // on prend la vitalité de la victime et 
		// on soustrait le double de la force de l'attaquant
		
		joueurAttaquant.setViePersonnage(vitaliteAttaquant-0.5*niveauVieAttaquant); // on prend la vitalité de la victime et 
		// on soustrait le double de la force de l'attaquant. L'attaquant perd 50% de point de cette
		// sur sa vitalité
	}

}
