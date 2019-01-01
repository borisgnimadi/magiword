package service;

/**
 * Cette classe contient les méthodes de validation des caractères des joueurs
 * @author user
 *
 */
public class ValidationDeLaSommeDesCaracteresDuJoueur {
	
	public static boolean validationNiveauOK (double valeurMaxAutorise) {
		boolean niveauOK = valeurMaxAutorise <= 100 ? true : false ;
		return niveauOK;
	}
	
	public static boolean validationForceOK (double valeurMaxAutorise, double forceJoueurNumero) {
		boolean forceOK = (forceJoueurNumero <= valeurMaxAutorise) && validationNiveauOK(valeurMaxAutorise)? true : false ;
		return forceOK;
	}
	
	public static boolean validationIntelligenceOK (double d, double e, int valeurIntelligence) {
		boolean intelligenceOK = (e + valeurIntelligence <= d) && validationNiveauOK(d) ? true : false ;
		return intelligenceOK;
	}
	
	public static boolean validationAgiliteOK (double valeurNiveau, double valeurForce, double valeurIntelligence, double valeurAgilite) {
		boolean agiliteOK = (valeurForce + valeurIntelligence + valeurAgilite == valeurNiveau) && 
				validationNiveauOK(valeurNiveau) ? true : false ;
		return agiliteOK;
	}

}
