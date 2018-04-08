package ar.um.edu.programacion_2018.TP2_consigna01;

public class Cargo {
    private String nombre;
    private double basico;

    public Cargo() {
        this.nombre = "Titular";
        this.basico = 8000;
    }

    public Cargo(String nombre, double basico) {
        this.nombre = nombre;
        this.basico = basico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "nombre='" + nombre + '\'' +
                ", basico=" + basico +
                '}';
    }
}
