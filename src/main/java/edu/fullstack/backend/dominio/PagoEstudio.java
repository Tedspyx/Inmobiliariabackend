package edu.fullstack.backend.dominio;
import jakarta.persistence.*;

@Entity
@Table(name = "pagoestudio")
public class PagoEstudio {
    @Id
    @Column(name = "id_pago_estudio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "id_inmueble")
    private int idInmueble;
    
    @Column(name = "fecha_pago")
    private String fechapago;
    
    @Column(name = "monto_pago")
    private String montopago;
    
    @Column(name = "codigo_transac")
    private String codigotransac;
    
    //Getter y setter
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdInmueble() {
        return idInmueble;
    }
    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }
    
    public String getFechaPago() {
        return fechapago;
    }
    public void setFechaPago(String fechapago) {
        this.fechapago = fechapago;
    }
    
        public String getMontoPago() {
        return montopago;
    }

    public void setMontoPago(String montopago) {
        this.montopago = montopago;
    }
    
    public String getCodigoTransac() {
        return codigotransac;
    }

    public void setCodigoTransac(String codigotransac) {
        this.codigotransac = codigotransac;
    }
}
