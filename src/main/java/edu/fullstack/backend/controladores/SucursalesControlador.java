package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.Sucursales;
import edu.fullstack.backend.servicios.SucursalesService;
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

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/sucursales"})
public class SucursalesControlador {
    @Autowired
    SucursalesService service;
    
    @GetMapping("/submit")
    public List<Sucursales> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Sucursales agregar(@RequestBody Sucursales s){
        return service.add(s);  
    }
    
    @GetMapping("/submit/{id}")
    public Sucursales listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Sucursales  editar(@RequestBody Sucursales s, @PathVariable("id") int id){
        s.setIdSucursales(id);
        return service.edit(s);
    }
    @DeleteMapping("/submit/{id}")
    public Sucursales delete(@PathVariable("id") int id){
        return service.delete(id);
}
    }

