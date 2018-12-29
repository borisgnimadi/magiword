package testUnitairePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import service.ValidationDeLaSommeDesCaracteresDuJoueur;

class TestFonctionnalites {

	/**
	 * Ce test vérifie que la valeur du niveau du joueur est ok
	 */
	@Test
	void validationNiveauEstOK() {
		boolean result = ValidationDeLaSommeDesCaracteresDuJoueur.validationNiveauOK(100);
		assertTrue(result);
	}

	/**
	 * Ce test vérifie que la valeur de la force est ok
	 */
	@Test
	void validationForceEstOK() { 
		boolean result = ValidationDeLaSommeDesCaracteresDuJoueur.validationForceOK(100, 20);
		assertTrue(result);
	}
	
	/**
	 * Ce test vérifie que la valeur de l'intelligence est ok
	 */
	@Test
	void validationIntelligenceEstOK() { 
		boolean result = ValidationDeLaSommeDesCaracteresDuJoueur.validationIntelligenceOK(100, 20, 10);
		assertTrue(result);
	}
	
	/**
	 * Ce test vérifie que la valeur de l'agilité est ok
	 */
	@Test
	void validationAgiliteEstOK() { 
		boolean result = ValidationDeLaSommeDesCaracteresDuJoueur.validationAgiliteOK(100, 10, 20, 70);
		assertTrue(result);
	}
		

}
