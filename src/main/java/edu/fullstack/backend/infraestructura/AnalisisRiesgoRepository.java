package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.AnalisisRiesgo;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface AnalisisRiesgoRepository extends Repository<AnalisisRiesgo,Integer>{
    List<AnalisisRiesgo> findAll();
    AnalisisRiesgo findById(int id);
    AnalisisRiesgo save(AnalisisRiesgo a);
    void delete(AnalisisRiesgo a);
}
