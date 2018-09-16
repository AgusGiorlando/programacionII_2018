package ar.edu.um.programacion2.TP8_Consigna01.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import ar.edu.um.programacion2.TP8_Consigna01.HibernateUtils;
import ar.edu.um.programacion2.TP8_Consigna01.entidades.Tarea;

public class TareaDao {
	protected SessionFactory sf;
	
	public TareaDao() {
		this.sf = HibernateUtils.getSessionFactory();
	}
	
	public void guardar(Tarea t) {
		Session sesion = this.sf.getCurrentSession();
		sesion.getTransaction().begin();
		sesion.persist(t);
		sesion.getTransaction().commit();
	}
	
	public void actualizar (Tarea t) {
		Session sesion = this.sf.getCurrentSession();
		sesion.getTransaction().begin();
		sesion.update(t);
		sesion.getTransaction().commit();
	}
	
	public void eliminar (Tarea t) {
		Session sesion = this.sf.getCurrentSession();																																										
		sesion.getTransaction().begin();
		sesion.delete(t);
		sesion.getTransaction().commit();
	}									
	
	public List<Tarea> listarTodos(){		
		Session sesion = this.sf.getCurrentSession();
		sesion.getTransaction().begin();
		
		String sql = "select t from Tarea t";
		Query<Tarea> consulta = sesion.createQuery(sql);
		List<Tarea> resultado = consulta.getResultList();
		sesion.getTransaction().commit();
		return resultado;
	}
	
	public Tarea recuperar(Long id) {
		Session sesion = this.sf.getCurrentSession();
		sesion.getTransaction().begin();
		
		String sql = "select t from Tarea t where t.id = :id";
		Query<Tarea> consulta = sesion.createQuery(sql);
		consulta.setParameter("id", id);
		Tarea resultado = consulta.getSingleResult();
		sesion.getTransaction().commit();
		return resultado;
	}
}
