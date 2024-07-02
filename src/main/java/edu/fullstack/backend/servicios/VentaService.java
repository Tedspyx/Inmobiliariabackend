package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Venta;
import java.util.List;


public interface VentaService {
    List<Venta> listar();
    Venta listarId(int id);
    Venta add(Venta v);
    Venta edit(Venta v);
    Venta delete(int id);
}
