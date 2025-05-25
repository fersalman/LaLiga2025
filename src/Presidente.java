public class Presidente extends Persona {

    String profesion;

    // Contructores.

    public Presidente(String nombre, String apellidos, String profesion) {
        super(nombre, apellidos);
        this.profesion = profesion;
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        return "Presidente{"+ super.toString() +
                "profesion='" + profesion + '\'' +
                '}';
    }
}


