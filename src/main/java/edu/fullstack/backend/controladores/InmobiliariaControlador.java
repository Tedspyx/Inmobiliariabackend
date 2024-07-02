
package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.Inmobiliaria;
import edu.fullstack.backend.servicios.InmobiliariaService;
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
@RequestMapping({"/inmobiliaria"})
public class InmobiliariaControlador {
        @Autowired
    InmobiliariaService service;
    
    @GetMapping("/submit")
    public List<Inmobiliaria> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Inmobiliaria agregar(@RequestBody Inmobiliaria i){
        return service.add(i);  
    }
    
    @GetMapping("/submit/{id}")
    public Inmobiliaria listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Inmobiliaria  editar(@RequestBody Inmobiliaria i, @PathVariable("id") int id){
        i.setIdInmobiliaria(id);
        return service.edit(i);
    }
    @DeleteMapping("/submit/{id}")
    public Inmobiliaria delete(@PathVariable("id") int id){
        return service.delete(id);
}
}

