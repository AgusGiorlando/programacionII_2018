package src.main.java.ar.um.edu.programacionII.demoweb.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import src.main.java.ar.um.edu.programacionII.demoweb.entidades.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
	
}
