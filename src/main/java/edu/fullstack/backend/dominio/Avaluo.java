package edu.fullstack.backend.dominio;
import jakarta.persistence.*;

@Entity
@Table(name = "avaluo")

public class Avaluo {
    @Id
    @Column(name = "id_avaluo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "id_inmueble")
    private int id_inmueble;
    
    @Column(name = "monto_avaluo")
    private String monto;

    
    //getter y setter
    
    public int getIdAvaluo() {
        return id;
    }

    public void setIdAvaluo(int id) {
        this.id = id;
    }
    
        public int getIdInmueble() {
        return id_inmueble;
    }
    public void setIdInmueble(int id_inmueble) {
        this.id_inmueble = id_inmueble;        
    }
    
        public String getMontoAvaluo() {
        return monto;
    }

    public void setMontoAvaluo(String monto) {
        this.monto = monto;
    }


}
