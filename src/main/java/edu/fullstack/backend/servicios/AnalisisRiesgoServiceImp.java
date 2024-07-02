package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.AnalisisRiesgo;
import edu.fullstack.backend.infraestructura.AnalisisRiesgoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnalisisRiesgoServiceImp implements AnalisisRiesgoService{
    @Autowired
    private AnalisisRiesgoRepository repositorio;
    
    @Override
    public List<AnalisisRiesgo> listar() {
        return repositorio.findAll();
    }

    @Override
    public AnalisisRiesgo listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public AnalisisRiesgo add(AnalisisRiesgo a) {
        return repositorio.save(a);
    }

    @Override
    public AnalisisRiesgo edit(AnalisisRiesgo a) {
        return repositorio.save(a);
    }

    @Override
    public AnalisisRiesgo delete(int id) {
        AnalisisRiesgo a=repositorio.findById(id);
        if (a!=null) {
            repositorio.delete(a);
        }
        return a;
    }
    
}
