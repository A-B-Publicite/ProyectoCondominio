package Administracion;

import java.util.Scanner;
import Inmueble.*;

public class Menu {
    public static void menuAdministracion(Administrador administrador){
        int opcion;
        Scanner scanner = new Scanner(System.in);
        
        
        
        
        
        System.out.println("""
                               Opciones:
                               1. Crear condominio
                               2. Registrar Residente
                               3. Agregar directiva
                               4. Agregar Departamento
                               5. Agregar un Inmueble Comun
                               6. Mostrar lista de contratos
                               0. Salir
                               """);

            opcion = scanner.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Nombre del condominio: ");
                        administrador.agregarCondominio(scanner.nextLine());
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
                        break;
                    case 4:
                        System.out.print("Ingrese el tamanio de ese Departamento: ");
                        administrador.agregarDepartamento(scanner.nextInt());
                        break;
                    case 5:
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
                                System.out.print("Coloque los metros cuadrados del inmueble");
                                double metrosCuadrados = scanner.nextDouble();
                                Cancha canchaNueva = new Cancha(metrosCuadrados);
                                administrador.agregarInmuebleComun(canchaNueva);
                        }
                            case 2 -> {
                                System.out.print("Coloque los metros cuadrados del inmueble");
                                double metrosCuadrados = scanner.nextDouble();
                                Gimnasio gymNuevo = new Gimnasio(metrosCuadrados);
                                administrador.agregarInmuebleComun(gymNuevo);
                        }
                            case 3 -> {
                                System.out.print("Coloque los metros cuadrados del inmueble");
                                double metrosCuadrados = scanner.nextDouble();
                                EspacioDeParqueadero espacioParqueo = new EspacioDeParqueadero(metrosCuadrados);
                                administrador.agregarInmuebleComun(espacioParqueo);
                        }
                            case 4 -> {
                                System.out.print("Coloque los metros cuadrados del inmueble");
                                double metrosCuadrados = scanner.nextDouble();
                                Piscina piscinaNueva = new Piscina(metrosCuadrados);
                                administrador.agregarInmuebleComun(piscinaNueva);
                        }
                            case 5 -> {
                                System.out.print("Coloque los metros cuadrados del inmueble");
                                double metrosCuadrados = scanner.nextDouble();
                                Terraza terrazaNueva = new Terraza(metrosCuadrados);
                                administrador.agregarInmuebleComun(terrazaNueva);
                        }
                            default -> System.out.println("No ha escogido una opcion correcta"); //ver el salir
                        }
                    case 6:
                        System.out.println(administrador.mostrarContratos());
                        
                        break;
                        
                        
                }
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
    }
}
