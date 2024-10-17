package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.PersonasAlquileres;
import edu.fullstack.backend.servicios.PersonasAlquileresService;
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
@RequestMapping({"/personas_alquileres"})
public class PersonasAlquileresControlador {
    @Autowired
    PersonasAlquileresService service;
    
    @GetMapping("/submit")
    public List<PersonasAlquileres> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public PersonasAlquileres agregar(@RequestBody PersonasAlquileres p){
        return service.add(p);  
    }
    
    @GetMapping("/submit/{id}")
    public PersonasAlquileres listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public PersonasAlquileres  editar(@RequestBody PersonasAlquileres p, @PathVariable("id") int id){
        p.setIdPa(id);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public PersonasAlquileres delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
