package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.Visita;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface VisitaRepository extends Repository<Visita,Integer> {
    List<Visita> findAll();
    Visita findById(int id);
    Visita save(Visita v);
    void delete(Visita v);
}
