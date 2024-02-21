package Inmueble;

import ModuloReservas.Reserva;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class InmuebleComun implements Serializable  {

    private ArrayList<Reserva> listaReservas;
    private ArrayList<String> diasDisponibles;
    private double metrosCuadrados;//es necesario calcular la alícuota de un inmueble comun? o tener un valor adicional por las areas comunes que se suma al pago fianl de la alicuota 

    public InmuebleComun(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
        this.listaReservas = new ArrayList<Reserva>();
        this.diasDisponibles = new ArrayList<String>();
        diasDisponibles.add("Lunes");
        diasDisponibles.add("Martes");
        diasDisponibles.add("Miercoles");
        diasDisponibles.add("Jueves");
        diasDisponibles.add("Viernes");
        
    }
    
    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    //para el modulo de reserva
    
    public void agregarReserva(Reserva reserva){
        try{
            listaReservas.add(reserva);     
        }catch(Exception e){
            System.out.println("Error"+e);
        }
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
