package dao;

import entity.Partida;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class PartidaDao {

    public void salvar(Partida partida) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.saveOrUpdate(partida);
        session.getTransaction().commit();
    }

    public List<Partida> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        List<Partida> lista;
        Query query = session.createQuery("from entity.Atleta");
        lista = query.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public void excluir(Partida partida){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(partida);
        session.getTransaction().commit();
    }
    
}
