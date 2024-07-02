
package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.TipoPersona;
import java.util.List;


public interface TipoPersonaService {
        List<TipoPersona> listar();        
        TipoPersona listarId(int id);
}
