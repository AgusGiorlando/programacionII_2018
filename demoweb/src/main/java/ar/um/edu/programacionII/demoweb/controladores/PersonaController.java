package src.main.java.ar.um.edu.programacionII.demoweb.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import src.main.java.ar.um.edu.programacionII.demoweb.entidades.Persona;
import src.main.java.ar.um.edu.programacionII.demoweb.repositorios.PersonaRepository;

@Controller
@RequestMapping("/persona")
public class PersonaController {

	@Autowired
	protected PersonaRepository persRep;
	
	@RequestMapping("vista1")
	public String mostrarLoQueSea(HttpSession sesion, Model uiModel) {
		Persona p = new Persona("Pepe", "Hongo");
		uiModel.addAttribute("p", p);
		persRep.save(p);
		return "vista1";		
	}
	
	@RequestMapping("vista2")
	public String mostrarLoQueSea2() {
		return "dir/vista2";		
	}
}
