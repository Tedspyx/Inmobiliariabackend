package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Sucursales;
import edu.fullstack.backend.infraestructura.SucursalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SucursalesServiceImp implements SucursalesService{
    @Autowired   
    
    private SucursalesRepository repositorio;
    
    @Override
    public List<Sucursales> listar() {
        return repositorio.findAll();
    }

    @Override
    public Sucursales listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public Sucursales add(Sucursales s) {
        return repositorio.save(s);
    }

    @Override
    public Sucursales edit(Sucursales s) {
        return repositorio.save(s);
    }

    @Override
    public Sucursales delete(int id) {
        Sucursales s=repositorio.findById(id);
        if (s!=null) {
            repositorio.delete(s);
        }
        return s;
    }
    
}