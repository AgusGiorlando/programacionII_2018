package ar.edu.um.programacionII.TP6_Consigna02;

public class Tarea {
	private int idTarea;
	private String inicio;
	private String autor;
	private String detalle;
	
	public Tarea() {
		// TODO Auto-generated constructor stub
	}

	public Tarea(String inicio, String autor, String detalle) {
		super();
		this.inicio = inicio;
		this.autor = autor;
		this.detalle = detalle;
	}

	public int getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Tarea [idTarea=" + idTarea + ", inicio=" + inicio + ", autor=" + autor + ", detalle=" + detalle + "]";
	}
	
	
}
