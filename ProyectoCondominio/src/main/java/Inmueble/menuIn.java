/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author issac
 */
public class menuIn {
    public static void menuInmueble() {
        int opcionReserva;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("""
                               Opciones:
                               1. Alquilar Silla
                               2. Alquilar mesa
                               3. Alquilar Carpa
                               4. Ver Muebles Alquilados
                               5. Ver Muebles Disponibles
                               6. Anular Reservas
                               7. Salir
                               8. Agregar mubeles
                               """);

        opcionReserva = scanner.nextInt();
        
        try{
            switch (opcionReserva) {
                case 1: {//Alquilar Silla
                    scanner = new Scanner(System.in);

                        System.out.println("Ingrese la cantidad de Sillas");
                        int cantidadSillas = scanner.nextInt();
                        Silla silla = new Silla(cantidadSillas);
                        listaMuebles.add(silla);
                        silla.setDisponible(false);

                        System.out.println("Sillas alquiladas correctamente.");
                        
                    break;  
                }
                case 2: {//Alquiler Mesa
                    
                    break;
                }
                case 3:{//Alquiler Carpa	                case 3:{//Reprogramar
                    
                    break;
                }
                case 4: {// Listar muebles alquilados
                    for (Mueble mueble : listaMuebles) {
                        if (!mueble.isDisponible()) {
                            System.out.println("Tipo: " + mueble.getTipo() + ", Cantidad: " + ((Silla) mueble).getCantidad());
                        }
                    }
                    break;
                }  
                case 5: {// Listar muebles disponibles
                    for (Mueble mueble : listaMuebles) {
                        if (mueble.isDisponible()) {
                            System.out.println("Tipo: " + mueble.getTipo());
                        }
                    }
                    break;
                    
                } 
                case 6: {// Anular reserva
                    int opcionAnular;
                    
                    System.out.println("""
                                           Seleccion el tipo de mueble que desea anular:
                                           1. Silla
                                           2. Mesa
                                           3. Carpa
                                           
                                           """);
                    opcionAnular = scanner.nextInt();
                    switch(opcionAnular){
                        case 1: {
                         break;   
                        }
                        case 2: {
                         break;   
                        }
                        case 3: {
                         break;   
                        }
                        default: {
                         break;   
                        }
                    }
                    
                    break;
                } 
                case 7: {	
                    System.out.println("Saliendo del Modulo Reservas");	
                }                              
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
        
    }
}
