
package edu.fullstack.backend.dominio;

import jakarta.persistence.*;


@Entity
@Table(name = "inmuebles")
public class Inmuebles {
    
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inmueble")
    private  int id; 
    
    @Column(name = "ID_Personas")
    private  int idTp;  
    
    @Column(name = "id_tipo_inmueble")
    private  int idti;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "barrio")
    private String barrio;
    
    @Column(name = "ciudad")
    private String ciudad;
    
    @Column(name = "descripcionSitio")
    private String descripcion_sitio;
    
    @Column(name = "descripcion_alrededores")
    private String descripcion_alrededores;
    @Column(name = "valor")
    private String valor;
    
    //Getters & Setters
    
    public int getIdInmu(){
        return id;
    }
    public void setIdInmu(int id){
        this.id = id;
    }
    
    public int getIdTp(){
        return idTp;
    }
    public void setIdTp(int idp){
        this.idTp = idp;
    }
    
    public int getIdTipoInmu(){
        return idti;
    }
    public void setIdTipoInmu(int idti){
        this.idti = idti;
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
    
    public String getDescripcionSitio(){
        return descripcion_sitio;
    }
    public void setDescripcionSitio(String descripcion_sitio){
        this.descripcion_sitio = descripcion_sitio;
    }
    
    public String getDescripcionAlrededores(){
        return descripcion_alrededores;
    }
    public void setDescripcionAlrededores(String descripcion_alrededores){
        this.descripcion_alrededores = descripcion_alrededores;
    }
    public String getValor(){
        return valor;
    }
    public void setValor(String valor){
        this.valor = valor;
    }
}
