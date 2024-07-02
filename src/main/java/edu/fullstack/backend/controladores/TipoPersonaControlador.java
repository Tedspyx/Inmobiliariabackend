package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.TipoPersona;
import edu.fullstack.backend.servicios.TipoPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/tipopersonas"})
public class TipoPersonaControlador {
    @Autowired
    TipoPersonaService service;
    
    @GetMapping("/submit")
    public List<TipoPersona> listar(){
        return service.listar();
    }
        @GetMapping("/submit/{id}")
    public TipoPersona listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
}
