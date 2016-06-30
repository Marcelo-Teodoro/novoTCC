
package managedBean;

import dao.CadastroDeTimeDao;
import entity.CadastroDeTime;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "cadastroDeTimeMB")
@SessionScoped
public class CadastroDeTimeMB implements Serializable {

    private CadastroDeTimeDao cadastroDeTimeDao = new CadastroDeTimeDao();
    // chamo de coringa!
    private CadastroDeTime cadastroDeTime = new CadastroDeTime(); //bug antigo!!!

    public List<CadastroDeTime> getLista() {
        return cadastroDeTimeDao.getAll();
    }

    public CadastroDeTime getCadastroDeTime() {
        return cadastroDeTime;
    }

    public void setCadastroDeTime(CadastroDeTime cadastroDeTime) {
        this.cadastroDeTime = cadastroDeTime;
    }

    public String excluir() {
        cadastroDeTimeDao.excluir(cadastroDeTime);
        cadastroDeTime = null;
        return "listContato.xhtml";
    }

    public String salvarCadastroDeTime() {
        cadastroDeTimeDao.salvar(cadastroDeTime);
        cadastroDeTime = null;
        return "listCadastroDeTime.xhtml";
    }

    public String novoCadastroDeTime() {
        cadastroDeTime = new CadastroDeTime();
        return "editCadastroDeTime.xhtml";
    }

    public String editar() {
        return "editCadastroDeTime.xhtml";
    }
}
