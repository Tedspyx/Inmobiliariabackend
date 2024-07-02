package edu.fullstack.backend.dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "inmobiliaria")
public class Inmobiliaria {
    @Id
    @Column(name = "id_inmobiliaria")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "Nombres")
    private String nombres;
    
    @Column(name = "Telefono")
    private String telefono;
    
    @Column(name = "correo_electronico")
    private String correo;
    
    @Column(name = "Direccion")
    private String direccion;
    
    @Column(name = "ID_Ubicacion")
    private int idUbi;
    
    //Getter y setter
    
    public int getIdInmobiliaria() {
        return id;
    }
    public void setIdInmobiliaria(int id) {
        this.id = id;
    }
    
        public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
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
    
    public int getIdUbicacion() {
        return idUbi;
    }
    public void setIdUbicacion(int idUbi) {
        this.idUbi = idUbi;
    }
    
    
    
    
}
