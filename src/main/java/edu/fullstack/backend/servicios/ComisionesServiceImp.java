package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Comisiones;
import edu.fullstack.backend.infraestructura.ComisionesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComisionesServiceImp implements ComisionesService{
     @Autowired
    private ComisionesRepository repositorio;
    
    @Override
    public List<Comisiones> listar() {
        return repositorio.findAll();
    }

    @Override
    public Comisiones listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Comisiones add(Comisiones c) {
        return repositorio.save(c);
    }

    @Override
    public Comisiones edit(Comisiones c) {
        return repositorio.save(c);
    }

    @Override
    public Comisiones delete(int id) {
        Comisiones c=repositorio.findById(id);
        if (c!=null) {
            repositorio.delete(c);
        }
        return c;
    }
}
