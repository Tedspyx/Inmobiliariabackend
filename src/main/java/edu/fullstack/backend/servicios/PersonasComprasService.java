package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.PersonasCompras;
import java.util.List;
public interface PersonasComprasService {
    List<PersonasCompras> listar();
    PersonasCompras listarId(int id);
    PersonasCompras add(PersonasCompras p);
    PersonasCompras edit(PersonasCompras p);
    PersonasCompras delete(int id);
}
