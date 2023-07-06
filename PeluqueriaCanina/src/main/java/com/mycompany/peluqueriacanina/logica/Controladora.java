package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPers = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String raza, String color, String observaciones, String alergico, 
                        String atenEspe, String nombreCliente, String celular) {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombreCliente);
        cliente.setCelCliente(celular);
        
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atenEspe);
        mascota.setObservaciones(observaciones);
        mascota.setUnCliente(cliente);
        
        controlPers.guardar(cliente,mascota);
        
    }
}
