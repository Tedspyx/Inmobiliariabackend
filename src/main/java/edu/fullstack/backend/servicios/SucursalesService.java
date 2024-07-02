package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Sucursales;
import java.util.List;

public interface SucursalesService {
    List<Sucursales> listar();
    Sucursales listarId(int id);
    Sucursales add(Sucursales s);
    Sucursales edit(Sucursales s);
    Sucursales delete(int id);
}
