
package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Inmobiliaria;
import edu.fullstack.backend.infraestructura.InmobiliariaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InmobiliariaServiceImp implements InmobiliariaService{
      @Autowired
    private InmobiliariaRepository repositorio;
    
    @Override
    public List<Inmobiliaria> listar() {
        return repositorio.findAll();
    }

    @Override
    public Inmobiliaria listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Inmobiliaria add(Inmobiliaria i) {
        return repositorio.save(i);
    }

    @Override
    public Inmobiliaria edit(Inmobiliaria i) {
        return repositorio.save(i);
    }

    @Override
    public Inmobiliaria delete(int id) {
        Inmobiliaria i=repositorio.findById(id);
        if (i!=null) {
            repositorio.delete(i);
        }
        return i;
    }
    
}
