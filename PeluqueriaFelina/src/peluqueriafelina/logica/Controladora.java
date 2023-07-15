package peluqueriafelina.logica;

import peluqueriafelina.persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String raza, String observaciones, String alergico, String atEspe, String nombre, String celular) {
        
        Cliente cliente = new Cliente();
        
        cliente.setNombre(nombre);
        cliente.setCelular(celular);
        
        Mascota mascota = new Mascota();
        
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setObservaciones(observaciones);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atEspe);
        mascota.setCliente(cliente);
        
        controlPersis.guardar(mascota, cliente);
        
    }
    
}
