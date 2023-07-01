package com.mycompany.peluqueriacanina.logica;

public class Mascota {
    private int numCliente;
    private String nombre;
    private String raza;
    private String atencionEspecial;
    private String color;
    private String alergico;
    private String observaciones;

    public Mascota() {
    }

    public Mascota(int numCliente, String nombre, String raza, String atencionEspecial, String color, String alergico, String observaciones) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.atencionEspecial = atencionEspecial;
        this.color = color;
        this.alergico = alergico;
        this.observaciones = observaciones;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
