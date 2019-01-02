package persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Joueur;

/**
 * IL s'agit de la classe à implémenter pour la persistence
 * @author user
 *
 */
public class MemoryJoueurDAO implements JoueurDAO {
	
	private static final Map<Integer, Joueur> DB = new HashMap<>();
	private static Integer id=1;
	

	@Override
	public void save(Joueur j) {
//		System.out.println(j);
		id=j.getNumeroJoueur();
		DB.put(id, j);

	}

	@Override
	public Joueur findById(int id) {
		return DB.get(id);
	}

	@Override
	public void delete(int id) {
		DB.remove(id);		

	}

	@Override
	public List<Joueur> findAll() {
		return new ArrayList<Joueur>(DB.values());
	}

}
