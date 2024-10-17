
package edu.fullstack.backend.infraestructura;
import edu.fullstack.backend.dominio.Compras;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface ComprasRepository extends Repository <Compras,Integer> {
    List<Compras> findAll();
    Compras findById(int id);
    Compras save(Compras c);
    void delete(Compras c);
}
