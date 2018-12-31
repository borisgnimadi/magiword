package service;

import java.util.List;

import model.Joueur;

public interface JoueurService {

	public void addJoueur(Joueur j);
	public Joueur findValidation(int id);
	public List<Joueur> getAllJoueur();

}


