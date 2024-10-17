package edu.fullstack.backend.dominio;
import jakarta.persistence.*;

@Entity
@Table(name = "alquileres")

public class Alquileres {
     @Id
    @Column(name = "ID_Alquiler")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    
    @Column(name = "id_inmueble")
    private int idInmu;
    
    @Column(name = "fecha_inicio")
    private String fechainicio;
    
    @Column(name = "fecha_fin")
    private String fechafin;
    
    @Column(name = "monto_mensual")
    private String monto;    
    
//getters y setters
    public int getIdAlquiler() {
        return id;
    }

    public void setIdAlquiler(int id) {
        this.id = id;
    }
        public int getIdInmu() {
        return idInmu;
    }

    public void setIdInmu(int idInmu) {
        this.idInmu = idInmu;
    }

    public String getFechaInicio() {
        return fechainicio;
    }

    public void setFechaInicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechaFin() {
        return fechafin;
    }

    public void setFechaFin(String fechafin) {
        this.fechafin = fechafin;
    }
    public String getMonto() {
        return monto;
    } 
    
    public void setMonto(String monto) {
        this.monto = monto;
    }
    
}