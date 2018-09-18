package ar.edu.um.programacionII.TP6_Consigna02;

import java.util.Scanner;

public class App 
{
    private static Scanner entradaScanner;
    private static TareaDAO dao = new TareaDAO();
    
	public static void main( String[] args ) {
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
				modificar();
				break;
			case 3:
				eliminar();
				break;
			case 4:
				buscar();
				break;	
			case 5:
				listar();
				break;				
			default:
				System.out.println("OPCION INVALIDA");
				break;
			}
		}
        
    }

	public static void agregar() {
    	System.out.println("------------------AGREGAR REGISTRO--------------------");
    	System.out.println("Fecha de inicio:");
        String fecha = entradaScanner.nextLine();
        System.out.println("Autor:");
        String autor = entradaScanner.nextLine();
        System.out.println("Descripcion:");
        String descripcion = entradaScanner.nextLine();
        
        Tarea tar = new Tarea(fecha,autor,descripcion);
        dao.add(tar);
    }    
	
	public static void modificar() {
    	System.out.println("------------------MODIFICAR REGISTRO--------------------");
    	System.out.println("Id: ");
    	Integer id_busqueda = Integer.valueOf(entradaScanner.nextLine());
    	
    	System.out.println("Fecha de inicio:");
        String fecha = entradaScanner.nextLine();
        System.out.println("Autor:");
        String autor = entradaScanner.nextLine();
        System.out.println("Descripcion:");
        String descripcion = entradaScanner.nextLine();

        Tarea tar = new Tarea(fecha,autor,descripcion);
        dao.update(tar,id_busqueda);
    }
	
	public static void eliminar() {
		System.out.println("------------------ELIMINAR REGISTRO--------------------");    	
    	System.out.println("Id:");
    	Integer id_busqueda = Integer.valueOf(entradaScanner.nextLine());
    	
    	dao.delete(id_busqueda);        
	}
	
	public static void listar() {
    	System.out.println("------------------LISTAR REGISTROS--------------------");
    	dao.findAll();     

	}
	
	public static void buscar() {
    	System.out.println("------------------BUSCAR REGISTRO--------------------");
    	System.out.println("Id:");
    	Integer id_busqueda = Integer.valueOf(entradaScanner.nextLine());
    	
    	dao.findOne(id_busqueda);
	}
}