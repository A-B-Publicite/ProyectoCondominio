/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModuloReservas;

import java.util.Scanner;

/**
 *
 * @author bejar
 */
public class Menu {
    
    public static void menuReservas() {
        // Creamos el Administrador de las Reservas
        AdministrarReserva adminReserva = new AdministrarReserva();
        
        int opcionReserva;
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                               Opciones:
                               1. Crear reserva
                               2. Cancelar reserva
                               3. Reprogramar reserva
                               4. Consultar reserva
                               0. Salir
                               """);

        opcionReserva = scanner.nextInt();
        scanner.nextLine();
        
        try {
            switch (opcionReserva) {
                case 1: //Crear reserva

                    // Pedimos el detalle de la reserva
                    String detalleReserva;
                    detalleReserva = scanner.nextLine();
                    
                    //Creamos la reserva
                    Reserva nuevaReserva = adminReserva.realizarReserva(areaComunReserva, diaReserva, detalleReserva, usuarioReserva);
                    
                    System.out.print("Nombre del condominio: ");
                    String nombreCondominio = scanner.nextLine();
                    administrador.agregarCondominio(nombreCondominio);
                    break;
                case 2: //Cancelar reserva
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Es propietario: ");
                    Boolean esPropietario = scanner.nextBoolean();

                    administrador.registrarResidente(nombre, apellido, esPropietario);
                    break;
                case 3:
                    System.out.print("Ingrese el correo del presidente: ");
                    String correoPresidente = scanner.nextLine();
                    System.out.print("Ingrese el correo del secretario: ");
                    String correoSecretario = scanner.nextLine();
                    administrador.agregarDirectiva(correoPresidente, correoSecretario);
                    System.out.print("Se creo exitosamente");
                    
                    break;
                case 4:
                    System.out.print("Ingrese el numero de departamentos: ");
                    administrador.agregarDepartamento(scanner.nextInt());
                    break;
                case 5:
                    do {
                        int opcionInmuebleComun;
                        scanner = new Scanner(System.in);

                        System.out.println("""
                                    Opciones:
                                    1. Cancha
                                    2. Gimnasio
                                    3. Espacio de parqueadero
                                    4. Piscina
                                    5. Terraza
                                    0. Salir
                               """);

                        opcionInmuebleComun = scanner.nextInt();
                        switch (opcionInmuebleComun) {
                            case 1 -> {
                                System.out.print("Coloque los metros cuadrados del inmueble: ");
                                double metrosCuadrados = scanner.nextDouble();
                                Cancha canchaNueva = new Cancha(metrosCuadrados);
                                administrador.agregarInmuebleComun(canchaNueva);
                            }
                            case 2 -> {
                                System.out.print("Coloque los metros cuadrados del inmueble: ");
                                double metrosCuadrados = scanner.nextDouble();
                                Gimnasio gymNuevo = new Gimnasio(metrosCuadrados);
                                administrador.agregarInmuebleComun(gymNuevo);
                            }
                            case 3 -> {
                                System.out.print("Coloque los metros cuadrados del inmueble: ");
                                double metrosCuadrados = scanner.nextDouble();
                                EspacioDeParqueadero espacioParqueo = new EspacioDeParqueadero(metrosCuadrados);
                                administrador.agregarInmuebleComun(espacioParqueo);
                            }
                            case 4 -> {
                                System.out.print("Coloque los metros cuadrados del inmueble: ");
                                double metrosCuadrados = scanner.nextDouble();
                                Piscina piscinaNueva = new Piscina(metrosCuadrados);
                                administrador.agregarInmuebleComun(piscinaNueva);
                            }
                            case 5 -> {
                                System.out.print("Coloque los metros cuadrados del inmueble: ");
                                double metrosCuadrados = scanner.nextDouble();
                                Terraza terrazaNueva = new Terraza(metrosCuadrados);
                                administrador.agregarInmuebleComun(terrazaNueva);
                            }
                            default ->
                                System.out.println("No ha escogido una opcion correcta"); //ver el salir
                        }
                        System.out.println("Desea agregar otro: "); //ver el salir

                    } while (scanner.nextBoolean());
                    break;
                case 6:
                    System.out.println(administrador.mostrarContratos());
                    break;
                case 7:
                    LocalDate fechaContrato = LocalDate.now();
                    System.out.print("Fecha inicio: ");
                    String fechaInicio = scanner.nextLine();
                    System.out.print("Fecha finalizacion: ");
                    String fechaFinalizacion = scanner.nextLine();
                    System.out.print("Descripcion: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    administrador.agregarContrato(fechaContrato, precio, descripcion, fechaInicio, fechaFinalizacion);
                    break;

            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
}
