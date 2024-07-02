
package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.Comision;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface ComisionRepository extends Repository<Comision,Integer> {
    List<Comision> findAll();
    Comision findById(int id);
    Comision save(Comision c);
    void delete(Comision c);
}
