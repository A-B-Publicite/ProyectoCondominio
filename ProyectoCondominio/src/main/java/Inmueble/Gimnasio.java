package Inmueble;

import Administracion.Administrador;
import Administracion.Perfil;
import areaComun.Reserva;
import java.util.List;

public class Gimnasio extends InmuebleComun {

    public Gimnasio(List<Reserva> listaReservas, List<String> diasDisponibles, String nombreInmueble, double metrosCuadrados, Perfil propietario) {
        super(listaReservas, diasDisponibles, nombreInmueble, metrosCuadrados, propietario);
    }


    public Gimnasio( Administrador administrador) {
        super(null, null, "Gym", 0,administrador);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
