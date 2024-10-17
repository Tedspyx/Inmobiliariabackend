package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.PersonasCompras;
import edu.fullstack.backend.servicios.PersonasComprasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/personas_compras"})
public class PersonasComprasControlador {
    @Autowired
    PersonasComprasService service;
    
    @GetMapping("/submit")
    public List<PersonasCompras> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public PersonasCompras agregar(@RequestBody PersonasCompras p){
        return service.add(p);  
    }
    
    @GetMapping("/submit/{id}")
    public PersonasCompras listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public PersonasCompras  editar(@RequestBody PersonasCompras p, @PathVariable("id") int id){
        p.setIdPc(id);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public PersonasCompras delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
