
package edu.fullstack.backend.servicios;

import edu.fullstack.backend.dominio.Comision;
import edu.fullstack.backend.infraestructura.ComisionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComisionServiceImp implements ComisionService{
      @Autowired
    private ComisionRepository repositorio;
    
    @Override
    public List<Comision> listar() {
        return repositorio.findAll();
    }

    @Override
    public Comision listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Comision add(Comision c) {
        return repositorio.save(c);
    }

    @Override
    public Comision edit(Comision c) {
        return repositorio.save(c);
    }

    @Override
    public Comision delete(int id) {
        Comision c=repositorio.findById(id);
        if (c!=null) {
            repositorio.delete(c);
        }
        return c;
    }
    
}
