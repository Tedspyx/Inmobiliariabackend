package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.PersonasCompras;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface PersonasComprasRepository extends Repository <PersonasCompras,Integer> {
    List<PersonasCompras> findAll();
    PersonasCompras findById(int id);
    PersonasCompras save(PersonasCompras p);
    void delete(PersonasCompras p);
}
