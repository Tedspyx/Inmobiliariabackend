package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.CuentaCobro;
import java.util.List;

public interface CuentaCobroService {
    List<CuentaCobro> listar();
    CuentaCobro listarId(int id);
    CuentaCobro add(CuentaCobro c);
    CuentaCobro edit(CuentaCobro c);
    CuentaCobro delete(int id);
}
