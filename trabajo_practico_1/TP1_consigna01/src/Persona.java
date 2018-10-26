
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Persona {
    private long dni;
    private String apellido;
    private String nombre;

    public Persona() {
    }

    public Persona(long dni, String apellido, String nombre) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void input(){    
        Scanner entradaScanner = new Scanner (System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese DNI: ");
        this.dni = Long.valueOf(entradaScanner.nextLine ());
        System.out.println("Ingrese apellido: ");
        this.apellido = entradaScanner.nextLine ();
        System.out.println("Ingrese nombre: ");
        this.nombre = entradaScanner.nextLine ();
        entradaScanner.close();
    }
    
    public void show(){
        System.out.println("-------------------------------------------------");
        System.out.println("DNI:");
        System.out.println(this.getDni());
        System.out.println("Apellido:");
        System.out.println(this.getApellido());
        System.out.println("Nombre:");
        System.out.println(this.getNombre());        
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }
}
