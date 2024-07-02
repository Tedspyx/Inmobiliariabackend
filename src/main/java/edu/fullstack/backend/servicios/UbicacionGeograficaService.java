package edu.fullstack.backend.servicios;

import edu.fullstack.backend.dominio.UbicacionGeografica;
import java.util.List;

public interface UbicacionGeograficaService {
    List<UbicacionGeografica> listar();
    UbicacionGeografica listarId(int id);
    UbicacionGeografica add(UbicacionGeografica u);
    UbicacionGeografica edit(UbicacionGeografica u);
    UbicacionGeografica delete(int id);
}
