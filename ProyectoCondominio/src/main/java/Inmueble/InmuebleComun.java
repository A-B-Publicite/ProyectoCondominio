package Inmueble;

import Administracion.Perfil;
import areaComun.Reserva;
import java.util.List;

public abstract class InmuebleComun{

    private List<Reserva> listaReservas;
    private List<String> diasDisponibles;
    String nombreInmueble;
    
    double metrosCuadrados;//es necesario calcular la alícuota de un inmueble comun? o tener un valor adicional por las areas comunes que se suma al pago fianl de la alicuota 
    Perfil propietario;
    
    public InmuebleComun() {
    }

    public InmuebleComun(List<Reserva> listaReservas, List<String> diasDisponibles, String nombreInmueble, double metrosCuadrados, Perfil propietario) {
        this.listaReservas = listaReservas;
        this.diasDisponibles = diasDisponibles;
        this.nombreInmueble = nombreInmueble;
        this.metrosCuadrados = metrosCuadrados;
        this.propietario = propietario;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    //para el modulo de reserva
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
