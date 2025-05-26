public abstract class Persona {
    String nombre;
    String apellidos;

    // Constructor.

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
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

    @Override
    public String toString() {
        return "nombre= '" + nombre + '\'' +
                ", apellidos='" + apellidos + "',";
    }
}
