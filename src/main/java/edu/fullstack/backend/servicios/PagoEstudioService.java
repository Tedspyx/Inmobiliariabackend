package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.PagoEstudio;
import java.util.List;

public interface PagoEstudioService {
    List<PagoEstudio> listar();
    PagoEstudio listarId(int id);
    PagoEstudio add(PagoEstudio p);
    PagoEstudio edit(PagoEstudio p);
    PagoEstudio delete(int id);
}
