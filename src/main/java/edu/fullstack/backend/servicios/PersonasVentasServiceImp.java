
package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.PersonasVentas;
import edu.fullstack.backend.infraestructura.PersonasVentasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PersonasVentasServiceImp implements PersonasVentasService {
    @Autowired
    private PersonasVentasRepository repositorio;
    
    @Override
    public List<PersonasVentas> listar() {
        return repositorio.findAll();
    }

    @Override
    public PersonasVentas listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public PersonasVentas add(PersonasVentas p) {
        return repositorio.save(p);
    }

    @Override
    public PersonasVentas edit(PersonasVentas p) {
        return repositorio.save(p);
    }

    @Override
    public PersonasVentas delete(int id) {
        PersonasVentas p=repositorio.findById(id);
        if (p!=null) {
            repositorio.delete(p);
        }
        return p;
    }
    
}
