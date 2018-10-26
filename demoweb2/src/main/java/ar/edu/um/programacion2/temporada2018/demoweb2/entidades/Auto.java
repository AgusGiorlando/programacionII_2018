package ar.edu.um.programacion2.temporada2018.demoweb2.entidades;

import javax.persistence.*;

@Entity
@Table(name = "auto")
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String marca;
    protected String modelo;

    //Relacion con Persona
    @ManyToOne
    protected Persona titular;

    public Auto() {
    }

    public Auto(String marca, String modelo, Persona titular) {
        this.marca = marca;
        this.modelo = modelo;
        this.titular = titular;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }
}
