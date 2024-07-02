package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Avaluo;
import java.util.List;


public interface AvaluoService {
    List<Avaluo> listar();
    Avaluo listarId(int id);
    Avaluo add(Avaluo a);
    Avaluo edit(Avaluo a);
    Avaluo delete(int id);
}
