package Administracion;

import java.util.Scanner;
import Inmueble.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class Menu {

    public static void menuAdministracion(Administrador administrador, int[] opcionesMenuGeneral) {
        do {
            int opcionesMenu;
            int opcionSubMenu = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("""
                               Opciones:
                               1. Crear condominio
                               2. Registrar Residente
                               3. Agregar directiva
                               4. Agregar cantidad de Departamentos
                               5. Agregar un Inmueble Comun
                               6. Mostrar lista de contratos
                               7. Agregar contrato
                               0. Salir
                               """);

            opcionesMenu = scanner.nextInt();
            scanner.nextLine();
            try {
                switch (opcionesMenu) {
                    case 1:
                        System.out.print("Nombre del condominio: ");
                        String nombreCondominio = scanner.nextLine();
                        administrador.agregarCondominio(nombreCondominio);
                        break;
                    case 2:
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

                            opcionSubMenu = scanner.nextInt();
                            switch (opcionSubMenu) {
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
                            scanner.nextLine();
                            System.out.println("Desea agregar otro: 1. Si 0. NO"); //ver el salir
                            opcionSubMenu = scanner.nextInt();

                        } while (opcionSubMenu != 0);
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
