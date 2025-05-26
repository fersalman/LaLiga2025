import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Jugador> jugadores = new ArrayList<>();
        List<Partido> partidos = new ArrayList<>();


        Presidente presidente = new Presidente("Florentino", "Pérez", "constructor");
        Entrenador entrenador = new Entrenador("Carlo", "Ancelotti", "1945");

        Jugador jugador1 = new Jugador("Daniel", "Carvajal", 2);
        Jugador jugador2 = new Jugador("Fede", "Valverde", 8);
        Jugador jugador3 = new Jugador("Jude", "Bellingham", 5);
        Jugador jugador4 = new Jugador("Kylian", "Mbappé", 9);
        Jugador jugador5 = new Jugador("Luka", "Modric", 10);
        Jugador jugador6 = new Jugador("Thibaut", "Courtois", 1);

        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        jugadores.add(jugador5);
        jugadores.add(jugador6);

        Equipo equipo1 = new Equipo(001, "Real Madrid", 654258963, "Concha Espina, 1", presidente, entrenador, jugadores);
        Equipo equipo2 = new Equipo(002, "Real Betis", 632145698, "Paseo Victoria, 33", presidente, entrenador, jugadores);

        Partido partido1 = new Partido(001, new Date(2025, 6, 17), 002, 001);

        partidos.add(partido1);
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
        for (Partido partido : partidos) {
            System.out.println(partido);
        }



    }
}
