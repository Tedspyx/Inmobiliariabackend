
package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.InformacionComercial;
import edu.fullstack.backend.servicios.InformacionComercialService;
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
@RequestMapping({"/informacioncomercial"})
public class InformacionComercialControlador {
    @Autowired
    InformacionComercialService service;
    
    @GetMapping("/submit")
    public List<InformacionComercial> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public InformacionComercial agregar(@RequestBody InformacionComercial i){
        return service.add(i);  
    }
    
    @GetMapping("/submit/{id}")
    public InformacionComercial listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public InformacionComercial  editar(@RequestBody InformacionComercial i, @PathVariable("id") int id){
        i.setIdInfo(id);
        return service.edit(i);
    }
    @DeleteMapping("/submit/{id}")
    public InformacionComercial delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
