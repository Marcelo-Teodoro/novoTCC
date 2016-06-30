package dao;

import entity.Diretoria;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class DiretoriaDao {

    public void salvar(Diretoria diretoria) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.saveOrUpdate(diretoria);
        session.getTransaction().commit();
    }

    public List<Diretoria> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        List<Diretoria> lista;
        Query query = session.createQuery("from entity.Atleta");
        lista = query.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public void excluir(Diretoria diretoria){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(diretoria);
        session.getTransaction().commit();
    }
    
}
