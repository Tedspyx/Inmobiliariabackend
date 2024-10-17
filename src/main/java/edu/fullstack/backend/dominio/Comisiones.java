package edu.fullstack.backend.dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "comisiones")
public class Comisiones {
    @Id
    @Column(name  ="id_comision")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "id_pv")
    private int idPv;
    
    @Column(name = "fecha")
    private String fecha;
    
    @Column(name = "monto")
    private String monto;
    
    @Column(name = "ID_Personas")
    private int idP;
    
    
    //getters y setters
    
     public int getIdComision() {
        return id;
    }

    public void setIdComision(int id) {
        this.id = id;
    }
    
    public int getIdPv() {
        return idPv;
    }

    public void setIdPv(int idPv) {
        this.idPv = idPv;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
        public String getMonto(){
        return monto;
    }
    
    public void setMonto(String monto){
        this.monto = monto;
    }
    
     public int getIdPersona() {
        return idP;
    }

    public void setIdPersona(int idP) {
        this.idP = idP;
    }
}
