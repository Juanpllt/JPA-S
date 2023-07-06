package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Cliente;
import com.mycompany.peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {
    ClienteJpaController clienteJpa = new ClienteJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Cliente cliente, Mascota mascota) {
        clienteJpa.create(cliente);
    
        mascotaJpa.create(mascota);
    }
    
    
}
