/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areaComun;
import Inmueble.InmuebleComun;
import Administracion.Perfil;
import java.util.List;
import java.util.Random;
/**
 *
 * @author Grupo 4
 */


public class AdministrarReserva {

    // Método para realizar una reserva
    public Reserva realizarReserva(InmuebleComun areaComun, String dia, String detalle, Perfil usuario) {
        List<String> disponibilidad = areaComun.consultarDiasDisponibles();
        if (disponibilidad.contains(dia) ) {
            Reserva nuevaReserva = new Reserva(generarNumeroAleatorio(), dia, detalle, usuario); 
            areaComun.agregarReserva(nuevaReserva); // Agrega la reserva también a la lista de reservas del área común
            return nuevaReserva;
        } else {
            return null;  // No se puede realizar la reserva debido a un conflicto
        }
    }

    // Método para reprogramar una reserva
    public void reprogramarReserva(Reserva reserva, String dia) {
        // Lógica para verificar si la reprogramación es posible
        System.out.println("Reprogramando la reserva con ID: " + reserva.getId());
        reserva.reprogramar(dia);
        System.out.println("La reserva ha sido reprogramada con éxito.");
        /*boolean disponible = verificarDisponibilidad();
        if (disponible) {
            
        } else {
            System.out.println("No se puede reprogramar la reserva, las fechas no están disponibles.");
        }*/
    }

    // Método para cancelar una reserva
    public void cancelarReserva(Reserva reserva) {
        reserva.cancelar();
        System.out.println("La reserva con ID: " + reserva.getId() + " ha sido cancelada.");
    }
    
    public static int generarNumeroAleatorio() {
        Random rand = new Random();
        int numero = rand.nextInt(90000) + 10000; // Genera un número aleatorio entre 10000 y 99999
        return numero;
    }
}