package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.Avaluo;
import edu.fullstack.backend.servicios.AvaluoService;
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
@RequestMapping({"/avaluo"})
public class AvaluoControlador {
       @Autowired
    AvaluoService service;
    
    @GetMapping("/submit")
    public List<Avaluo> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Avaluo agregar(@RequestBody Avaluo a){
        return service.add(a);  
    }
    
    @GetMapping("/submit/{id}")
    public Avaluo listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Avaluo  editar(@RequestBody Avaluo a, @PathVariable("id") int id){
        a.setIdAvaluo(id);
        return service.edit(a);
    }
    @DeleteMapping("/submit/{id}")
    public Avaluo delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
