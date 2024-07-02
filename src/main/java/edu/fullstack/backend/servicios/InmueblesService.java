
package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Inmuebles;
import java.util.List;

public interface InmueblesService {
    List<Inmuebles> listar();
    Inmuebles listarId(int id);
    Inmuebles add(Inmuebles i);
    Inmuebles edit(Inmuebles i);
    Inmuebles delete(int id);
}
