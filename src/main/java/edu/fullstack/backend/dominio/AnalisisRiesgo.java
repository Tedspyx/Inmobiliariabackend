
package edu.fullstack.backend.dominio;
import jakarta.persistence.*;

@Entity
@Table(name = "analisisriesgo")
public class AnalisisRiesgo {
    @Id
    @Column(name = "id_analisis")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "id_pago_estudio")
    private int idpe;
    
    @Column(name = "ID_Personas")
    private int idp;
    
    @Column(name = "fecha_analisis")
    private String fecha;
    
    @Column(name = "resultado_analisis")
    private String resultado;
    
    @Column(name = "Observaciones")
    private String obs;
    
    //getter y setter
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        public int getIdPagoEstudio() {
        return idpe;
    }

    public void setIdPagoEstudio(int idpe) {
        this.idpe = idpe;
    }

    public int getIdPersonas() {
        return idp;
    }

    public void setIdPersonas(int idp) {
        this.idp = idp;
    }
    
   public String getFechaAnalisis() {
        return fecha;
    }
    public void setFechaAnalisis(String fecha) {
        this.fecha = fecha;
    }
    
    public String getResultadoAnalisis() {
        return resultado;
    }
    public void setResultadoAnalisis(String resultado) {
        this.resultado = resultado;
    }
    
     public String getObservaciones() {
        return obs;
    }
    public void setObservaciones(String obs) {
        this.obs = obs;
    }
}
