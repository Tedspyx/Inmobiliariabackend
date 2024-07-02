package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.Inmobiliaria;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface InmobiliariaRepository extends Repository<Inmobiliaria,Integer>{
    List<Inmobiliaria> findAll();
    Inmobiliaria findById(int id);
    Inmobiliaria save(Inmobiliaria i);
    void delete(Inmobiliaria i);
}
