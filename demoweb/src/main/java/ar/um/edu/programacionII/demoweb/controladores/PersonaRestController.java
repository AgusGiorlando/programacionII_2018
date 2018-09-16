package src.main.java.ar.um.edu.programacionII.demoweb.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import src.main.java.ar.um.edu.programacionII.demoweb.repositorios.PersonaRepository;

@RestController
@RequestMapping("/personarest")
public class PersonaRestController {
	@Autowired
	protected PersonaRepository persRep;
	
	@GetMapping("/")
	public List<Persona> leerTodos(){
		List<Persona> personas = persRep.findAll();
	return personas;
	}

	@GetMapping("/{id}")
	public Persona leerUno(@PathVariable(name="id") Long id) {
		Persona p = persRep.findById(id).orElse(null);
	return p;
	}
	
	@PostMapping("/")
	public Persona grabar(@Valid @RequestBody Persona persona) {
		Persona nueva = persRep.save(persona);
	return nueva;
	}
}
