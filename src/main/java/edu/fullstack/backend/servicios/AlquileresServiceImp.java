
package edu.fullstack.backend.servicios;

import edu.fullstack.backend.dominio.Alquileres;
import edu.fullstack.backend.infraestructura.AlquileresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlquileresServiceImp implements AlquileresService{

    @Autowired
    private AlquileresRepository repositorio;
    
    @Override
    public List<Alquileres> listar() {
        return repositorio.findAll();
    }

    @Override
    public Alquileres listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Alquileres add(Alquileres a) {
        return repositorio.save(a);
    }

    @Override
    public Alquileres edit(Alquileres a) {
        return repositorio.save(a);
    }

    @Override
    public Alquileres delete(int id) {
        Alquileres a=repositorio.findById(id);
        if (a!=null) {
            repositorio.delete(a);
        }
        return a;
    }
}