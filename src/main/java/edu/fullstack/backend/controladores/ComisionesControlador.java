package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.Comisiones;
import edu.fullstack.backend.servicios.ComisionesService;
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
public class ComisionesControlador {
    @Autowired
    ComisionesService service;
    
    @GetMapping("/submit")
    public List<Comisiones> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Comisiones agregar(@RequestBody Comisiones c){
        return service.add(c);  
    }
    
    @GetMapping("/submit/{id}")
    public Comisiones listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Comisiones  editar(@RequestBody Comisiones c, @PathVariable("id") int id){
        c.setIdComision(id);
        return service.edit(c);
    }
    @DeleteMapping("/submit/{id}")
    public Comisiones delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
