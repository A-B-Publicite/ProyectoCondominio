/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloReservas;

import Inmueble.InmuebleComun;
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Grupo 4
 */
public class Disponibilidad implements Serializable{

    private InmuebleComun areaComun;
    // Constructor
    public Disponibilidad(InmuebleComun areaComun) {
        this.areaComun = areaComun;
    }

    // Método para verificar la disponibilidad
    public boolean verificarDisponibilidad(String dia, ArrayList<Reserva> listaReservas, String areaComun) {
        ArrayList<String> reservas = this.areaComun.consultarDiasDisponibles();
        // No hay conflictos, está disponible
        
        for (Reserva reserva : listaReservas) {
            if(reserva.getAreaComun().equals(areaComun))
            {
                if(reserva.getDia().equals(dia)) return false;
            }
        }
        return reservas.contains(dia);  
    }

    // Método para eliminar una reserva
    public void eliminarReserva(Reserva reserva) {
        this.areaComun.eliminarReserva(reserva);
    }

    // Método para agregar una reserva
    public void agregarReserva(Reserva reserva) {
        this.areaComun.agregarReserva(reserva);
    }

    // Getters y setters
    public ArrayList<Reserva> getListaReservas() {
        return this.areaComun.obtenerReservas();
    }
}
