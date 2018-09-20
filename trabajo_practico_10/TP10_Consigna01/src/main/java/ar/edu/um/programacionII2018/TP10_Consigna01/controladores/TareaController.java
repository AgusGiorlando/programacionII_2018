package ar.edu.um.programacionII2018.TP10_Consigna01.controladores;

import ar.edu.um.programacionII2018.TP10_Consigna01.entidades.Tarea;
import ar.edu.um.programacionII2018.TP10_Consigna01.repositorios.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TareaController {
    @Autowired
    TareaRepository tarRep;

    //Find All
    @GetMapping("/tareas")
    public List<Tarea> recuperarTodo(){
        return tarRep.findAll();
    }

    //Find by Id
    @GetMapping("/tareas/{id}")
    public Tarea recuperarUno(@PathVariable(value = "id") Long id){
        return tarRep.findById(id).orElse(null);
    }

    //Create
    @PostMapping("/tareas")
    public Tarea crearTarea(@Valid @RequestBody Tarea tar){
        return tarRep.save(tar);
    }

    //Update
    @PutMapping("/tareas/{id}")
    public Tarea modificar(@PathVariable(value = "id") Long id, @Valid @RequestBody Tarea data){
        Tarea tar = tarRep.findById(id).orElse(null);
        tar.setInicio(data.getInicio());
        tar.setAutor(data.getAutor());
        tar.setDescripcion(data.getDescripcion());

        Tarea nvaTarea = tarRep.save(tar);

        return nvaTarea;
    }

    //Delete
    @DeleteMapping("tareas/{id}")
    public ResponseEntity<?> eliminar(@PathVariable(value = "id") Long id){
        Tarea tar = tarRep.findById(id).orElse(null);
        tarRep.delete(tar);

        return ResponseEntity.ok().build();
    }
}
