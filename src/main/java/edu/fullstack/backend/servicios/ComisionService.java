
package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Comision;
import java.util.List;

public interface ComisionService {
        List<Comision> listar();
    Comision listarId(int id);
    Comision add(Comision c);
    Comision edit(Comision c);
    Comision delete(int id);
}
