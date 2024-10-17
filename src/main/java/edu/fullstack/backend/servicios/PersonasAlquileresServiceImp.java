
package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.PersonasAlquileres;
import edu.fullstack.backend.infraestructura.PersonasAlquileresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonasAlquileresServiceImp implements PersonasAlquileresService{
    @Autowired
    private PersonasAlquileresRepository repositorio;
    
    @Override
    public List<PersonasAlquileres> listar() {
        return repositorio.findAll();
    }

    @Override
    public PersonasAlquileres listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public PersonasAlquileres add(PersonasAlquileres p) {
        return repositorio.save(p);
    }

    @Override
    public PersonasAlquileres edit(PersonasAlquileres p) {
        return repositorio.save(p);
    }

    @Override
    public PersonasAlquileres delete(int id) {
        PersonasAlquileres p=repositorio.findById(id);
        if (p!=null) {
            repositorio.delete(p);
        }
        return p;
    }
}
