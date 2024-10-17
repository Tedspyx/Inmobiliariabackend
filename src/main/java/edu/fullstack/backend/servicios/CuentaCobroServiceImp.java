package edu.fullstack.backend.servicios;
import edu.fullstack.backend.dominio.CuentaCobro;
import edu.fullstack.backend.infraestructura.CuentaCobroRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuentaCobroServiceImp implements CuentaCobroService{
    @Autowired
    private CuentaCobroRepository repositorio;
    
    @Override
    public List<CuentaCobro> listar() {
        return repositorio.findAll();
    }

    @Override
    public CuentaCobro listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public CuentaCobro add(CuentaCobro c) {
        return repositorio.save(c);
    }

    @Override
    public CuentaCobro edit(CuentaCobro c) {
        return repositorio.save(c);
    }

    @Override
    public CuentaCobro delete(int id) {
        CuentaCobro c=repositorio.findById(id);
        if (c!=null) {
            repositorio.delete(c);
        }
        return c;
    }
}