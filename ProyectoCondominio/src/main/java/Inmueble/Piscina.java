package Inmueble;

import Administracion.Perfil;
import areaComun.Reserva;
import java.util.List;

public class Piscina extends InmuebleComun {

    public Piscina(List<Reserva> listaReservas, List<String> diasDisponibles, String nombreInmueble, double metrosCuadrados, Perfil propietario) {
        super(listaReservas, diasDisponibles, nombreInmueble, metrosCuadrados, propietario);
    }

}
