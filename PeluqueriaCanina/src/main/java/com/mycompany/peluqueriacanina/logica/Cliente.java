package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idCliente;
    private String nombre;
    private String celCliente;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String celCliente) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.celCliente = celCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelCliente() {
        return celCliente;
    }
    public void setCelCliente(String celCliente) {
        this.celCliente = celCliente;
    }
    
    
}
