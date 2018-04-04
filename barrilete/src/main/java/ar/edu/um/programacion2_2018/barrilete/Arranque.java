package ar.edu.um.programacion2_2018.barrilete;

import java.util.ArrayList;
import java.util.List;

public class Arranque {
    public static void main (String[] args){
        Arranque a = new Arranque();
        a.arrancar();
    }

    public void arrancar(){
        Persona pers1 = new Persona("pepe", "hongo");
        System.out.println(pers1.toString());

        Alumno alu1 = new Alumno("juan", "perez", 22134);
        System.out.println(alu1.toString());

        Alumno alu2 = new Alumno();
        Persona pers2 = new Persona();
        Persona pers3 = new Alumno("pepe", "reloaded",22);
        System.out.println(pers3.toString());

        //pers3.nada(); NO FUNCIONA
        ((Alumno) pers3).nada(); //CASTEO

        Persona[] personas = new Persona[3];
        personas[0] = pers1;
        personas[1] = alu1;
        personas[2] = pers3;

        System.out.println("Mostrando personas");
        for (int i=0 ; i<3 ; i++){
            System.out.println(personas[i].toString()); //No se cual metodo es el que se va a ejecutar hasta que corra el programa
        }

        Perro boby = new Perro();

        Animal firulais = new Perro(); //SIEMPRE
        List<Animal> perros = new ArrayList<Animal>();
    }
}
