
package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Venta;
import edu.fullstack.backend.infraestructura.VentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImp implements VentaService{
       @Autowired
    private VentaRepository repositorio;
    
    @Override
    public List<Venta> listar() {
        return repositorio.findAll();
    }

    @Override
    public Venta listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Venta add(Venta v) {
        return repositorio.save(v);
    }

    @Override
    public Venta edit(Venta v) {
        return repositorio.save(v);
    }

    @Override
    public Venta delete(int id) {
        Venta v=repositorio.findById(id);
        if (v!=null) {
            repositorio.delete(v);
        }
        return v;
    }
    
}
