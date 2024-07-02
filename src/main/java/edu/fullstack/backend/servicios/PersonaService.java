
package edu.fullstack.backend.servicios;

import edu.fullstack.backend.dominio.Persona;
import java.util.List;


public interface PersonaService {
    List<Persona> listar();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
    Persona findByCorreo(String correo); //metodo para encontrar por correo
}
