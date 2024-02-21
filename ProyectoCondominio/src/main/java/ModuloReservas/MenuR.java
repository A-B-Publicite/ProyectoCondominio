/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloReservas;

import Administracion.*;
import Inmueble.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bejar
 */
public class MenuR {

    public static void menuReservas(Administrador administrador) {
        // Creamos el Administrador de las Reservas
        AdministrarReserva adminReserva = new AdministrarReserva();

        int opcionReserva;
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                               Opciones:
                               1. Crear reserva
                               2. Cancelar reserva
                               3. Reprogramar reserva
                               4. Listar reservas
                               0. Salir
                               """);

        opcionReserva = scanner.nextInt();
        
        try{
            switch (opcionReserva) {
                case 1: {//Crear reserva
                    do {
                        scanner = new Scanner(System.in);

                        System.out.println("""
                                    Opciones a reservar:
                                    1. Cancha
                                    2. Gimnasio
                                    3. Espacio de parqueadero
                                    4. Piscina
                                    5. Terraza
                                    0. Salir
                               """);
                        int opcionInmuebleComun = scanner.nextInt();
                        switch (opcionInmuebleComun) {
                            case 1 -> { //Cancha
                                System.out.println("Ingrese el detalle de la reserva: ");
                                String detalleReserva = scanner.next();                                                               
                                for (InmuebleComun inmueble : administrador.obtenerInmuebleComun()) {
                                // Verificar si el inmueble actual es una instancia de Cancha.
                                    if (inmueble instanceof Cancha) {
                                        Reserva nuevaReserva = adminReserva.realizarReserva(inmueble, detalleReserva, administrador);
                                    }
                                }
                            break;
                            }                            
                            case 2 -> { //Gimnasio
                                System.out.println("Ingrese el detalle de la reserva: ");
                                String detalleReserva = scanner.nextLine(); 
                                for (InmuebleComun inmueble : administrador.obtenerInmuebleComun()) {
                                    // Verificar si el inmueble actual es una instancia de Cancha.
                                    if (inmueble instanceof Gimnasio) {
                                        Reserva nuevaReserva = adminReserva.realizarReserva(inmueble, detalleReserva, administrador);
                                    }
                                }   
                            break;
                            }
                            case 3 -> { //Espacio de Parqueadero
                                System.out.println("Ingrese el detalle de la reserva: ");
                                String detalleReserva = scanner.nextLine(); 
                                for (InmuebleComun inmueble : administrador.obtenerInmuebleComun()) {
                                    // Verificar si el inmueble actual es una instancia de Cancha.
                                    if (inmueble instanceof EspacioDeParqueadero) {
                                        Reserva nuevaReserva = adminReserva.realizarReserva(inmueble, detalleReserva, administrador);
                                    }
                                }   
                            break;
                            }
                            case 4 -> { //Piscina
                                System.out.println("Ingrese el detalle de la reserva: ");
                                String detalleReserva = scanner.nextLine(); 
                                for (InmuebleComun inmueble : administrador.obtenerInmuebleComun()) {
                                    // Verificar si el inmueble actual es una instancia de Cancha.
                                    if (inmueble instanceof Piscina) {
                                        Reserva nuevaReserva = adminReserva.realizarReserva(inmueble, detalleReserva, administrador);
                                    }
                                }   
                            break;
                            }
                            case 5 -> { //Terraza
                                System.out.println("Ingrese el detalle de la reserva: ");
                                String detalleReserva = scanner.next(); 
                                for (InmuebleComun inmueble : administrador.obtenerInmuebleComun()) {
                                    // Verificar si el inmueble actual es una instancia de Cancha.
                                    if (inmueble instanceof Terraza) {
                                        Reserva nuevaReserva = adminReserva.realizarReserva(inmueble, detalleReserva, administrador);
                                    }
                                }   
                            break;
                            }
                            default -> {
                                System.out.println("No ha escogido una opcion correcta"); //ver el salir
                            }
                        }
                    }while (scanner.nextBoolean());
                    System.out.println("Desea agregar otra reserva: 1. SI 0. NO"); //ver el salir
                    break;   
                }
                case 2: {//Cancelar reserva
                    for (InmuebleComun inmueble : administrador.obtenerInmuebleComun()) {	                    
                        System.out.println(inmueble.obtenerReservas());	                   
                        ArrayList<Reserva> reservas = new ArrayList<Reserva>();	                    
                        reservas = inmueble.obtenerReservas();	                    
                        for (Reserva reserva : reservas){	                    
                            System.out.println("La reserva con ID: " + reserva.getId() + "\nDetalle: " + reserva.getDetalle() +	                    
                                    "\nEn el día: " + reserva.getDia() + "\nDel usuario: " + reserva.getUsuario().getNombreApellido());	
                            System.out.println("Ingrese el ID de la reserva: ");	
                            int id = scanner.nextInt(); 	
                            if(reserva.getId() == id){                             	
                                reserva.cancelar();	
                            }else{ System.out.println("La reserva no existe");}	
                        }	
                    }
                    break;
                }
                case 3:{//Reprogramar reserva	                case 3:{//Reprogramar
                    for (InmuebleComun inmueble : administrador.obtenerInmuebleComun()) {
                        System.out.println(inmueble.obtenerReservas());
                        ArrayList<Reserva> reservas = new ArrayList<Reserva>();
                        reservas = inmueble.obtenerReservas();
                        for (Reserva reserva : reservas){
                            System.out.println("La reserva con ID: " + reserva.getId() + "\nDetalle: " + reserva.getDetalle() +	                    
                                    "\nEn el día: " + reserva.getDia() + "\nDel usuario: " + reserva.getUsuario().getNombreApellido());	
                            System.out.println("Ingrese el ID de la reserva: ");	
                            int id = scanner.nextInt(); 	
                            System.out.println(reserva.getId() == id);	
                            if(reserva.getId() == id){	
                                System.out.println("Ingrese el día a ser reprogaramada: ");	
                                String diaReprogramado = scanner.next(); 	
                                reserva.reprogramar(diaReprogramado);	
                                break;	
                            }	
                        }	
                    }
                    break;
                }
                case 4: {// Listar Reservas
                    
                    System.out.print("Todas las reservas son: ");
                    for (InmuebleComun inmueble : administrador.obtenerInmuebleComun()) {
                        System.out.println(inmueble.obtenerReservas());
                        ArrayList<Reserva> reservas = new ArrayList<Reserva>();
                        reservas = inmueble.obtenerReservas();
                        for (Reserva reserva : reservas){
                            System.out.println("La reserva con ID: " + reserva.getId() + "\nDetalle: " + reserva.getDetalle() +
                                    "\nEn el día: " + reserva.getDia() + "\nDel usuario: " + reserva.getUsuario().getNombreApellido());
                        }
                    }
                    break;
                }                              
                case 0: {	
                    System.out.println("Saliendo del Modulo Reservas");	
                }                              
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }            
    }
}
