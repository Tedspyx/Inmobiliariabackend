package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.Avaluo;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface AvaluoRepository extends Repository<Avaluo,Integer> {
    List<Avaluo> findAll();
    Avaluo findById(int id);
    Avaluo save(Avaluo a);
    void delete(Avaluo a);
}
