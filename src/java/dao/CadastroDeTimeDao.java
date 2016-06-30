package dao;

import entity.CadastroDeTime;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class CadastroDeTimeDao {

    public void salvar(CadastroDeTime cadastroDeTime) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.saveOrUpdate(cadastroDeTime);
        session.getTransaction().commit();
    }

    public List<CadastroDeTime> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        List<CadastroDeTime> lista;
        Query query = session.createQuery("from entity.Atleta");
        lista = query.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public void excluir(CadastroDeTime cadastroDeTime){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(cadastroDeTime);
        session.getTransaction().commit();
    }
    
}
