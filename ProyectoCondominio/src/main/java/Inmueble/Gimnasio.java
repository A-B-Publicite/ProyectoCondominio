package Inmueble;

import Administracion.Perfil;
import areaComun.Reserva;
import java.util.List;

public class Gimnasio extends InmuebleComun {

    public Gimnasio(List<Reserva> listaReservas, List<String> diasDisponibles, String nombre, double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        super(listaReservas, diasDisponibles, nombre, metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
    }



}
