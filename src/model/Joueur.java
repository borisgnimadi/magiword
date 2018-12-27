package model;

public class Joueur {
	
	private int numeroJoueur;
	private int classePersonnage;
	private int niveauPersonnage;
	private int forcePersonnage;
	private int intelligencePersonnage;
	public static final int NBREDEJOUEUR = 2; 
	
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
	
	public Joueur(int numeroJoueur, int niveauPersonnage, int forcePersonnage, int intelligencePersonnage) {
		super();
		this.numeroJoueur = numeroJoueur;
		this.niveauPersonnage = niveauPersonnage;
		this.forcePersonnage = forcePersonnage;
		this.intelligencePersonnage = intelligencePersonnage;
	}
	
	public Joueur() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Joueur [numeroJoueur=" + numeroJoueur + ", niveauPersonnage=" + niveauPersonnage + ", forcePersonnage="
				+ forcePersonnage + ", intelligencePersonnage=" + intelligencePersonnage + "]";
	}

	
	
}
