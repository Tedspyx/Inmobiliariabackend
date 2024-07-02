package edu.fullstack.backend.dominio;
import jakarta.persistence.*;

@Entity
@Table(name = "tipo_inmueble")
public class TipoInmueble {
    @Id
    @Column(name = "id_tipo_inmueble")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;    
        
    @Column(name = "tipo_inmueble")
    private String tipoinmueble;
    
    
    //getters y setter 
    
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        public String getTipoInmueble() {
        return tipoinmueble;
    }

    public void setTipoInmueble(String tipoinmueble) {
        this.tipoinmueble = tipoinmueble;
    }

}
