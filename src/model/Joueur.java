package model;

public class Joueur {
	
	private int numeroJoueur;
	private double viePersonnage;
	private int classePersonnage;
	private double niveauPersonnage;
	private double forcePersonnage;
	private double intelligencePersonnage;
	private double agilitePersonnage;
	
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
	public double getNiveauPersonnage() {
		return niveauPersonnage;
	}
	public void setNiveauPersonnage(double niveauPersonnage) {
		this.niveauPersonnage = niveauPersonnage;
	}
	public double getForcePersonnage() {
		return forcePersonnage;
	}
	public void setForcePersonnage(double forceJoueurNumero) {
		this.forcePersonnage = forceJoueurNumero;
	}
	public double getIntelligencePersonnage() {
		return intelligencePersonnage;
	}
	public void setIntelligencePersonnage(double intelligencePersonnage) {
		this.intelligencePersonnage = intelligencePersonnage;
	}
	
	public double getAgilitePersonnage() {
		return agilitePersonnage;
	}
	public void setAgilitePersonnage(double agilitePersonnage) {
		this.agilitePersonnage = agilitePersonnage;
	}
	


	public double getViePersonnage() {
		return viePersonnage;
	}
	public void setViePersonnage(double d) {
		this.viePersonnage = d;
	}
	public Joueur(int numeroJoueur, int viePersonnage, int classePersonnage, double niveauPersonnage, 
			double forcePersonnage, double intelligencePersonnage, double agilitePersonnage) {
		super();
		this.numeroJoueur = numeroJoueur;
		this.viePersonnage = viePersonnage;
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
				+ intelligencePersonnage + ", et d'agilite : " + agilitePersonnage +". La"
						+ " vitalité du joueur est de "+viePersonnage;
	}



	
	
}
