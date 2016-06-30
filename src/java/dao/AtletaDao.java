package dao;

import entity.Atleta;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class AtletaDao {

    public void salvar(Atleta atleta) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.saveOrUpdate(atleta);
        session.getTransaction().commit();
    }

    public List<Atleta> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        List<Atleta> lista;
        Query query = session.createQuery("from entity.Atleta");
        lista = query.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public void excluir(Atleta atleta){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(atleta);
        session.getTransaction().commit();
    }
    
}
