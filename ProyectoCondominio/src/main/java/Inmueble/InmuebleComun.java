package Inmueble;

import Administracion.Perfil;
import areaComun.Reserva;
import java.util.List;

public abstract class InmuebleComun extends Inmueble{

    private List<Reserva> listaReservas;
    private List<String> diasDisponibles;

    public InmuebleComun() {
    }

    public InmuebleComun(List<Reserva> listaReservas, List<String> diasDisponibles, String nombre, double metrosCuadrados, boolean necesitaMantenimiento, double alicuota, Perfil propietario) {
        super(nombre, metrosCuadrados, necesitaMantenimiento, alicuota, propietario);
        this.listaReservas = listaReservas;
        this.diasDisponibles = diasDisponibles;
    }


    public void agregarReserva(Reserva reserva){
        listaReservas.add(reserva);               
    }
    
    public void eliminarReserva(Reserva reserva){
        listaReservas.remove(reserva);               
    }

    public List<Reserva> obtenerReservas() {
        return listaReservas;
    }

    public List<String> consultarDiasDisponibles() {
        return diasDisponibles;
    }
    
}
