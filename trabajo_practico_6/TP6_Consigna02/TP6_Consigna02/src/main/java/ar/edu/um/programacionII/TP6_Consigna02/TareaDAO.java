package ar.edu.um.programacionII.TP6_Consigna02;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TareaDAO implements DAO<Object>{

	public void add(Object t) {

    	Conexion conexion = Conexion.getInstance();
    	
        String sql = "INSERT INTO Tarea VALUES (null,?,?,?);";
        
        try {
			PreparedStatement stmt = conexion.con.prepareStatement(sql);
			stmt.setString(1, ((Tarea) t).getInicio());
			stmt.setString(2, ((Tarea) t).getAutor());
			stmt.setString(3, ((Tarea) t).getDetalle());
			
			stmt.execute();
			System.out.println("REGISTRO INSERTADO");
		} catch (SQLException e) {
			e.printStackTrace();
		}    	
	}

	public void delete(Integer id) {
		Conexion conexion = Conexion.getInstance();
		
		String sql = "delete from Tarea where idTarea = ?;";
		
		 try {
	        	PreparedStatement stmt = conexion.con.prepareStatement(sql);
	        	stmt.setInt(1, id);
	        	
	        	int rs = stmt.executeUpdate();

	        	if(rs > 0) {
					System.out.println("Registro eliminado correctamente");
				}else {
					System.out.println("No se pudo eliminar el registro");
				}						
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public void update(Object t, Integer id) {
        Conexion conexion = Conexion.getInstance();
        
        String sql = "UPDATE Tarea SET inicio = ?,autor = ?, descripcion = ? WHERE idTarea = ?";
        
        try {
			PreparedStatement stmt = conexion.con.prepareStatement(sql);
			stmt.setString(1, ((Tarea) t).getInicio());
			stmt.setString(2, ((Tarea) t).getAutor());
			stmt.setString(3, ((Tarea) t).getDetalle());
			stmt.setInt(4, id);
			
			stmt.executeUpdate();
			System.out.println("REGISTRO MODIFICADO");
		} catch (SQLException e) {
			e.printStackTrace();
		}    	
	}

	public void findOne(Integer id) {
		Conexion conexion = Conexion.getInstance();
		
		String sql = "SELECT * FROM Tarea WHERE idTarea = ?";

		try {
        	PreparedStatement stmt = conexion.con.prepareStatement(sql);
        	stmt.setInt(1, id);
        	
        	ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Integer idTarea = rs.getInt("idTarea");
				String inicio = rs.getString("inicio");
				String autor = rs.getString("autor");
				String descripcion = rs.getString("descripcion");
				
				System.out.println(String.valueOf(idTarea) + "   " + inicio + "   " + autor + "   " + descripcion);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void findAll() {
    	Conexion conexion = Conexion.getInstance();
    	
        String sql = "SELECT * FROM Tarea;";
        
        try {
			Statement stmt = conexion.con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				Integer idTarea = rs.getInt("idTarea");
				String inicio = rs.getString("inicio");
				String autor = rs.getString("autor");
				String descripcion = rs.getString("descripcion");
				
				System.out.println(String.valueOf(idTarea) + "   " + inicio + "   " + autor + "   " + descripcion);
			}
						
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
