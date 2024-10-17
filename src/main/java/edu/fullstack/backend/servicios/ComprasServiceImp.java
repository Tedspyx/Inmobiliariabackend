package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Compras;
import edu.fullstack.backend.infraestructura.ComprasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComprasServiceImp implements ComprasService{
    @Autowired
    private ComprasRepository repositorio;
    
    @Override
    public List<Compras> listar() {
        return repositorio.findAll();
    }

    @Override
    public Compras listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Compras add(Compras c) {
        return repositorio.save(c);
    }

    @Override
    public Compras edit(Compras c) {
        return repositorio.save(c);
    }

    @Override
    public Compras delete(int id) {
        Compras c=repositorio.findById(id);
        if (c!=null) {
            repositorio.delete(c);
        }
        return c;
    }
}
