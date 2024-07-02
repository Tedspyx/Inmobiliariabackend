
package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.TipoInmueble;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface TipoInmuebleRepository extends Repository<TipoInmueble,Integer>{
    List<TipoInmueble> findAll();
}
