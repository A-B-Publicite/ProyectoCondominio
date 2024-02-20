package Inmueble;

import Administracion.Perfil;
import areaComun.Reserva;
import java.util.List;

public class Cancha extends InmuebleComun {

    public Cancha(List<Reserva> listaReservas, List<String> diasDisponibles, String nombreInmueble, double metrosCuadrados, Perfil propietario) {
        super(listaReservas, diasDisponibles, nombreInmueble, metrosCuadrados, propietario);
    }
}
