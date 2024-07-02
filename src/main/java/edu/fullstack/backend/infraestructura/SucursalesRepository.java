package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.Sucursales;
import org.springframework.data.repository.Repository;
import java.util.List;

public interface SucursalesRepository extends Repository<Sucursales,Integer>{
    List<Sucursales> findAll();
    Sucursales findById(int id);
    Sucursales save(Sucursales s);
    void delete(Sucursales s);
}
