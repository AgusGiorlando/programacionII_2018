package ar.edu.um.programacionII2018;

import java.util.Arrays;

public class ComunidadDocente {
    private Profesor[] profesores;

    public ComunidadDocente() {
    }

    public ComunidadDocente(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public void add(Profesor p){
        Profesor[] tempArray = Arrays.copyOf(this.profesores, this.profesores.length + 1);
        tempArray[this.profesores.length - 1] = p;
        this.profesores = tempArray;
    }

    public void remove(Profesor p){

    }

    public void show(){

    }
}