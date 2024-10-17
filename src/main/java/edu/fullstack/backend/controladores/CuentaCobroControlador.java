package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.CuentaCobro;
import edu.fullstack.backend.servicios.CuentaCobroService;
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
@RequestMapping({"/cuenta_cobro"})
public class CuentaCobroControlador {
 @Autowired
    CuentaCobroService service;
    
    @GetMapping("/submit")
    public List<CuentaCobro> listar(){
        return service.listar();
    }
    
    @PostMapping("/submit")
    public CuentaCobro agregar(@RequestBody CuentaCobro c){
        return service.add(c);  
    }
    
    @GetMapping("/submit/{id}")
    public CuentaCobro listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping("/submit/{id}")
    public CuentaCobro  editar(@RequestBody CuentaCobro c, @PathVariable("id") int id){
        c.setIdCuentaCobro(id);
        return service.edit(c);
    }
    @DeleteMapping("/submit/{id}")
    public CuentaCobro delete(@PathVariable("id") int id){
        return service.delete(id);
}
}
