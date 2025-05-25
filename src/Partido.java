import java.util.Date;

public class Partido {
    int idPartido;
    Date fecha;
    int equipoLocal;
    int equipoVisitante;

    public Partido(int idPartido, Date fecha, int equipoLocal, int equipoVisitante) {
        this.idPartido = idPartido;
        this.fecha = fecha;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }
}
