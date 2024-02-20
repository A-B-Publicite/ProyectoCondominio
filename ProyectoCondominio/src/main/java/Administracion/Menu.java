package Administracion;

import java.util.Scanner;

public class Menu {
    public static void menuAdministracion(Administrador administrador){
        int opcion;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("""
                               Opciones:
                               1. Crear condominio
                               2. Registrar Residente
                               3. Agregar Departamento
                               4. Agregar un Inmueble Comun
                               5. Pagar Contrato
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
                        System.out.print("Ingrese el tamanio de ese Departamento: ");
                        administrador.agregarDepartamento(scanner.nextInt());
                        break;
                    case 4:
                        int opcionInmuebleComun;
                        scanner = new Scanner(System.in);
        
                        System.out.println("""
                                    Opciones:
                                    1. Cancha
                                    2. Condominio
                                    3. Gimnasio
                                    4. Espacio de parqueadero
                                    5. Pagar Contrato
                                    0. Salir
                               """);

                        opcionInmuebleComun = scanner.nextInt();
                        administrador.agregarInmuebleComun(inmuebleComun);
                        break;
                    
                    case 5:
                        
                        break;
                        
                        
                }
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
    }
}
