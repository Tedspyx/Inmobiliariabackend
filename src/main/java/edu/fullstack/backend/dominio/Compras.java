package edu.fullstack.backend.dominio;
import jakarta.persistence.*;

@Entity
@Table(name = "compras")

public class Compras {
    @Id
    @Column(name = "ID_Compras")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "id_inmueble")
    private int idInmu;
        
    @Column(name = "fecha_compra")
    private String fechas;
    
    @Column(name = "monto_compra")
    private String monto;
    
    //getter y setter
    
    public int getIdCompras() {
        return id;
    }

    public void setIdCompras(int id) {
        this.id = id;
    }
        public int getIdInmueble() {
        return idInmu;
    }

    public void setIdInmueble(int idInmu) {
        this.idInmu = idInmu;
    }
    
    public String getFechaCompra() {
        return fechas;
    }

    public void setFechaCompra(String fechas) {
        this.fechas = fechas;
    }
    
        public String getMontoCompra() {
        return monto;
    }

    public void setMontoCompra(String monto) {
        this.monto = monto;
    }
}
