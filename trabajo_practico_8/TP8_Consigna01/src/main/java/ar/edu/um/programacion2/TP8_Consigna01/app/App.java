package ar.edu.um.programacion2.TP8_Consigna01.app;

import java.util.Scanner;

import ar.edu.um.programacion2.TP8_Consigna01.dao.TareaDao;
import ar.edu.um.programacion2.TP8_Consigna01.entidades.Tarea;

public class App {
    private static Scanner entradaScanner;
    
	public static void main(String[] args) {
		App a = new App();
		a.menu();
	}
	
	public void menu() {
    	int opc = 5;
    	entradaScanner = new Scanner(System.in);
    	
        while (opc != 0) {
        	System.out.println("------------------MENU PRINCIPAL--------------------");
        	System.out.println("Seleccione una opcion:");
        	System.out.println("1 - Agregar Registro");
        	System.out.println("2 - Modificar Registro");
        	System.out.println("3 - Eliminar Registro");
        	System.out.println("4 - Buscar Registro");
        	System.out.println("5 - Listar registros");
        	System.out.println("-----------------------------------------------------");
        	System.out.println("0 - SALIR");
        	
        	opc = Integer.parseInt(entradaScanner.nextLine());
        	
        	switch (opc) {
			case 0:
				System.out.println("Finalizando");
				break;
        	case 1:
				agregar();
				break;
			case 2:
//				modificar();
				break;
			case 3:
//				eliminar();
				break;
			case 4:
//				buscar();
				break;	
			case 5:
//				listar();
				break;				
			default:
				System.out.println("OPCION INVALIDA");
				break;
			}
		}
        
    }

    public static void agregar() {
    	try {
    		System.out.println("------------------AGREGAR REGISTRO--------------------");
    		System.out.println("Fecha de inicio:");
    		String fecha = entradaScanner.nextLine();
    		System.out.println("Autor:");
    		String autor = entradaScanner.nextLine();
    		System.out.println("Descripcion:");
    		String descripcion = entradaScanner.nextLine();
        
    		Tarea tar = new Tarea(fecha, autor, descripcion);
        
    		TareaDao td = new TareaDao();
    		td.guardar(tar);
        
    		System.out.println("REGISTRO AGREGADO");
			
		} catch (Exception e) {
			System.out.println("ERROR AL AGREGAR");
		}   
    }

}
