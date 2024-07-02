package edu.fullstack.backend.dominio;
import jakarta.persistence.*;
@Entity
@Table(name = "ventas")
public class Venta {
    @Id
    @Column(name = "id_venta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
    
    @Column(name = "id_inmueble")
    private int idi;
    
    @Column(name = "fecha_venta")
    private String fechaventa;
    
    @Column(name = "monto_venta")
    private String montoventa;
    
        //Getter y setter
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdInmueble() {
        return idi;
    }
    public void setIdInmueble(int idi) {
        this.idi = idi;
    }
    
    public String getFechaVenta() {
        return fechaventa;
    }
    public void setFechaVenta(String fechaventa) {
        this.fechaventa = fechaventa;
    }
    
        public String getMontoVenta() {
        return montoventa;
    }

    public void setMontoVenta(String montoventa) {
        this.montoventa = montoventa;
    }
    
}
