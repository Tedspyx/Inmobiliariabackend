package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Avaluo;
import edu.fullstack.backend.infraestructura.AvaluoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvaluoServiceImp implements AvaluoService{
      @Autowired
    private AvaluoRepository repositorio;
    
    @Override
    public List<Avaluo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Avaluo listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Avaluo add(Avaluo a) {
        return repositorio.save(a);
    }

    @Override
    public Avaluo edit(Avaluo a) {
        return repositorio.save(a);
    }

    @Override
    public Avaluo delete(int id) {
        Avaluo a=repositorio.findById(id);
        if (a!=null) {
            repositorio.delete(a);
        }
        return a;
    }
    
}
