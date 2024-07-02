
package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.Inmuebles;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface InmueblesRepository extends Repository<Inmuebles, Integer>{
    List<Inmuebles> findAll();
    Inmuebles findById(int id);
    Inmuebles save(Inmuebles i);
    void delete(Inmuebles i);
}
