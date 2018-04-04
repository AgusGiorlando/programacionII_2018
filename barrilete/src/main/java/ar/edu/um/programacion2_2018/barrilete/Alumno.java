package ar.edu.um.programacion2_2018.barrilete;

import java.util.ArrayList;

public class Alumno extends Persona{
    protected long legajo;

    public Alumno() {
        System.out.println("Constructor de alumno");
    }

    public Alumno(String nombre, String apellido, long legajo) {
        super(nombre, apellido);
        System.out.println("Constructor de alumno");
        this.legajo = legajo;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " - Apellido: " + this.apellido + "- Legajo: " + this.legajo;
    }

    public void nada(){
        System.out.println("La nada misma");
    }

    public void nada(int i){
        System.out.println("La nada misma");
    }
}
