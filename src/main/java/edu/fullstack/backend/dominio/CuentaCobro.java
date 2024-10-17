package edu.fullstack.backend.dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "cuenta_cobro")

public class CuentaCobro {
     @Id
    @Column(name = "ID_Cuenta_co")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name ="ID_PA")
    private int idP;
    
    @Column(name ="fecha_pago")
    private String fecha;
    
    @Column(name ="monto_pago")
    private String monto;
    
    @Column(name ="codigo_transaccion")
    private String codigo;
    
    //getters y setter
    
    public int getIdCuentaCobro() {
        return id;
    }

    public void setIdCuentaCobro(int id) {
        this.id = id;
    }
    
    public int getIdPa() {
        return idP;
    }

    public void setIdPa(int idP) {
        this.idP = idP;
    }
    
    public String getFechaPago() {
        return fecha;
    }

    public void setFechaPago(String fecha) {
        this.fecha = fecha;
    }
    
        public String getMontoPago() {
        return monto;
    }

    public void setMontoPago(String monto) {
        this.monto = monto;
    }
    
     public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
