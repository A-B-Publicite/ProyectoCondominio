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
    public Reserva realizarReserva(InmuebleComun inmuebleComun, String detalle, Administrador usuario) {
        int opcionReserva;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("""
                               Opciones:
                               1. Cancha
                               2. Gimnasio
                               3. Espacio de parqueadero
                               4. Piscina
                               5. Terraza
                               0. Salir
                               """);
        
        opcionReserva = scanner.nextInt();
        
        switch(opcionReserva){
            case 1:  {
                System.out.println("Ingrese el dia de la reserva: ");
                String diaReserva = scanner.next();
                for (InmuebleComun inmueble : usuario.obtenerInmuebleComun()) {
                    // Verificar si el inmueble actual es una instancia de Cancha.
                    if (inmueble instanceof Cancha) {
                        Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                        if(disponibilidad.verificarDisponibilidad(diaReserva)){
                            System.out.println("Ingrese el detalle de la reserva: ");
                            String detalleReserva = scanner.next();
                            //to do: pedir el correo del usuario y no enviar el de administrador
                            Reserva nuevaReserva = new Reserva(generarNumeroAleatorio(), diaReserva, detalleReserva, usuario); 
                            this.listaReservas.add(nuevaReserva);
                        }else{
                            System.out.println("No se pudo realizar la reserva: ");
                        }
                    }
                }    
            }
            
            case 2:  {
                System.out.println("Ingrese el dia de la reserva: ");
                String diaReserva = scanner.next();
                for (InmuebleComun inmueble : usuario.obtenerInmuebleComun()) {
                    // Verificar si el inmueble actual es una instancia de Cancha.
                    if (inmueble instanceof Gimnasio) {
                        Disponibilidad disponibilidad = new Disponibilidad(inmueble);
                        if(disponibilidad.verificarDisponibilidad(diaReserva)){
                            System.out.println("Ingrese el detalle de la reserva: ");
                            String detalleReserva = scanner.next();
                            //to do: pedir el correo del usuario y no enviar el de administrador
                            Reserva nuevaReserva = new Reserva(generarNumeroAleatorio(), diaReserva, detalleReserva, usuario); 
                            this.listaReservas.add(nuevaReserva);
                        }else{
                            System.out.println("No se pudo realizar la reserva: ");
                        }
                    }
                }    
            }
        }
        if (inmuebleComun.consultarDiasDisponibles().contains("Lunes") ) {
            Reserva nuevaReserva = new Reserva(generarNumeroAleatorio(), "Lunes", detalle, usuario); 
            inmuebleComun.agregarReserva(nuevaReserva); // Agrega la reserva también a la Arraylista de reservas del área común
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