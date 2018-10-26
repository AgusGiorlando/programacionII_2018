package ar.edu.um.programacionII2018;

public class TrabajoPractico {
    private int numero;
    private String ejercitacion;
    private int horasLaboratorio;

    public TrabajoPractico() {
        this.numero = 01;
        this.ejercitacion = "Constructores";
        this.horasLaboratorio = 5;
    }

    public TrabajoPractico(int numero, String ejercitacion, int horasLaboratorio) {
        this.numero = numero;
        this.ejercitacion = ejercitacion;
        this.horasLaboratorio = horasLaboratorio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEjercitacion() {
        return ejercitacion;
    }

    public void setEjercitacion(String ejercitacion) {
        this.ejercitacion = ejercitacion;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    @Override
    public String toString() {
        return "TrabajoPractico{" +
                "numero=" + numero +
                ", ejercitacion='" + ejercitacion + '\'' +
                ", horasLaboratorio=" + horasLaboratorio +
                '}';
    }
}
