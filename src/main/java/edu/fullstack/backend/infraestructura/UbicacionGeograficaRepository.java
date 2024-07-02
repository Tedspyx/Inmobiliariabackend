package edu.fullstack.backend.infraestructura;

import edu.fullstack.backend.dominio.UbicacionGeografica;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface UbicacionGeograficaRepository extends Repository <UbicacionGeografica,Integer>{
    List<UbicacionGeografica> findAll();
    UbicacionGeografica findById(int id);
    UbicacionGeografica save(UbicacionGeografica u);
    void delete(UbicacionGeografica u);
}
