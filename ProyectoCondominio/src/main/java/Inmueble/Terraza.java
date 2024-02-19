package Inmueble;

import Administracion.Perfil;
import areaComun.Reserva;
import java.util.List;

public class Terraza extends InmuebleComun {

    public Terraza(List<Reserva> listaReservas, String diasDisponibles, String nombre, double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        super(listaReservas, diasDisponibles, nombre, metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
    }


}
