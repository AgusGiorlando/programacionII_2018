package ar.edu.um.programacion2.temporada2018.demoweb2.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String nombre;
    protected String apellido;

    //Relacion con Auto
    @OneToMany(mappedBy = "titular", targetEntity = Auto.class)
    protected Set<Auto> flota;

    public Persona() {}

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @JsonIgnore
    public Set<Auto> getFlota() {
        return flota;
    }

    public void setFlota(Set<Auto> flota) {
        this.flota = flota;
    }
}
