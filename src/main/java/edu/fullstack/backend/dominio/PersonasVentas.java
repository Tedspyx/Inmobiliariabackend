
package edu.fullstack.backend.dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "personas_ventas")
public class PersonasVentas {
    @Id
    @Column(name = "id_pv")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "id_venta")
    private int idv;
    
    @Column(name = "ID_Personas")
    private int idp;
    
    //getter y setter
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        public int getIdVenta() {
        return idv;
    }

    public void setIdVenta(int idv) {
        this.idv = idv;
    }

    public int getIdPersonas() {
        return idp;
    }

    public void setIdPersonas(int idp) {
        this.idp = idp;
    }
}
