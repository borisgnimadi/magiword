package model;

public class Joueur {
	
	private int numeroJoueur;
	private int classePersonnage;
	private int niveauPersonnage;
	private int forcePersonnage;
	private int intelligencePersonnage;
	private int agilitePersonnage;
	
	public int getNumeroJoueur() {
		return numeroJoueur;
	}
	public void setNumeroJoueur(int numeroJoueur) {
		this.numeroJoueur = numeroJoueur;
	}
	public int getClassePersonnage() {
		return classePersonnage;
	}
	public void setClassePersonnage(int classePersonnage) {
		this.classePersonnage = classePersonnage;
	}
	public int getNiveauPersonnage() {
		return niveauPersonnage;
	}
	public void setNiveauPersonnage(int niveauPersonnage) {
		this.niveauPersonnage = niveauPersonnage;
	}
	public int getForcePersonnage() {
		return forcePersonnage;
	}
	public void setForcePersonnage(int forcePersonnage) {
		this.forcePersonnage = forcePersonnage;
	}
	public int getIntelligencePersonnage() {
		return intelligencePersonnage;
	}
	public void setIntelligencePersonnage(int intelligencePersonnage) {
		this.intelligencePersonnage = intelligencePersonnage;
	}
	
	
	public int getAgilitePersonnage() {
		return agilitePersonnage;
	}
	public void setAgilitePersonnage(int agilitePersonnage) {
		this.agilitePersonnage = agilitePersonnage;
	}
	

	public Joueur(int numeroJoueur, int classePersonnage, int niveauPersonnage, int forcePersonnage,
			int intelligencePersonnage, int agilitePersonnage) {
		super();
		this.numeroJoueur = numeroJoueur;
		this.classePersonnage = classePersonnage;
		this.niveauPersonnage = niveauPersonnage;
		this.forcePersonnage = forcePersonnage;
		this.intelligencePersonnage = intelligencePersonnage;
		this.agilitePersonnage = agilitePersonnage;
	}
	public Joueur() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String classePersonnageWording = classePersonnage == 1 ? "Guerrier" // définission le label du personnage
				: (classePersonnage == 2 ? "Rodeur" : "Mage");

		return "Le joueur " + numeroJoueur + " est un " + classePersonnageWording + ", et est de niveau : "
				+ niveauPersonnage + " dont force : " + forcePersonnage + ", intelligence : "
				+ intelligencePersonnage + ", et d'agilite : " + agilitePersonnage ;
	}



	
	
}
