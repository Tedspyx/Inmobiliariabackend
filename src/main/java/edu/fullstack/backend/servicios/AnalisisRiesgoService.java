package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.AnalisisRiesgo;
import java.util.List;

public interface AnalisisRiesgoService{
    List<AnalisisRiesgo> listar();
    AnalisisRiesgo listarId(int id);
    AnalisisRiesgo add(AnalisisRiesgo a);
    AnalisisRiesgo edit(AnalisisRiesgo a);
    AnalisisRiesgo delete(int id);
}
