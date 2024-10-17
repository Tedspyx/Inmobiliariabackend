package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.Alquileres;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface AlquileresRepository extends Repository<Alquileres,Integer>{
    List<Alquileres> findAll();
    Alquileres findById(int id);
    Alquileres save(Alquileres a);
    void delete(Alquileres a);
}
