
package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.TipoPersona;
import edu.fullstack.backend.infraestructura.TipoPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoPersonaServiceImp implements TipoPersonaService {
     @Autowired
    private TipoPersonaRepository repositorio;
    
    @Override
    public List<TipoPersona> listar() {
        return repositorio.findAll();
    }
    @Override
    public TipoPersona listarId(int id){
        return repositorio.findById(id);
    }
}
