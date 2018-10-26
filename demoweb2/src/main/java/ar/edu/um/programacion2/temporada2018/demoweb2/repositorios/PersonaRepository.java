package ar.edu.um.programacion2.temporada2018.demoweb2.repositorios;

import ar.edu.um.programacion2.temporada2018.demoweb2.entidades.Auto;
import ar.edu.um.programacion2.temporada2018.demoweb2.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    public List<Persona> findByNombreAndApellido(String nombre, String apellido);

    @Query("SELECT p from Persona p join p.flota a" +
            "where p.marca like :marca")
    List<Persona> findPorMarca(
            @Param("marca") String marca
    );
}
