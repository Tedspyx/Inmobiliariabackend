package edu.fullstack.backend.servicios;

import edu.fullstack.backend.dominio.InformacionComercial;
import java.util.List;

public interface InformacionComercialService {
    List<InformacionComercial> listar();
    InformacionComercial listarId(int id);
    InformacionComercial add(InformacionComercial i);
    InformacionComercial edit(InformacionComercial i);
    InformacionComercial delete(int id);
}
