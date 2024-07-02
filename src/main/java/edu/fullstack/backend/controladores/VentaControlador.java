
package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.Venta;
import edu.fullstack.backend.servicios.VentaService;
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
@RequestMapping({"/ventas"})
public class VentaControlador {
       @Autowired
    VentaService service;
    
    @GetMapping("/submit")
    public List<Venta> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public Venta agregar(@RequestBody Venta v){
        return service.add(v);  
    }
    
    @GetMapping("/submit/{id}")
    public Venta listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public Venta  editar(@RequestBody Venta v, @PathVariable("id") int id){
        v.setId(id);
        return service.edit(v);
    }
    @DeleteMapping("/submit/{id}")
    public Venta delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
