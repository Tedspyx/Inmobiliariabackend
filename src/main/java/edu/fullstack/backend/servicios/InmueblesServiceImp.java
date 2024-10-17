
package edu.fullstack.backend.servicios;

import edu.fullstack.backend.dominio.Inmuebles;
import edu.fullstack.backend.infraestructura.InmueblesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InmueblesServiceImp implements InmueblesService{
    
    @Autowired
    private InmueblesRepository repositorio;
    
    @Override
    public List<Inmuebles> listar(){
        return repositorio.findAll();
    }
    
    @Override
    public Inmuebles listarId(int id){
        return repositorio.findById(id);
    }
    
    @Override
    public Inmuebles add(Inmuebles i){
        return repositorio.save(i);
    }
    
    @Override
    public Inmuebles edit(Inmuebles i){
        return repositorio.save(i);
    }
    
    @Override
    public Inmuebles delete(int id){
        Inmuebles i = repositorio.findById(id);
        if(i != null){
            repositorio.delete(i);
        }
        return i;
    }
    @Override    
    public Inmuebles findByIdTp(int idTp){
         return repositorio.findByIdTp(idTp);
    }    
   
}
