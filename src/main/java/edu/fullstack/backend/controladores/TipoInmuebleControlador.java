package edu.fullstack.backend.controladores;
import edu.fullstack.backend.dominio.TipoInmueble;
import edu.fullstack.backend.servicios.TipoInmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin(origins ="http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/tipo_inmueble"})
public class TipoInmuebleControlador {
    @Autowired
    TipoInmuebleService service;
    
    @GetMapping("/submit")
    public  List<TipoInmueble> listar(){
        return service.listar();
    }

}
