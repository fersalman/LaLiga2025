import java.util.List;

public class Equipo {
    int idEquipo;
    String nombreEquipo;
    int telefonoEquipo;
    String direccionEquipo;
    Presidente presidente;
    Entrenador entrenador;
    List<Jugador> jugadores;

    // Constructor.

    public Equipo(int idEquipo, String nombreEquipo, int telefonoEquipo, String direccionEquipo, Presidente presidente, Entrenador entrenador, List<Jugador> jugadores) {
        this.idEquipo = idEquipo;
        this.nombreEquipo = nombreEquipo;
        this.telefonoEquipo = telefonoEquipo;
        this.direccionEquipo = direccionEquipo;
        this.presidente = presidente;
        this.entrenador = entrenador;
        this.jugadores = jugadores;
    }

    // Setters y Getters.


    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getTelefonoEquipo() {
        return telefonoEquipo;
    }

    public void setTelefonoEquipo(int telefonoEquipo) {
        this.telefonoEquipo = telefonoEquipo;
    }

    public String getDireccionEquipo() {
        return direccionEquipo;
    }

    public void setDireccionEquipo(String direccionEquipo) {
        this.direccionEquipo = direccionEquipo;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo {" +
                "idEquipo=" + idEquipo +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", telefonoEquipo=" + telefonoEquipo +
                ", direccionEquipo='" + direccionEquipo + '\'' +
                ", presidente=" + presidente +
                ", entrenador=" + entrenador +
                ", jugadores=" + jugadores +
                '}';
    }
}
