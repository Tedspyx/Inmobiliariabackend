package edu.fullstack.backend.dominio;
import  jakarta.persistence.*;

@Entity
@Table(name = "sucursales")
public class Sucursales {
    @Id
    @Column(name = "ID_Sucursales")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "ID_Personas")
    private int idPersona;
    
    @Column(name = "id_inmobiliaria")
    private int idInmobiliaria;
    
    @Column(name = "Ciudad")
    private String ciudad;
    
    @Column(name = "Telefono")
    private String telefono;
    
    @Column(name ="correo_electronico")
    private String correo;
    
    @Column(name = "Direccion")
    private String direccion;
    
    //getters y setters
    
    public int getIdSucursales(){
        return id;
    }
    public void setIdSucursales(int id){
        this.id = id;
    }
    
        public int getIdPersonas(){
        return idPersona;
    }
    public void setIdPersonas(int idPersona){
        this.idPersona = idPersona;
    }
    
        public int getIdInmobiliaria(){
        return idInmobiliaria;
    }
    public void setIdInmobiliaria(int idInmobiliaria){
        this.idInmobiliaria = idInmobiliaria;
    }
    
        public String getCiudad() {
        return ciudad;
    } 
    
    public void setNombre(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    
        public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
