
package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.Visita;
import edu.fullstack.backend.servicios.VisitaService;
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
@RequestMapping({"/visita"})
public class VisitaControlador {
     @Autowired
    VisitaService service;
    
    @GetMapping("/submit")
    public List<Visita> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Visita agregar(@RequestBody Visita v){
        return service.add(v);  
    }
    
    @GetMapping("/submit/{id}")
    public Visita listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Visita  editar(@RequestBody Visita v, @PathVariable("id") int id){
        v.setId(id);
        return service.edit(v);
    }
    @DeleteMapping("/submit/{id}")
    public Visita delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
