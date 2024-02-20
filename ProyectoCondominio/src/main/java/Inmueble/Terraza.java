package Inmueble;

import areaComun.Reserva;
import java.util.ArrayList;

public class Terraza extends InmuebleComun {

    public Terraza(double metrosCuadrados) {
        super(metrosCuadrados);
    }
    @Override
    public void agregarReserva(Reserva reserva){
               
    }
    
    @Override
    public void eliminarReserva(Reserva reserva){
                     
    }
    
    @Override
    public ArrayList<Reserva> obtenerReservas() {
        return null; //por el momento
    }
    
    @Override
    public ArrayList<String> consultarDiasDisponibles() {
        return null; //por el momento
    }
    
}
