/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Finanzas;

/**
 *
 * @author alejo
 */
import Administracion.Administrador;
import Administracion.Contrato;
import Administracion.Residente;
import Finanzas.ObligacionFinanciera;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuFinanzas {
    public static void menuFinanzas(Administrador administrador) {
        try {
            Residente residente = administrador.obtenerResidenteCorreo("x.x@policondominio.com");
            
            
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.println("\n== Menú Principal ==");
                System.out.println("1. Ver obligaciones financieras");
                System.out.println("2. Recargar saldo");
                System.out.println("3. Pagar obligación financiera");
                System.out.println("4. Ver registros de pagos completados");
                System.out.println("5. Otros casos (añade tu descripción)");
                System.out.println("6. Mostrar recargas");
                System.out.println("0. Salir");
                
                System.out.print("Ingrese la opción deseada: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                
                switch (opcion) {
                    case 1:
                        // Ver obligaciones financieras
                        String resultadoConsulta = residente.getCuenta().mostrarObligaciones();
                        System.out.println(resultadoConsulta);
                        break;
                    case 2:
                        System.out.println("== Menú de Recarga de Saldo ==");
                        System.out.println("1. Efectivo");
                        System.out.println("2. Tarjeta");
                        System.out.println("3. Transferencia");
                        System.out.print("Seleccione la opción de recarga: ");
                        int opcionRecarga = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea
                        
                        double montoRecarga = 0;
                        switch (opcionRecarga) {
                            case 1:
                                System.out.print("Ingrese el monto en efectivo: ");
                                montoRecarga = scanner.nextDouble();
                                residente.getCuenta().recargarSaldo(montoRecarga);
                                System.out.println("Recarga realizada con éxito. Saldo actual: " + residente.getCuenta().getSaldo());
                                break;
                            case 2:
                                System.out.print("Ingrese el monto para recarga con tarjeta: ");
                                montoRecarga = scanner.nextDouble();
                                scanner.nextLine(); // Consumir el salto de línea
                                System.out.print("Ingrese el número de tarjeta: ");
                                String numeroTarjeta = scanner.nextLine();
                                System.out.print("Ingrese el PIN de la tarjeta: ");
                                String pinTarjeta = scanner.nextLine();
                                residente.getCuenta().recargarSaldo(montoRecarga, numeroTarjeta, pinTarjeta);
                                System.out.println("Recarga realizada con éxito. Saldo actual: " + residente.getCuenta().getSaldo());
                                break;
                            case 3:
                                System.out.print("Ingrese el monto para transferencia: ");
                                montoRecarga = scanner.nextDouble();
                                scanner.nextLine(); // Consumir el salto de línea
                                System.out.print("Ingrese el número de cuenta de origen: ");
                                String numeroCuenta = scanner.nextLine();
                                residente.getCuenta().recargarSaldo(montoRecarga, numeroCuenta);
                                System.out.println("Recarga realizada con éxito. Saldo actual: " + residente.getCuenta().getSaldo());
                                break;
                            default:
                                System.out.println("Opción no válida. Intente de nuevo.");
                                break;
                        }
                        break;
                    case 3:
                        // Pagar obligación financiera
                        System.out.print("Ingrese el ID de la obligación financiera a pagar: ");
                        String idPago = scanner.nextLine();
                        ObligacionFinanciera obligacionFinancieraAPagar = residente.getCuenta().recuperarObligacion(idPago);
                        
                        if (obligacionFinancieraAPagar != null) {
                            residente.getCuenta().pagarObligacionFinancieraResidente(obligacionFinancieraAPagar);
                            System.out.println("Pago realizado con éxito. Saldo actual: " + residente.getCuenta().getSaldo());
                        } else {
                            System.out.println("Obligación financiera no encontrada.");
                        }
                        break;
                    case 4:
                        // Ver registros de pagos completados
                        String registrosCompletados = residente.getCuenta().mostrarRegistros();
                        System.out.println(registrosCompletados);
                        break;
                    case 5:
                        // Otros casos - Añade tu lógica aquí
                        System.out.println("Añade aquí tu descripción y lógica para el caso 5");
                        break;
                    case 6:
                        // Mostrar recargas
                        String resultadoRecargas = residente.getCuenta().mostrarRecargas();
                        System.out.println(resultadoRecargas);
                        System.out.println("Saldo actual: " + residente.getCuenta().getSaldo());
                        break;
                    case 0:
                        System.out.println("Saliendo del programa.");
                        return;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(MenuFinanzas.class.getName()).log(Level.SEVERE, null, ex);
        }





    }
}
