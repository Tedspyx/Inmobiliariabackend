package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Compras;
import java.util.List;

public interface ComprasService {
    List<Compras> listar();
    Compras listarId(int id);
    Compras add(Compras c);
    Compras edit(Compras c);
    Compras delete(int id);
}
