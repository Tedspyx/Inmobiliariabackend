package edu.fullstack.backend.dominio;
import jakarta.persistence.*;

 @Entity
 @Table(name = "ubicaciongeografica")
public class UbicacionGeografica {
    @Id
    @Column(name = "ID_Ubicacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "Direccion")
    private String direccion;
    
    @Column(name = "Barrio")
    private String barrio;
    
    @Column(name = "Ciudad")
    private String ciudad;
    
    @Column(name = "Divpol")
    private String divpol;
    
    
    //getter y setter
    
    public int getIdUbicacion(){
        return id;
    }
    
    public void setIdUbicacion(int id){
        this.id = id;
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
        public String getBarrio(){
        return barrio;
    }
    public void setBarrio(String barrio){
        this.barrio = barrio;
    }
    
        public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    
    public String getDivpol(){
        return divpol;
    }
    public void setDivpol(String divpol){
        this.divpol = divpol;
    }
}
