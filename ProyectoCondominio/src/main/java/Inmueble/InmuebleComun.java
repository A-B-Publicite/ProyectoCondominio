package Inmueble;

import ModuloReservas.Reserva;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class InmuebleComun implements Serializable  {

    private ArrayList<String> diasDisponibles;
    private double metrosCuadrados;//es necesario calcular la alícuota de un inmueble comun? o tener un valor adicional por las areas comunes que se suma al pago fianl de la alicuota
    private boolean necesitaMantenimiento;
    public InmuebleComun(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
        this.diasDisponibles = new ArrayList<String>();
        this.necesitaMantenimiento=false;
        diasDisponibles.add("Lunes");
        diasDisponibles.add("Martes");
        diasDisponibles.add("Miercoles");
        diasDisponibles.add("Jueves");
        diasDisponibles.add("Viernes");

    }

    public InmuebleComun() {
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public ArrayList<String> consultarDiasDisponibles() {
        return diasDisponibles;
    }

    public boolean isNecesitaMantenimiento() {
        return necesitaMantenimiento;
    }

    public void setNecesitaMantenimiento(boolean necesitaMantenimiento) {
        this.necesitaMantenimiento = necesitaMantenimiento;
    }
    

    public InmuebleComun crearInmueble(String inmuebleComun, String metrosCuadrados){
        switch (inmuebleComun) {
            case "Cancha":
                return new Cancha(Double.parseDouble(metrosCuadrados));
            case "Espacio de Parqueo":
                return new EspacioDeParqueadero(Double.parseDouble(metrosCuadrados));
            case "Gimnasio":
                return new Gimnasio(Double.parseDouble(metrosCuadrados));
            case "Piscina":
                return new Piscina(Double.parseDouble(metrosCuadrados));
            case "Terraza":
                return new Terraza(Double.parseDouble(metrosCuadrados));
            default:
                javax.swing.JOptionPane.showMessageDialog(null, "Inserte una opcion correcta");
        }
        return null;
    }
}
