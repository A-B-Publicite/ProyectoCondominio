package Inmueble;

import Administracion.Administrador;
import Administracion.Perfil;
import areaComun.Reserva;
import java.util.List;

public class Gimnasio extends InmuebleComun {

    public Gimnasio(List<Reserva> listaReservas, List<String> diasDisponibles, String nombreInmueble, double metrosCuadrados, Perfil propietario) {
        super(listaReservas, diasDisponibles, nombreInmueble, metrosCuadrados, propietario);
    }

    public Gimnasio( double metrosCuadrados,Administrador administrador) {
        super(null, null, "Gimnasio", metrosCuadrados,administrador);       
    }

}
