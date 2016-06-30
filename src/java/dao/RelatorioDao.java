package dao;

import entity.Relatorio;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class RelatorioDao {

    public void salvar(Relatorio relatorio) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.saveOrUpdate(relatorio);
        session.getTransaction().commit();
    }

    public List<Relatorio> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        List<Relatorio> lista;
        Query query = session.createQuery("from entity.Atleta");
        lista = query.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public void excluir(Relatorio relatorio){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(relatorio);
        session.getTransaction().commit();
    }
    
}
