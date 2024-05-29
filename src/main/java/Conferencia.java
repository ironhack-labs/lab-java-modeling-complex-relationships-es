import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;


import java.util.List;

@Entity
public class Conferencia extends Evento {
    @OneToMany(mappedBy = "conferencia", cascade = CascadeType.ALL)
    private List<Orador> oradores;

    public List<Orador> getOradores() {
        return oradores;
    }

    public void setOradores(List<Orador> oradores) {
        this.oradores = oradores;
    }


}
