package ar.edu.um.programacionII2018.TP10_Consigna01.repositorios;

import ar.edu.um.programacionII2018.TP10_Consigna01.entidades.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
