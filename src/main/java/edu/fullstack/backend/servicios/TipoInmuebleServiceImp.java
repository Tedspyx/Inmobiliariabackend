
package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.TipoInmueble;
import edu.fullstack.backend.infraestructura.TipoInmuebleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoInmuebleServiceImp implements TipoInmuebleService{
    @Autowired
    private TipoInmuebleRepository repositorio;
    
    @Override
    public List<TipoInmueble> listar(){
        return repositorio.findAll();
    }
}
