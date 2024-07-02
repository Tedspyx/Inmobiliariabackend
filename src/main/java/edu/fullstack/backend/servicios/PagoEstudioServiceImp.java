package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.PagoEstudio;
import edu.fullstack.backend.infraestructura.PagoEstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagoEstudioServiceImp implements PagoEstudioService {
  
    @Autowired
    private PagoEstudioRepository repositorio;
    
    @Override
    public List<PagoEstudio> listar() {
        return repositorio.findAll();
    }

    @Override
    public PagoEstudio listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public PagoEstudio add(PagoEstudio p) {
        return repositorio.save(p);
    }

    @Override
    public PagoEstudio edit(PagoEstudio p) {
        return repositorio.save(p);
    }

    @Override
    public PagoEstudio delete(int id) {
        PagoEstudio p=repositorio.findById(id);
        if (p!=null) {
            repositorio.delete(p);
        }
        return p;
    }
    
}
