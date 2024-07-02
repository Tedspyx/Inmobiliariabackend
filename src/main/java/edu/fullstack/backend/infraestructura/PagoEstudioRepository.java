package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.PagoEstudio;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface PagoEstudioRepository extends Repository<PagoEstudio,Integer>{
    List<PagoEstudio> findAll();
    PagoEstudio findById(int id);
    PagoEstudio save(PagoEstudio p);
    void delete(PagoEstudio p);
}
