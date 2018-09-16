package ar.edu.um.programacion2.TP8_Consigna01.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarea")
public class Tarea {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
	@Column(name = "inicio")
	protected String inicio;
	
	@Column(name = "autor")
	protected String autor;
	
	@Column(name = "descripcion")
	protected String descripcion;	
	
	public Tarea() {
		// TODO Auto-generated constructor stub
	}

	public Tarea(String inicio, String autor, String descripcion) {
		super();
		this.inicio = inicio;
		this.autor = autor;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
