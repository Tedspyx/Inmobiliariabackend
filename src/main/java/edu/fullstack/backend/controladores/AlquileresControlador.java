package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.Alquileres;
import edu.fullstack.backend.servicios.AlquileresService;
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
@RequestMapping({"/alquileres"})
public class AlquileresControlador {
     @Autowired
    AlquileresService service;
    
    @GetMapping("/submit")
    public List<Alquileres> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Alquileres agregar(@RequestBody Alquileres a){
        return service.add(a);  
    }
    
    @GetMapping("/submit/{id}")
    public Alquileres listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Alquileres  editar(@RequestBody Alquileres a, @PathVariable("id") int id){
        a.setIdAlquiler(id);
        return service.edit(a);
    }
    @DeleteMapping("/submit/{id}")
    public Alquileres delete(@PathVariable("id") int id){
        return service.delete(id);
}
}