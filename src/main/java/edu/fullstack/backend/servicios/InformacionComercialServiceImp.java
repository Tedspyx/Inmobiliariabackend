package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.InformacionComercial;
import edu.fullstack.backend.infraestructura.InformacionComercialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformacionComercialServiceImp implements InformacionComercialService{
    @Autowired
    private InformacionComercialRepository repositorio;
    
    @Override
    public List<InformacionComercial> listar() {
        return repositorio.findAll();
    }

    @Override
    public InformacionComercial listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public InformacionComercial add(InformacionComercial i) {
        return repositorio.save(i);
    }

    @Override
    public InformacionComercial edit(InformacionComercial i) {
        return repositorio.save(i);
    }

    @Override
    public InformacionComercial delete(int id) {
        InformacionComercial i=repositorio.findById(id);
        if (i!=null) {
            repositorio.delete(i);
        }
        return i;
    }
}
