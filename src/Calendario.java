import java.util.List;

public class Calendario {
    List<Partido> partidos;

// Constructores.


    public Calendario(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public void mostrarPartidos() {
        for (Partido partido : partidos) {
            System.out.println(partido);
        }
    }

}
