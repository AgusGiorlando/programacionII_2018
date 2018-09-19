package ar.um.edu.programacionII2018.dao;

import ar.um.edu.programacionII2018.entidades.Tarea;
import ar.um.edu.programacionII2018.utils.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class TareaDao {
    protected SessionFactory sf;

    public TareaDao() {
        this.sf = HibernateUtils.getSessionFactory();
    }

    public void escribir(Tarea tarea) {
        Session ses = this.sf.openSession();
        ses.beginTransaction();
        ses.persist(tarea);
        ses.getTransaction().commit();
        ses.close();
    }

    public Tarea buscarUno(Long id) {
        Session ses = this.sf.openSession();
        //ses.beginTransaction();
        String sql = "select t from Tarea t where t.id = :id";
        Query<Tarea> query = ses.createQuery(sql);
        query.setParameter("id",id);
        Tarea resultado = query.getSingleResult();
        //ses.getTransaction().commit();
        //ses.close();
        return resultado;
    }

    public List<Tarea> buscarTodos() {
        Session ses = this.sf.openSession();
        ses.beginTransaction();
        String sql = "select t from Tarea t";
        Query<Tarea> query = ses.createQuery(sql);
        List<Tarea> resultado = query.getResultList();
        ses.getTransaction().commit();
        ses.close();
        return resultado;
    }
}
