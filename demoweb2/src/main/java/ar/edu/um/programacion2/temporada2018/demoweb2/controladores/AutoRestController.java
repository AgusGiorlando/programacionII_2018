package ar.edu.um.programacion2.temporada2018.demoweb2.controladores;

import ar.edu.um.programacion2.temporada2018.demoweb2.entidades.Auto;
import ar.edu.um.programacion2.temporada2018.demoweb2.repositorios.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/auto")
public class AutoRestController {

        @Autowired
        AutoRepository autRep;

        //Find All
        @GetMapping("/")
        public List<Auto> recuperarTodo() {
            return autRep.findAll();
        }

        //Find by Id
        @GetMapping("/{id}")
        public Auto recuperarUno(@PathVariable(value = "id") Long id) {
            return autRep.findById(id).orElse(null);
        }

        //Create
        @PostMapping("/")
        public Auto crearAuto(@Valid @RequestBody Auto aut) {
            return autRep.save(aut);
        }

        //Update
        @PutMapping("/{id}")
        public Auto modificar(@PathVariable(value = "id") Long id, @Valid @RequestBody Auto data) {
            Auto aut = autRep.findById(id).orElse(null);
            aut.setMarca(data.getMarca());
            aut.setModelo(data.getModelo());
            aut.setTitular(data.getTitular());

            Auto nvoAuto = autRep.save(aut);

            return nvoAuto;
        }

        //Delete
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> eliminar(@PathVariable(value = "id") Long id) {
            Auto aut = autRep.findById(id).orElse(null);
            if (aut == null) {
                return ResponseEntity.notFound().build();
            }
            autRep.delete(aut);
            return ResponseEntity.ok().build();
        }

}
