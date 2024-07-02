package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.PagoEstudio;
import edu.fullstack.backend.servicios.PagoEstudioService;
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
@RequestMapping({"/pagoestudio"})
public class PagoEstudioControlador {
    
    @Autowired
    PagoEstudioService service;
    
    @GetMapping("/submit")
    public List<PagoEstudio> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public PagoEstudio agregar(@RequestBody PagoEstudio p){
        return service.add(p);  
    }
    
    @GetMapping("/submit/{id}")
    public PagoEstudio listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public PagoEstudio  editar(@RequestBody PagoEstudio p, @PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }
    @DeleteMapping("/submit/{id}")
    public PagoEstudio delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
