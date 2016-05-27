package springwebmvc.impl;

import java.util.List;



public interface DeurDao {

	
	public List <Deur> listDeurs();

	public void saveDeur(Deur deur);

	public void removeDeur(long id);
	
	
}