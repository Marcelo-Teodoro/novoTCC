package dao;

import entity.Noticias;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class NoticiasDao {

    public void salvar(Noticias noticias) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.saveOrUpdate(noticias);
        session.getTransaction().commit();
    }

    public List<Noticias> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        List<Noticias> lista;
        Query query = session.createQuery("from entity.Atleta");
        lista = query.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public void excluir(Noticias noticias){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(noticias);
        session.getTransaction().commit();
    }
    
}
