
package edu.fullstack.backend.dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "comisiones")

public class Comision {
    @Id
    @Column(name = "id_comision")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
    
    @Column(name = "id_pv")
    private int idpv;
    
    @Column(name = "fecha")
    private String fecha;
    
    @Column(name = "monto")
    private String monto;
        //Getter y setter
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdPv() {
        return idpv;
    }
    public void setIdPv(int idpv) {
        this.idpv = idpv;
    }
    
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
        public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
}
