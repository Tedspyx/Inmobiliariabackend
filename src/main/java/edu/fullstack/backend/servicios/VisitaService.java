
package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Visita;
import java.util.List;

public interface VisitaService {
    List<Visita> listar();
    Visita listarId(int id);
    Visita add(Visita v);
    Visita edit(Visita v);
    Visita delete(int id);
}
