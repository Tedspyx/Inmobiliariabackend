
package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.Inmuebles;
import edu.fullstack.backend.servicios.InmueblesService;
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
import java.util.List;

@CrossOrigin(origins ="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/inmuebles"})
public class InmueblesControlador {
    @Autowired
    InmueblesService service;
    
    @GetMapping("/submit")
    public  List<Inmuebles> listar(){
        return service.listar();
    }
    
    @GetMapping("/submit/{id}")
    public Inmuebles listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PostMapping("/submit")
    public Inmuebles agregar(@RequestBody Inmuebles i){
        return service.add(i);
    }
    
    @PutMapping("/submit/{id}")
    public Inmuebles editar(@RequestBody Inmuebles i, @PathVariable("id") int id){
        i.setIdInmu(id);
        return service.edit(i);
    }
    
    @DeleteMapping("/submit/{id}")
    public Inmuebles delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}
