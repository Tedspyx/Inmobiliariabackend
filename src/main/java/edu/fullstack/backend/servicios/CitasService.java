package edu.fullstack.backend.servicios;
 
import edu.fullstack.backend.dominio.Citas;
import java.util.List;
 
 
public interface CitasService {
     List<Citas> listar();
    Citas listarId(int id);
    Citas add(Citas c);
    Citas edit(Citas c);
    Citas delete(int id);
}