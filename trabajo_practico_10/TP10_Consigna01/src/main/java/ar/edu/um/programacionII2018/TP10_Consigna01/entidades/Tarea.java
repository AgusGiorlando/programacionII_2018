package ar.edu.um.programacionII2018.TP10_Consigna01.entidades;

import javax.persistence.*;

@Entity
@Table(name = "tarea")
public class Tarea {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(name = "inicio")
    protected String inicio;

    @Column(name = "autor")
    protected String autor;

    @Column(name = "descripcion")
    protected String descripcion;

    public Tarea(String inicio, String autor, String descripcion) {
        this.inicio = inicio;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    public Tarea() {
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

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", inicio='" + inicio + '\'' +
                ", autor='" + autor + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
