package springwebmvc.impl;

import java.util.List;
public interface TrapDao {

	
	public List <Trap> listTrappen();

	public void saveTrap(Trap trap);

	public void removeTrap(long id);
	
	
}