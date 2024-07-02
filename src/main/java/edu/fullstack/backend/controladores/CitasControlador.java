package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.Citas;
import edu.fullstack.backend.servicios.CitasService;
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
@RequestMapping({"/citas"})
public class CitasControlador {
    @Autowired
    CitasService service;
    
    @GetMapping("/submit")
    public List<Citas> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Citas agregar(@RequestBody Citas c){
        return service.add(c);  
    }
    
    @GetMapping("/submit/{id}")
    public Citas listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Citas  editar(@RequestBody Citas c, @PathVariable("id") int id){
        c.setId(id);
        return service.edit(c);
    }
    @DeleteMapping("/submit/{id}")
    public Citas delete(@PathVariable("id") int id){
        return service.delete(id);
}
}