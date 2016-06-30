package managedBean;

import dao.AtletaDao;
import dao.DiretoriaDao;
import entity.Atleta;
import entity.Diretoria;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "diretoriaMB")
@SessionScoped
public class DiretoriaMB implements Serializable {

    private DiretoriaDao diretoriaDao = new DiretoriaDao();

    private Diretoria diretoria = new Diretoria();

    public List<Diretoria> getLista() {
        return diretoriaDao.getAll();
    }

    public Diretoria getDiretoria() {
        return diretoria;
    }

    public void setDiretoria(Diretoria diretoria) {
        this.diretoria = diretoria;
    }

    public String excluir() {
        diretoriaDao.excluir(diretoria);
        diretoria = null;
        return "listDiretoria.xhtml";
    }

    public String salvarDiretoria() {
        diretoriaDao.salvar(diretoria);
        diretoria = null;
        return "listDiretoria.xhtml";
    }

    public String novoDiretoria() {
        diretoria = new Diretoria();
        return "editDiretoria.xhtml";
    }

    public String editar() {
        return "editDiretoria.xhtml";
    }
}
