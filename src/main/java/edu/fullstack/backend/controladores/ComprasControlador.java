package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.Compras;
import edu.fullstack.backend.servicios.ComprasService;
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
@RequestMapping({"/compras"})
public class ComprasControlador {
      @Autowired
    ComprasService service;
    
    @GetMapping("/submit")
    public List<Compras> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Compras agregar(@RequestBody Compras c){
        return service.add(c);  
    }
    
    @GetMapping("/submit/{id}")
    public Compras listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Compras  editar(@RequestBody Compras c, @PathVariable("id") int id){
        c.setIdCompras(id);
        return service.edit(c);
    }
    @DeleteMapping("/submit/{id}")
    public Compras delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
