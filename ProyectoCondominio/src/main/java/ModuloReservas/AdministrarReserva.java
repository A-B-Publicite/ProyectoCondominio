/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloReservas;
import Inmueble.*;
import Administracion.*;
import java.util.*;
import java.util.Random;
/**
 *
 * @author Grupo 4
 */

public class AdministrarReserva {
    
    ArrayList <Reserva> listaReservas = new ArrayList<Reserva>();
   
    // Método para realizar una reserva
    public boolean realizarReserva(String detalleReserva, Administrador usuario, int opcionReserva, String diaReserva, String correo) {        
        Residente residente = usuario.obtenerResidentePorCorreo(correo);
        System.out.println(opcionReserva);
        switch(opcionReserva){
            case 0:  {
                System.out.println("Ingrese el dia de la reserva: ");
                for (InmuebleComun inmueble : usuario.getInmueblesComunes()) {
                    System.out.println(inmueble);
// Verificar si el inmueble actual es una instancia de Cancha.
                    if (inmueble instanceof Cancha) {
                        System.out.println(inmueble.toString());
                        Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                        if(disponibilidad.verificarDisponibilidad(diaReserva)){
                            System.out.println("Ingrese el detalle de la reserva: ");
                            Reserva nuevaReserva = new Reserva(generarNumeroAleatorio(), diaReserva, detalleReserva, residente, "Cancha"); 
                            this.listaReservas.add(nuevaReserva);
                            return true;
                        }
                    }
                }    
            }
            default:{
                System.out.println("Caso no existe");
                return false; 
            }
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

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    
    
}