public class Entrenador extends Persona {


    String añoNacimiento;


    // Constructores.


    public Entrenador(String nombre, String apellidos, String añoNacimiento) {
        super(nombre, apellidos);
        this.añoNacimiento = añoNacimiento;
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

    public String getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(String añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String toString() {
        return "Entrenador: " + super.toString() + "Año de nacimiento: " + añoNacimiento;
    }
}
