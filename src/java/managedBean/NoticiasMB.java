
package managedBean;

import dao.AtletaDao;
import dao.NoticiasDao;
import entity.Atleta;
import entity.Noticias;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "noticiasMB")
@SessionScoped
public class NoticiasMB implements Serializable{

    private NoticiasDao noticiasDao = new NoticiasDao();
    // chamo de coringa!
    private Noticias noticias = new Noticias(); //bug antigo!!!

    public List<Noticias> getLista() {
        return noticiasDao.getAll();
    }

    public Noticias getNoticias() {
        return noticias;
    }

    public void setNoticias(Noticias noticias) {
        this.noticias = noticias;
    }

    public String excluir() {
        noticiasDao.excluir(noticias);
        noticias = null;
        return "listNoticias.xhtml";
    }

    public String salvarNoticias() {
        noticiasDao.salvar(noticias);
        noticias = null;
        return "listNoticias.xhtml";
    }

    public String novasNoticias() {
        noticias = new Noticias();
        return "editNoticias.xhtml";
    }

    public String editar() {
        return "editNoticias.xhtml";
    }
}
