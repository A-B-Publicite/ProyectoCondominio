package Inmueble;

import Administracion.Perfil;
import areaComun.Reserva;
import java.util.List;

public class Gimnasio extends InmuebleComun {

    //inicialmente se instancia la lista de reservas como new ArrayList
    public Gimnasio( List<Reserva> listaReservas, List<String> diasDisponibles, String nombreInmueble, double metrosCuadrados, Perfil propietario) {
        super(listaReservas,diasDisponibles, nombreInmueble, metrosCuadrados, propietario);       
    }

    //borrar si no se usa xd
    public Gimnasio(double metrosCuadrados, Perfil propietario) {
        super(null, null, "Gimnasio", metrosCuadrados,propietario);       
    }

}
