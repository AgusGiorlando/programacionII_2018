package ar.edu.um.programacion2.TP6_Consigna01;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App 
{
    private static Scanner entradaScanner;

	public static void main( String[] args )
    {
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
    	
    	Conexion conexion = Conexion.getInstance();
    	
        String sql = "INSERT INTO Tarea VALUES (null,?,?,?);";
        
        try {
			PreparedStatement stmt = conexion.con.prepareStatement(sql);
			stmt.setString(1, fecha);
			stmt.setString(2, autor);
			stmt.setString(3, descripcion);
			
			stmt.execute();
			System.out.println("REGISTRO INSERTADO");
		} catch (SQLException e) {
			e.printStackTrace();
		}    	
    }
    
    public static void listar() {
    	System.out.println("------------------LISTAR REGISTROS--------------------");
    	
    	Conexion conexion = Conexion.getInstance();
    	
        String sql = "SELECT * FROM Tarea;";
        
        try {
			Statement stmt = conexion.con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				Integer id = rs.getInt("id");
				String inicio = rs.getString("inicio");
				String autor = rs.getString("autor");
				String descripcion = rs.getString("descripcion");
				
				System.out.println(String.valueOf(id) + "   " + inicio + "   " + autor + "   " + descripcion);
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
    }
    
    public static void buscar() {
    	System.out.println("------------------BUSCAR REGISTRO--------------------");
    	
    	Conexion conexion = Conexion.getInstance();
    	
    	System.out.println("Id:");
        Integer id_busqueda = entradaScanner.nextInt();
        
        String sql = "SELECT * FROM Tarea WHERE id=?;";
        
        try {
        	PreparedStatement stmt = conexion.con.prepareStatement(sql);
        	stmt.setInt(1, id_busqueda);
        	
        	ResultSet rs = stmt.executeQuery(sql);
			
			stmt.execute();
		
			Integer id = rs.getInt("id");
			String inicio = rs.getString("inicio");
			String autor = rs.getString("autor");
			String descripcion = rs.getString("descripcion");
				
			System.out.println(String.valueOf(id) + "   " + inicio + "   " + autor + "   " + descripcion);
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
    }
}
