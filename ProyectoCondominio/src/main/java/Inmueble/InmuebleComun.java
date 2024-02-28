package Inmueble;

import ModuloReservas.Reserva;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class InmuebleComun implements Serializable  {

    private ArrayList<String> diasDisponibles;
    private double metrosCuadrados;//es necesario calcular la alícuota de un inmueble comun? o tener un valor adicional por las areas comunes que se suma al pago fianl de la alicuota 

    public InmuebleComun(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
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

    public ArrayList<String> consultarDiasDisponibles() {
        return diasDisponibles;
    }
    
}
