package ar.um.edu.programacion2_2018.test;

import ar.edu.um.programacion2_2018.barrilete.Matematica;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatematicaTest {
    @Test
    public void sumarTest(){
        int resultado = Matematica.sumar(2,2);
        assertEquals(4,resultado);
        assertEquals(4,Matematica.sumar(1,3));
    }

    @Test
    public void restarTest(){
        int resultado = Matematica.restar(2,2);
        assertEquals(0,resultado);
    }
}
