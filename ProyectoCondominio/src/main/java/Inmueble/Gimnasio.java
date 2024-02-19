package Inmueble;

import Administracion.Administrador;
import Administracion.Perfil;
import areaComun.Reserva;
import java.util.List;

public class Gimnasio extends InmuebleComun {

    public Gimnasio(List<Reserva> listaReservas, List<String> diasDisponibles, String nombre, double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        super(listaReservas, diasDisponibles, nombre, metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
    }

    public Gimnasio(int i, Administrador administrador) {
        super(null, null, "Gym", i,false,0,administrador);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}
