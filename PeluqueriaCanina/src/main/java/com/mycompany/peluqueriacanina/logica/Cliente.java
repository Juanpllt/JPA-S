package com.mycompany.peluqueriacanina.logica;

public class Cliente {
    
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
