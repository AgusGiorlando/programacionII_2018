package ar.edu.um.programacion2.TP6_Consigna01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Conexion ourInstance;
	protected Connection con;
	public static Conexion getInstance() {
		if (ourInstance == null) {
			ourInstance = new Conexion();
			ourInstance.conectar();
		}
		return ourInstance;
	}
	
	private void conectar() {
		String usuario = "app";
        String password = "app";
        String url = "jdbc:mysql://localhost:3306/tp6_progII?user=" + usuario
                + "&password=" + password;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            this.con = DriverManager.getConnection(url);
            if (this.con != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
		
	}
	
	private Conexion() {
		
	}
}
