package model;

/**
 * @author user
 * Cette interface décris les attaques 
 */
public interface Attaque {

	public void attaqueBasique(Joueur joueurAttaquant, Joueur joueurvictime);
	public void attaqueSpeciale(Joueur joueurAttaquant, Joueur joueurvictime);
	
}
