package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.PersonasAlquileres;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface PersonasAlquileresRepository extends Repository <PersonasAlquileres,Integer> {
    List<PersonasAlquileres> findAll();
    PersonasAlquileres findById(int id);
    PersonasAlquileres save(PersonasAlquileres p);
    void delete(PersonasAlquileres p);
}
