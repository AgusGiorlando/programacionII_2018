package ar.edu.um.programacion2_2018.barrilete;

public class Persona {
    protected String nombre;
    protected String apellido;

    public Persona() {
        System.out.println("Constructor de persona");
    }

    public Persona(String nombre, String apellido) {
        System.out.println("Constructor de persona");
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Nombre" + this.nombre + " - Apellido:" + this.apellido;
    }

}