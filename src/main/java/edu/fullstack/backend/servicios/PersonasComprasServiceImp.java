package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.PersonasCompras;
import edu.fullstack.backend.infraestructura.PersonasComprasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonasComprasServiceImp implements PersonasComprasService{
    @Autowired
    private PersonasComprasRepository repositorio;
    
    @Override
    public List<PersonasCompras> listar() {
        return repositorio.findAll();
    }

    @Override
    public PersonasCompras listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public PersonasCompras add(PersonasCompras p) {
        return repositorio.save(p);
    }

    @Override
    public PersonasCompras edit(PersonasCompras p) {
        return repositorio.save(p);
    }

    @Override
    public PersonasCompras delete(int id) {
        PersonasCompras p=repositorio.findById(id);
        if (p!=null) {
            repositorio.delete(p);
        }
        return p;
    }
}
