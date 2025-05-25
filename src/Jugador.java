public class Jugador extends Persona {

    int dorsal;

    // Constructores.


    public Jugador(String nombre, String apellidos, int dorsal) {
        super(nombre, apellidos);
        this.dorsal = dorsal;
    }

    // Setters y Getters.


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String toString() {
        return "Jugador: " + super.toString() + " dorsal: " + dorsal;
    }

}
