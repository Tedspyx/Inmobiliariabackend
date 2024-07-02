package edu.fullstack.backend.dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "visita")
public class Visita {
    @Id
    @Column(name = "ID_Visita")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "id_inmueble")
    private int idi;
    
    @Column(name = "ID_Personas")
    private int idp;
    
    @Column(name = "Fecha")
    private String fecha;
    
    //getter y setter
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        public int getIdInmueble() {
        return idi;
    }

    public void setIdInmueble(int idi) {
        this.idi = idi;
    }

    public int getIdPersonas() {
        return idp;
    }

    public void setIdPersonas(int idp) {
        this.idp = idp;
    }
    
     public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
