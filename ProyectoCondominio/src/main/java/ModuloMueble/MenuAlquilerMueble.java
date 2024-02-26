package ModuloMueble;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Administracion.Residente;
import java.util.Date;

public class MenuAlquilerMueble {
   static Scanner scanner = new Scanner(System.in);      
public static void mostrar() {
       
        int opcion;
      Alquiler alquiler= new Alquiler();

        System.out.println("""
                               Opciones:
                               1. Realizar Alquiler
                               2. Eliminar Alquiler
                               3. Visualizar lista de alquiler 
                               4. Reprogramar Alquiler
                               0. Salir
                               """);

         opcion= scanner.nextInt();
        
        try{
            
            
           
            switch (opcion) {
 // --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------               
                case 1: {//Crear alquiler
                    do {
                        scanner = new Scanner(System.in);
                        System.out.println(" Ingrese el tipo de MUEBLE que desea alquilar"); 
                        System.out.println("""
                                    Opciones a reservar:
                                    1. Mesa
                                    2. Silla
                                    3. Carpa                                               
                                    0. Salir
                               """);
                        int opcionTipoMueble = scanner.nextInt();
                        switch (opcionTipoMueble) {
                            case 1 -> {  ///// MESA
                                System.out.println("Ingrese el dia de inicio: ");
                                String diaInicio = scanner.next();      
                                System.out.println("Ingrese el dia de fin: ");
                                String diaFin = scanner.next();
                                
                                
                                
                                
                                
                                for (Mueble mueble : residente.obtenerMueble()) {
                                // Verificar si el mueble actual es una instancia de Mesa.
                                    if (mueble instanceof Mesa) {
                                        Alquiler nuevoAlquiler = adminReserva.realizarReserva(inmueble, detalleReserva, administrador);
                                    }
                                }
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