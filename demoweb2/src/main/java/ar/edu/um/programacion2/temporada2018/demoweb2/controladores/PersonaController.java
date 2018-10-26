package ar.edu.um.programacion2.temporada2018.demoweb2.controladores;


import ar.edu.um.programacion2.temporada2018.demoweb2.entidades.Persona;
import ar.edu.um.programacion2.temporada2018.demoweb2.repositorios.PersonaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    protected PersonaRepository persRep;

    @RequestMapping(value = "vista1")
    @ResponseBody
    public String mostrarLoQueSea(HttpSession sesion, Model uiModel) {
        Persona p = new Persona("pepe","hongo");
        uiModel.addAttribute("p", p);
        uiModel.addAttribute("etiqueta","sdfgdsfgdfgdfgdfgdffg");
        persRep.save(p);

        return "vista1";
    }

    @RequestMapping("vista2")
    public String sdgsdgsdfggsdfgsdgsdfg() {

        return "dir/vista2";
    }

}
