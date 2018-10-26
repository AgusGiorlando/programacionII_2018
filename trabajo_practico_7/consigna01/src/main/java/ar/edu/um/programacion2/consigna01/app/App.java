package ar.edu.um.programacion2.consigna01.app;

import java.util.ArrayList;
import java.util.List;

import ar.edu.um.programacion2.consigna01.anotaciones.Archivable;
import ar.edu.um.programacion2.consigna01.entidades.Persona;

public class App {

	public static void main(String[] args) {
		@Archivable(filename="Lista")
        List<Object> lista = new ArrayList<Object>();
        lista.add(new Persona("Agustin", "Giorlando", 23));
        lista.add(new Persona("Pepe", "Hongo", 33));
	}

}
