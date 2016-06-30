package managedBean;

import dao.AtletaDao;
import entity.Atleta;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "atletaMB")
@SessionScoped
public class AtletaMB implements Serializable {

    private AtletaDao atletaDao = new AtletaDao();
    // chamo de coringa!
    private Atleta atleta = new Atleta(); //bug antigo!!!

    public List<Atleta> getLista() {
        return atletaDao.getAll();
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    public String excluir() {
        atletaDao.excluir(atleta);
        atleta = null;
        return "viewAtleta.xhtml";
    }

    public String salvarAtleta() {
        atletaDao.salvar(atleta);
        atleta = null;
        return "viewAtleta.xhtml";
    }

    public String novoAtleta() {
        atleta = new Atleta();
        return "eviewAtleta.xhtml";
    }

    public String editar() {
        return "editAtleta.xhtml";
    }
}
