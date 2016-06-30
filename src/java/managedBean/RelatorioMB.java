package managedBean;

import dao.AtletaDao;
import dao.RelatorioDao;
import entity.Atleta;
import entity.Relatorio;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "relatorioMB")
@SessionScoped
public class RelatorioMB implements Serializable {

    private RelatorioDao relatorioDao = new RelatorioDao();
    // chamo de coringa!
    private Relatorio relatorio = new Relatorio(); //bug antigo!!!

    public List<Relatorio> getLista() {
        return relatorioDao.getAll();
    }

    public Relatorio getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    public String excluir() {
        relatorioDao.excluir(relatorio);
        relatorio = null;
        return "listRelatorioo.xhtml";
    }

    public String salvarRelatorio() {
        relatorioDao.salvar(relatorio);
        relatorio = null;
        return "listRelatorio.xhtml";
    }

    public String novoRelatorio() {
        relatorio = new Relatorio();
        return "editRelatorio.xhtml";
    }

    public String editar() {
        return "editRelatorio.xhtml";
    }
}
