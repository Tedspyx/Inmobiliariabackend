package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.CuentaCobro;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface CuentaCobroRepository extends Repository<CuentaCobro,Integer> {
    List<CuentaCobro> findAll();
    CuentaCobro findById(int id);
    CuentaCobro save(CuentaCobro c);
    void delete(CuentaCobro c);
}
