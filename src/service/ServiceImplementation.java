package service;

import java.util.List;

import model.Joueur;
import persistence.JoueurDAO;
import persistence.MemoryJoueurDAO;;

public class ServiceImplementation implements JoueurService {
	
	JoueurDAO dao = new MemoryJoueurDAO();

	@Override
	public void addJoueur(Joueur j) {
		if(j!=null) {
			dao.save(j);
		}

	}

	@Override
	public Joueur findValidation(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<Joueur> getAllJoueur() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
