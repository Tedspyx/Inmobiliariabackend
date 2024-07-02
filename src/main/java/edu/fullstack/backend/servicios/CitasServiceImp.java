package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.Citas;
import edu.fullstack.backend.infraestructura.CitasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 
@Service
public class CitasServiceImp implements CitasService {
    
    @Autowired
    private CitasRepository repositorio;
    
    @Override
    public List<Citas> listar(){
        return repositorio.findAll();
    }
    @Override
    public Citas listarId(int id){
        return repositorio.findById(id);
    }
    @Override
    public Citas add(Citas c){
        return repositorio.save(c);
    }
    @Override
    public Citas edit(Citas c){
        return repositorio.save(c);
    }
    @Override
    public Citas delete(int id){
        Citas c = repositorio.findById(id);
        if(c != null){
            repositorio.delete(c);
        }
        return c;
    }

}