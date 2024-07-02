package edu.fullstack.backend.dominio;
import jakarta.persistence.*;

@Entity
@Table(name = "citas")
public class Citas {
    @Id
    @Column(name = "ID_Citas")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "id_inmueble")
    private int idInmuebles;
    
    @Column(name = "Fecha")
    private String fecha;
    
    @Column(name = "Estado")
    private String estado;
    
    //Getter y setter
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public int  getIdInmuebles(){
        return idInmuebles;
    }
    public void setIdInmuebles(int idInmuebles){
        this.idInmuebles = idInmuebles;
    }
    
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public String getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    
    
}
