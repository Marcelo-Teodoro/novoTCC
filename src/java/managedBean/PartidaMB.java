
package managedBean;

import dao.AtletaDao;
import dao.PartidaDao;
import entity.Atleta;
import entity.Partida;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "partidaMB")
@SessionScoped
public class PartidaMB implements Serializable{
    
    private PartidaDao partidaDao = new PartidaDao();
    // chamo de coringa!
    private Partida partida = new Partida(); //bug antigo!!!

    public List<Partida> getLista() {
        return partidaDao.getAll();
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public String excluir() {
        partidaDao.excluir(partida);
        partida = null;
        return "listPartida.xhtml";
    }

    public String salvarPartida() {
        partidaDao.salvar(partida);
        partida = null;
        return "listPartida.xhtml";
    }

    public String novoPartida() {
        partida = new Partida();
        return "editPartida.xhtml";
    }

    public String editar() {
        return "editPartida.xhtml";
    }
}

