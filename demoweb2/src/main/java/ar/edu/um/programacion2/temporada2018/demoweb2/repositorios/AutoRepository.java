package ar.edu.um.programacion2.temporada2018.demoweb2.repositorios;

import ar.edu.um.programacion2.temporada2018.demoweb2.entidades.Auto;
import ar.edu.um.programacion2.temporada2018.demoweb2.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AutoRepository extends JpaRepository<Auto, Long> {
    List<Auto> findByTitular(Persona titular);

}
