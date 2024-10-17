
package edu.fullstack.backend.dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "personas_alquileres")
public class PersonasAlquileres {
    @Id
    @Column(name = "ID_PA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name ="ID_Alquiler")
    private int idA;
    
    @Column(name ="ID_Personas")
    private int idP;
    
    //getters y setter
    
    public int getIdPa() {
        return id;
    }

    public void setIdPa(int id) {
        this.id = id;
    }
    
    public int getIdAlquiler() {
        return idA;
    }

    public void setIdAlquiler(int idA) {
        this.idA = idA;
    }
    
    public int getIdPersonas() {
        return idP;
    }

    public void setIdPersonas(int idP) {
        this.idP = idP;
    }
}
