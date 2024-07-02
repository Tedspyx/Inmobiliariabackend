
package edu.fullstack.backend.dominio;
import jakarta.persistence.*;


@Entity
@Table(name = "personas")

public class Persona {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Personas;
    
    
    @Column
    private int ID_TP;
    
    @Column(name = "Nombres")
    private String nombres;
    
    @Column(name = "Apellidos")
    private String apellidos;
    
    @Column(name = "Telefono")
    private String telefono;
    
    @Column(name = "correo_electronico")
    private String correo;
    
    @Column(name = "Direccion")
    private String direccion;
    
    @Column(name = "ID_Sucursales", nullable = true)
    private Integer idsucursales;

 
    
//getters y setters
    public int getId() {
        return ID_Personas;
    }

    public void setId(int id) {
        this.ID_Personas = id;
    }
        public int getIdTp() {
        return ID_TP;
    }

    public void setIdTp(int ID_TP) {
        this.ID_TP = ID_TP;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
        public Integer getIdSucursales() {
        return idsucursales;
    }

     public void setIdSucursales(Integer idsucursales) {
         this.idsucursales = idsucursales;
}
}