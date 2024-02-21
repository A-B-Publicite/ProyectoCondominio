/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package check_in;

import Administracion.Administrador;
import Administracion.Perfil;
import Administracion.Residente;
import Inmueble.EspacioDeParqueadero;
import Inmueble.InmuebleComun;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MARQUEZ
 */
public class MenuCI {

    public static void menuCheckIn(Administrador adminEnFichero, int[] opcionesMenuGeneral) {
        do {
            int opcionesMenu;
            int opcionSubMenu = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("""
                               Opciones:
                               1. Registrar Entrada como Admin
                               2. Crear residente con autorizacion
                               3. Buscar residente y realizar entrada
                               4. Crear una autorizacion 
                               5. Crear guardia y registrar entrada
                               6. registrar una visita como guardia
                               0. Salir
                               """);

            opcionesMenu = scanner.nextInt();
            scanner.nextLine();
            try {
                switch (opcionesMenu) {
                    case 1:
                        Autorizacion autorizacion = adminEnFichero.crearAutorizacion(adminEnFichero.getNombreApellido(), "20/2/2022", "20/2/2026");
                        adminEnFichero.setAutorizacion(autorizacion);
                        adminEnFichero.realizarCheckIn("21/2/2024", "10:00");
                        break;
                    case 2:
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Apellido: ");
                        String apellido = scanner.nextLine();
                        System.out.print("Fecha actual: ");
                        String feA = scanner.nextLine();
                        System.out.print("Fecha fin: ");
                        String feF = scanner.nextLine();

                        adminEnFichero.registrarResidente(nombre, apellido, Boolean.TRUE, feA, feF);
                        break;
                    case 3:
                        System.out.print("Ingrese el residente a buscar: ");
                        String residenteABuscar = scanner.nextLine();
                        System.out.print("Fecha actual: ");
                        String fecA = scanner.nextLine();
                        System.out.print("Hora actual: ");
                        String horA = scanner.nextLine();                        
                        Residente residentePruebas;
                        try {
                            System.out.print("Realizando registro de "+residenteABuscar);
                            residentePruebas = adminEnFichero.obtenerResidente(residenteABuscar);
                            
                            scanner = new Scanner(System.in);

                            System.out.println("""
                                    Opciones:
                                    1. registro sin vehiculo
                                    2. registro con vehiculo
                                    0. Salir
                               """);

                            opcionSubMenu = scanner.nextInt();
                            switch (opcionSubMenu) {
                                case 1 -> {
                                    residentePruebas.realizarCheckIn(fecA, horA);
                                }
                                case 2 -> {
                                    residentePruebas.realizarCheckIn(fecA, horA, true);
                                }
                                default ->
                                    System.out.println("No ha escogido una opcion correcta"); //ver el salir
                            } 
                        }catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }      
                        break;
                    case 4:
                        System.out.print("Crear autorizacion para el residente: ");
                        String residenteBuscar = scanner.nextLine();
                        System.out.print("Fecha inicio: ");
                        String feI = scanner.nextLine();
                        System.out.print("Fecha fin: ");
                        String feFi = scanner.nextLine();
                        try {
                            residentePruebas = adminEnFichero.obtenerResidente(residenteBuscar);
                            System.out.print("Realizando autorizacion de "+residenteBuscar);
                            Autorizacion autorizacionNueva = adminEnFichero.crearAutorizacion(residentePruebas.getNombreApellido(), feI, feFi);
                            residentePruebas.setAutorizacion(autorizacionNueva);
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }      
                        break;     
                    case 5:
                        System.out.print("Nombre: ");
                        String nom = scanner.nextLine();
                        System.out.print("Apellido: ");
                        String ape = scanner.nextLine();
                        System.out.print("Fecha inicio: ");
                        String fechaI = scanner.nextLine();
                        System.out.print("Fecha fin: ");
                        String fechaFi = scanner.nextLine();
                        System.out.print("Hora llegada: ");
                        String hora = scanner.nextLine();
                        adminEnFichero.registrarGuardia(nom, ape, fechaI, fechaFi);
                        adminEnFichero.getCondominio().getGuardia().realizarCheckIn(fechaI, hora);  
                        break;
                    case 6:
                        System.out.print("DATOS VISITANTE\n");
                        System.out.print("Nombres: ");
                        String nombres = scanner.nextLine();
                        System.out.print("Motivo de visita: ");
                        String motivo = scanner.nextLine();
                        System.out.print("Persona a visitar: ");
                        String persona = scanner.nextLine();
                        System.out.print("Fecha Llegada: ");
                        String fechaLlegada = scanner.nextLine();
                        System.out.print("Hora llegada: ");
                        String horaLle = scanner.nextLine();
                        //Prueba Visitante
                        Visitante visitante = new Visitante(motivo, nombres, persona);
                        Perfil residenteAVisitar;
                        try {
                            scanner = new Scanner(System.in);
                            
                            String[] partes = persona.split(" ");
                            residenteAVisitar = adminEnFichero.obtenerResidente(partes[0]);
                            EspacioDeParqueadero espacio = new EspacioDeParqueadero(10.0);

                            for (InmuebleComun inmueble : adminEnFichero.obtenerInmuebleComun()) {
                                if (inmueble instanceof EspacioDeParqueadero) {
                                    espacio = (EspacioDeParqueadero) inmueble;                 
                                }
                            }
                            
                            System.out.println("""
                                    Opciones:
                                    1. registro sin vehiculo
                                    2. registro con vehiculo
                                    0. Salir
                               """);

                            opcionSubMenu = scanner.nextInt();
                            switch (opcionSubMenu) {
                                case 1 -> {
                                    adminEnFichero.getCondominio().getGuardia().realizarCheckIn(fechaLlegada, horaLle, 
                                                    visitante,
                                                    residenteAVisitar, false, espacio);
                                }
                                case 2 -> {
                                    adminEnFichero.getCondominio().getGuardia().realizarCheckIn(fechaLlegada, horaLle, 
                                                    visitante,
                                                    residenteAVisitar, true, espacio);
                                }
                                default ->
                                    System.out.println("No ha escogido una opcion correcta"); //ver el salir
                            }                            
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    case 0:
                        opcionesMenuGeneral[0] = -1;
                        return;
                    default:
                        System.out.print("No existe esa opcion");
                        break;
                }
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        } while (opcionesMenuGeneral[0] == 1);        
    }
    
}
