package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.UbicacionGeografica;
import edu.fullstack.backend.infraestructura.UbicacionGeograficaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UbicacionGeograficaServiceImp implements UbicacionGeograficaService{
    @Autowired
    private UbicacionGeograficaRepository repositorio;
    
    @Override
    public List<UbicacionGeografica> listar() {
        return repositorio.findAll();
    }

    @Override
    public UbicacionGeografica listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public UbicacionGeografica add(UbicacionGeografica u) {
        return repositorio.save(u);
    }

    @Override
    public UbicacionGeografica edit(UbicacionGeografica u) {
        return repositorio.save(u);
    }

    @Override
    public UbicacionGeografica delete(int id) {
        UbicacionGeografica u=repositorio.findById(id);
        if (u!=null) {
            repositorio.delete(u);
        }
        return u;
    }
    
}


