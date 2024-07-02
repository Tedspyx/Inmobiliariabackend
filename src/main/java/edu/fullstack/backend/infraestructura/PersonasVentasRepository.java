
package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.PersonasVentas;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface PersonasVentasRepository extends Repository<PersonasVentas,Integer>{
    List<PersonasVentas> findAll();
    PersonasVentas findById(int id);
    PersonasVentas save(PersonasVentas p);
    void delete(PersonasVentas p);
}
