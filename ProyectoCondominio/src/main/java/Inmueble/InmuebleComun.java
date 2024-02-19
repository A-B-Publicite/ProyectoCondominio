package Inmueble;

import Administracion.Perfil;
import areaComun.Reserva;
import java.util.List;

public abstract class InmuebleComun extends Inmueble{

    private List<Reserva> listaReservas;

    public InmuebleComun(List<Reserva> listaReservas, double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        super(metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
        this.listaReservas = listaReservas;
    }
    
    public void addReserva(Reserva reserva){
        listaReservas.add(reserva);               
    }
}
