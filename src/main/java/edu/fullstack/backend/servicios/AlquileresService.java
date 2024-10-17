package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Alquileres;
import java.util.List;

public interface AlquileresService {
    List<Alquileres> listar();
    Alquileres listarId(int id);
    Alquileres add(Alquileres a);
    Alquileres edit(Alquileres a);
    Alquileres delete(int id);
}
