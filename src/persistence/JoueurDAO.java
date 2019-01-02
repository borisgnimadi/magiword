package persistence;
import java.util.List;

import model.Joueur;

/**
 * Cette interface d�crit les m�thodes de la persistence
 * @author user
 *
 */
public interface JoueurDAO {
	
	public void save(Joueur j);
	public Joueur findById(int id);
	public void delete(int id);
	public List<Joueur> findAll();

}
