package ar.edu.um.programacionII.TP6_Consigna02;

public interface DAO<T> {
	public void add(Object T);
	public void delete(Integer id);
	public void update(Object T, Integer id);
	public void findOne(Integer id);
	public void findAll();
}
