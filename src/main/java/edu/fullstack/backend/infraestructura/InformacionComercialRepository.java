package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.InformacionComercial;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface InformacionComercialRepository extends Repository<InformacionComercial, Integer>{
    List<InformacionComercial> findAll();
    InformacionComercial findById(int id);
    InformacionComercial save(InformacionComercial i);
    void delete(InformacionComercial i);
}
