
package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.UbicacionGeografica;
import edu.fullstack.backend.servicios.UbicacionGeograficaService;
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
@RequestMapping({"/ubicaciongeografica"})
public class UbicacionGeograficaControlador {
    @Autowired
    UbicacionGeograficaService service;
@GetMapping("/submit")
    public List<UbicacionGeografica> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public UbicacionGeografica agregar(@RequestBody UbicacionGeografica u){
        return service.add(u);  
    }
    
    @GetMapping("/submit/{id}")
    public UbicacionGeografica listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public UbicacionGeografica  editar(@RequestBody UbicacionGeografica u, @PathVariable("id") int id){
        u.setIdUbicacion(id);
        return service.edit(u);
    }
    @DeleteMapping("/submit/{id}")
    public UbicacionGeografica delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
