
package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.PersonasVentas;
import java.util.List;

public interface PersonasVentasService {
    List<PersonasVentas> listar();
    PersonasVentas listarId(int id);
    PersonasVentas add(PersonasVentas p);
    PersonasVentas edit(PersonasVentas p);
    PersonasVentas delete(int id);
}
