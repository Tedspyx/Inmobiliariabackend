package edu.fullstack.backend.dominio;
import jakarta.persistence.*;

@Entity
@Table(name = "tipopersonas")
public class TipoPersona {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_TP;
    
    @Column(name = "Nombre")
    private String nombre;
    
    public int getId() {
        return ID_TP;
    }

    public void setId(int ID_TP) {
        this.ID_TP = ID_TP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}