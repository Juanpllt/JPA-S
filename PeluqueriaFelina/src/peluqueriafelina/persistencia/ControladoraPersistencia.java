package peluqueriafelina.persistencia;

import peluqueriafelina.logica.Cliente;
import peluqueriafelina.logica.Mascota;

public class ControladoraPersistencia {
    ClienteJpaController clienteJpa = new ClienteJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Mascota mascota, Cliente cliente) {
        clienteJpa.create(cliente);
        mascotaJpa.create(mascota);
    }
}
