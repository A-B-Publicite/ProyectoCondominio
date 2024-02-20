package Inmueble;

import areaComun.Reserva;
import java.util.ArrayList;

public abstract class InmuebleComun{

    private ArrayList<Reserva> listaReservas;
    private ArrayList<String> diasDisponibles;
    private double metrosCuadrados;//es necesario calcular la alícuota de un inmueble comun? o tener un valor adicional por las areas comunes que se suma al pago fianl de la alicuota 

    public InmuebleComun(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
        this.listaReservas = null;
        this.diasDisponibles = null;
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

    public ArrayList<Reserva> obtenerReservas() {
        return listaReservas;
    }

    public ArrayList<String> consultarDiasDisponibles() {
        return diasDisponibles;
    }
    
}
