package edu.fullstack.backend.dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "personas_compras")
public class PersonasCompras {
    @Id
    @Column(name = "ID_PC")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name ="ID_Compras")
    private int idC;
    
    @Column(name ="ID_Personas")
    private int idP;
    
    //getters y setter
    
    public int getIdPc() {
        return id;
    }

    public void setIdPc(int id) {
        this.id = id;
    }
    
    public int getIdCompras() {
        return idC;
    }

    public void setIdCompras(int idC) {
        this.idC = idC;
    }
    
    public int getIdPersonas() {
        return idP;
    }

    public void setIdPersonas(int idP) {
        this.idP = idP;
    }
}
