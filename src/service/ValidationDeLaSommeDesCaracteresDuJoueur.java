package service;

/**
 * Cette classe contient les méthodes de validation des caractères des joueurs
 * @author user
 *
 */
public class ValidationDeLaSommeDesCaracteresDuJoueur {
	
	public static boolean validationNiveauOK (int valeurNiveau) {
		boolean niveauOK = valeurNiveau <= 100 ? true : false ;
		return niveauOK;
	}
	
	public static boolean validationForceOK (int valeurNiveau, int valeurForce) {
		boolean forceOK = (valeurForce <= valeurNiveau) && validationNiveauOK(valeurNiveau)? true : false ;
		return forceOK;
	}
	
	public static boolean validationIntelligenceOK (int valeurNiveau, int valeurForce, int valeurIntelligence) {
		boolean intelligenceOK = (valeurForce + valeurIntelligence <= valeurNiveau) && validationNiveauOK(valeurNiveau) ? true : false ;
		return intelligenceOK;
	}
	
	public static boolean validationAgiliteOK (int valeurNiveau, int valeurForce, int valeurIntelligence, int valeurAgilite) {
		boolean agiliteOK = (valeurForce + valeurIntelligence + valeurAgilite == valeurNiveau) && 
				validationNiveauOK(valeurNiveau) ? true : false ;
		return agiliteOK;
	}

}
