package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.Comisiones;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface ComisionesRepository extends Repository <Comisiones,Integer>{
    List<Comisiones>findAll();
    Comisiones findById(int id);
    Comisiones save(Comisiones c);
    void delete(Comisiones c);
}
