
package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.Comision;
import edu.fullstack.backend.servicios.ComisionService;
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
@RequestMapping({"/comisiones"})
public class ComisionControlador {
     @Autowired
    ComisionService service;
    
    @GetMapping("/submit")
    public List<Comision> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Comision agregar(@RequestBody Comision c){
        return service.add(c);  
    }
    
    @GetMapping("/submit/{id}")
    public Comision listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Comision  editar(@RequestBody Comision c, @PathVariable("id") int id){
        c.setId(id);
        return service.edit(c);
    }
    @DeleteMapping("/submit/{id}")
    public Comision delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
