
package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.PersonasAlquileres;
import java.util.List;
public interface PersonasAlquileresService {
    List<PersonasAlquileres> listar();
    PersonasAlquileres listarId(int id);
    PersonasAlquileres add(PersonasAlquileres p);
    PersonasAlquileres edit(PersonasAlquileres p);
    PersonasAlquileres delete(int id);
}
