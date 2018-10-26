package ar.edu.um.programacion2.temporada2018.demoweb2.controladores;


import ar.edu.um.programacion2.temporada2018.demoweb2.entidades.Auto;
import ar.edu.um.programacion2.temporada2018.demoweb2.entidades.Persona;
import ar.edu.um.programacion2.temporada2018.demoweb2.repositorios.AutoRepository;
import ar.edu.um.programacion2.temporada2018.demoweb2.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaRestController {

        @Autowired
        PersonaRepository perRep;

        @Autowired
        AutoRepository autRep;

        //Find All
        @GetMapping("/")
        public List<Persona> recuperarTodo() {
            return perRep.findAll();
        }

        //Find autos de una persona
        @GetMapping("/{id}/autos")
        public List<Auto> recuperarAutos(@PathVariable(value = "id") Long id) {
            Persona per = perRep.findById(id).orElse(null);
            List<Auto> autos = autRep.findByTitular(per);
            return autos;
        }

    //
    @GetMapping("/buscar")
    public List<Persona> buscarPorMarca(@RequestParam(name = "name") String marca) {
        List<Persona> personas = perRep.findPorMarca(marca);
        return personas;
    }

    //Find by Id
        @GetMapping("/{id}")
        public Persona recuperarUno(@PathVariable(value = "id") Long id) {
            return perRep.findById(id).orElse(null);
        }

        //Create
        @PostMapping("/")
        public Persona crearPersona(@Valid @RequestBody Persona per) {
            return perRep.save(per);
        }

        //Update
        @PutMapping("/{id}")
        public Persona modificar(@PathVariable(value = "id") Long id, @Valid @RequestBody Persona data) {
            Persona per = perRep.findById(id).orElse(null);
            per.setNombre(data.getNombre());
            per.setApellido(data.getApellido());
            per.setFlota(data.getFlota());

            Persona nvaPersona = perRep.save(per);

            return nvaPersona;
        }

        //Delete
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> eliminar(@PathVariable(value = "id") Long id) {
            Persona per = perRep.findById(id).orElse(null);
            if (per == null) {
                return ResponseEntity.notFound().build();
            }
            perRep.delete(per);
            return ResponseEntity.ok().build();
        }
}
