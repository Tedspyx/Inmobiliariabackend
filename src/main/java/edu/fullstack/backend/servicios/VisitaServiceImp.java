package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Visita;
import edu.fullstack.backend.infraestructura.VisitaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitaServiceImp implements VisitaService {
     @Autowired
    private VisitaRepository repositorio;
    
    @Override
    public List<Visita> listar() {
        return repositorio.findAll();
    }

    @Override
    public Visita listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Visita add(Visita v) {
        return repositorio.save(v);
    }

    @Override
    public Visita edit(Visita v) {
        return repositorio.save(v);
    }

    @Override
    public Visita delete(int id) {
        Visita v=repositorio.findById(id);
        if (v!=null) {
            repositorio.delete(v);
        }
        return v;
    }
    
}
