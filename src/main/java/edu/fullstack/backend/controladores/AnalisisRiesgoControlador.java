package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.AnalisisRiesgo;
import edu.fullstack.backend.servicios.AnalisisRiesgoService;
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
@RequestMapping({"/analisisriesgo"})
public class AnalisisRiesgoControlador {
    @Autowired
    AnalisisRiesgoService service;
    
    @GetMapping("/submit")
    public List<AnalisisRiesgo> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public AnalisisRiesgo agregar(@RequestBody AnalisisRiesgo a){
        return service.add(a);  
    }
    
    @GetMapping("/submit/{id}")
    public AnalisisRiesgo listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public AnalisisRiesgo  editar(@RequestBody AnalisisRiesgo a, @PathVariable("id") int id){
        a.setId(id);
        return service.edit(a);
    }
    @DeleteMapping("/submit/{id}")
    public AnalisisRiesgo delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
