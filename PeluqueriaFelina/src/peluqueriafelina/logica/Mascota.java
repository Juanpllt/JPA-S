package peluqueriafelina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int numCliente;
    
    private String nombre;
    private String raza;
    private String atencionEspecial;
    private String alergico;
    private String observaciones;
    
    @OneToOne
    private Cliente cliente;
    
    public Mascota(){}
    public Mascota(int numCliente, String nombre, String raza, String atencionEspecial, String alergico, String observaciones){
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.atencionEspecial = atencionEspecial;
        this.alergico = alergico;
        this.observaciones = observaciones;
    }
    
    public int getNumCliente(){
        return numCliente;
    }
    public void setNumCliente(int numCliente){
        this.numCliente = numCliente;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza= raza;
    }
    
    public String getAtencionEspecial(){
        return atencionEspecial;
    }
    public void setAtencionEspecial(String atencionEspecial){
        this.atencionEspecial= atencionEspecial;
    }
    
    public String getAlergico(){
        return alergico;
    }
    public void setAlergico(String alergico){
        this.alergico= alergico;
    }
    
    public String getObservaciones(){
        return alergico;
    }
    public void setObservaciones(String observaciones){
        this.observaciones= observaciones;
    }
    
}
