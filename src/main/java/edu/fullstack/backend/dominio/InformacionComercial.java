package edu.fullstack.backend.dominio;
import jakarta.persistence.*;

@Entity
@Table(name = "informacioncomercial")

public class InformacionComercial {
    @Id
    @Column(name = "id_informacion_comercial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "Detalles")
    private String detalles;
    
    @Column(name = "ID_Personas")
    private Integer idP;
    
    
    //getter y setter    
    
    public int getIdInfo() {
        return id;
    }

    public void setIdInfo(int id) {
        this.id = id;
    }
    
    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
        public Integer getIdPersona() {
        return idP;
    }

    public void setIdPersona(Integer idP) {
        this.idP = idP;
    }
}
