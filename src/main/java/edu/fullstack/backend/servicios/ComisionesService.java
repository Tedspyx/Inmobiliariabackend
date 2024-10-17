package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Comisiones;
import java.util.List;

public interface ComisionesService {
    List<Comisiones> listar();
    Comisiones listarId(int id);
    Comisiones add(Comisiones c);
    Comisiones edit(Comisiones c);
    Comisiones delete(int id);
}
