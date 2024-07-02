package edu.fullstack.backend.servicios;

import edu.fullstack.backend.dominio.Inmobiliaria;
import java.util.List;

public interface InmobiliariaService {
     List<Inmobiliaria> listar();
    Inmobiliaria listarId(int id);
    Inmobiliaria add(Inmobiliaria i);
    Inmobiliaria edit(Inmobiliaria i);
    Inmobiliaria delete(int id);
}
