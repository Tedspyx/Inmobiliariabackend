package edu.fullstack.backend.infraestructura;
 
import edu.fullstack.backend.dominio.Citas;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface CitasRepository extends Repository<Citas,Integer>{
    List<Citas> findAll();
    Citas findById(int id);
    Citas save(Citas c);
    void delete(Citas c);
}