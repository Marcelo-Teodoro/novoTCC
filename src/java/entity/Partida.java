package entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.LocalGregorianCalendar;

public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private BaseCalendar.Date dataPartida;
    private String localPartida;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BaseCalendar.Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(BaseCalendar.Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    
    
}
